# 506. Relative Ranks
`n` 크기의 정수형 배열 `score`가 주어진다.  
`score[i]`는 대회에서 `i`번째 선수의 점수이며 모든 점수는 고유하다.  

`answer[i]`에는 `i`번째 선수의 순위가 저장된다.
- `1위`의 경우 순위는 `"Gold Medal"`
- `2위`의 경우 순위는 `"Silver Medal"`
- `3위`의 경우 순위는 `"Bronze Medal"`
- `4위`부터 `n위`까지의 순위는 해당 선수의 순위 번호  

`n`크기의 문자열 배열을 반환한다.
### 입력제한
- `n == score.length`
- 1 <= `n` <= 10⁴
- 0 <= `score[i]` <= 10<sup>6</sup>
- `socre`의 모든 요소는 고유한 값이다.
### 풀이핵심
- 인덱스 `i`가 있다면 이를 `유지(i번째 선수)`하며 각 선수의 등수를 배열 요소로 저장한다.
### 문제풀이
1. `score`의 모든 요소를 `HashMap<Integer, String> scoreMap`에 저장한다.
   - `scoreMap`의 경우 `key`값으로 선수들의 점수인 `score[i]`를 가지며 `value`값으로 선수들의 순서 `i`를 가진다.
2. `socre`를 오름차순으로 정렬한다. (등수가 낮은 선수부터 높은 순으로 정렬됨)
3. 정렬된 `score`의 마지막 인덱스부터 `0`까지 요소를 가지고 아래의 내용을 수행한다.
   - `score의 요소(key)`를 가지고 `scoreMap`에서 `value` 값을 찾는다.
   - `value` 값은 결국 선수의 위치이므로 `answer[value]`에 순위를 저장한다.
4. 마지막 인덱스부터 순차적으로 `Gold Medal` `Silver Medal` `Bronze Medal`을 저장한다.
   - 그 외의 순위는 `4`부터 시작해 순차적으로 `1`씩 증가시켜 저장한다.
     - 단 반환 타입이 `String[]`이므로 `String.valueOf()`으로 변환해 저장한다.
   - 또한 `score.length`에 따라 바로 결과값을 반환하도록 한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/relative-ranks/)
### 태그
`String.valueOf()` `HashMap` `Arrays.sort()` `배열`