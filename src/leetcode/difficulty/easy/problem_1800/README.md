# 1800. Maximum Ascending Subarray Sum
양의 정수의 배열 `nums`가 주어 질 때, 요소가 오름차순인 하위 배열의 요소 합들 중 가장 큰 값을 반환한다.  
또한 하위 배열은 연속된 숫자 시퀀스를 가집니다.
- 하위 배열 [nums<sub>l</sub>, nums<sub>l+1</sub>, ..., nums<sub>r-1</sub>, nums<sub>r</sub>]은 아래와 같다.
  - 모든 `i`에 대해서 `l <= i < r`, nums<sub>i</sub> < nums<sub>i+1</sub>인 경우 오름차순이다.
  - 크기가 `1`인 하위 배열은 오름차순이다.
### 입력제한
- 1 <= `nums.length` <= 100
- 1 <= `nums[i]` <= 100
### 풀이핵심
- 문제가 쓸데 없이 꼬여있을 뿐 핵심은 간단하다.
- `nums`로 만들 수 있는 여러 하위 배열들 중 아래의 조건을 충족하는 하위 배열의 요소합이 가장 큰 경우를 반환한다.
  - 하위 배열은 `nums`의 연속적인 인덱스를 가진 요소로 구성된다.
  - 하위 배열의 요소가 오름차순이어야 한다.
### 문제풀이
1. 아래의 변수를 생성하고 `0`으로 초기화한다.
   - `previousNum` : 이전 요소를 저장한다.
   - `subArraySum` : 하위 배열 요소들의 합을 저장한다.
   - `maxSubArraySum` : 하위 배열 요소들의 합 중 가장 큰 값을 저장한다.
2. 문제에서 원하는 하위 배열의 조건 2가지를 만족시킨다.
   1. 하위 배열의 요소들은 연속된 인덱스(`nums`의 인덱스)를 가져야한다.
      - 어처피 `for문`을 통해 순차적으로 `nums`의 요소를 읽을 생각이므로 이 부분은 해결!
   2. 하위 배열의 요소들의 값은 오름차순이어야 한다.
      - `previousNum`과 비교해 `num`이 크다면 해당 부분을 만족한다. `subArraySum += num`을 수행한다.
        - 그 외의 경우 조건을 만족하지 못하므로 `subArraySum`에 `num`을 저장해 새로운 하위 배열의 요소합을 구하기 시작한다.
      - 비교 후 `previousNum`에 `num` 값을 저장한다.
3. 보다 값이 큰 `subArraySum`이 생기면 `maxSubArraySum`을 갱신한다.
4. `(2) ~ (3)`의 과정을 `nums`의 요소 개수만큼 반복 후에 `maxSubArraySum`을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/maximum-ascending-subarray-sum/)
### 태그
`하위 배열의 합` `배열`