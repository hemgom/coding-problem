# 2744. Find Maximum Number of String Pairs
중복 없는 문자열로 배열 `words`가 주어진다.  
문자열 `words[i]`는 아래와 같은 경우 `words[j]`와 `한 쌍`이다.  
- `words[j]`는 `words[i]`의 반전된 문자열과 같다.
- `0 <= i < j < words.length`

`words`에서 형성될 수 있는 `한 쌍`의 최대 개수를 반환한다.  
(단, 각 문자열(요소)은 `한 쌍`에만 속할 수 있다.)
### 입력제한
- 1 <= `words.length` <= 50
- `words[i].length()` == 2
- `words`는 문자열로 구성된다.
- `words[i]`는 오직 `영소문자`로 구성된다.
### 풀이핵심
- `words[i]`의 한 쌍을 찾는다 찾은 한 쌍은 다시 재활용할 수 없다.
### 문제풀이
※ __makeReverse(String word)__ : 문자열을 입력받아 반전된 문자열을 반환함
1. `words`를 `List`로 변환해 `onePair`에 저장한다.
2. `onePair`의 크기만큼 아래의 연산을 반복한다.
   - `word`가 `""`와 동일하다면 다음 반복으로 넘어간다.
   - `rWord`의 인덱스가 `-1`이거나 현재 인덱스와 같다면 다음 반복으로 넘어간다.
   - `result`의 값을 `1` 증가시킨다.
   - `word`를 `""`로 수정한다.
   - `rWord`를 `""`로 수정한다.
3. `(2)`의 과정이 끝났다면 `result`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/find-maximum-number-of-string-pairs/)
### 태그
`문자열 반전` `List` `ArrayList` `indexOf()`