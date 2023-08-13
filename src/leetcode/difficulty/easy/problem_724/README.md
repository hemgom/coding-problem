# 724. Find Pivot Index
정수 배열 `nums`가 주어지면 `pivot index`를 구한다.  
- 특정 인덱스를 기준으로 했을 때 왼쪽의 모든 요소의 합과 오른쪽의 모든 요소의 합이 같다면 해당 인덱스는 `pivot index`이다.
- 예를 들어 기준 인덱스가 `0`일 경우 왼쪽 요소의 합은 `0`이다.
  - 이는 기준 인덱스가 배열의 마지막 인덱스일 때도 동일하게 적용된다.

`pivot index`가 여러개라면 가장 작은 것을 반환한다.  
만약 존재하지 않는다면 `-1`을 반환한다.
### 입력제한
- 1 <= `nums.length` <= 10⁴
- -1000 <= `nums[i]` <= 1000
### 풀이핵심
- 포인터용 인덱스를 `0 ~ nums.length`으로 순차적으로 움직여 왼쪽 요소의 합을 구한다.
- 왼쪽 요소의 합을 통해 오른쪽 요소의 합과 같은지 비교한다.
### 문제풀이
1. `nums`의 모든 요소의 합을 `sumNums`에 저장한다.
2. 포인터 인덱스를 `i`라고 했을 때 `nums`의 요소를 순차적으로 읽는다.
    - 만약 `sumLeft * 2`가 `sumNums - nums[i]`와 같다면 `i`를 반환한다.
      - 좌우 요소 합이 같다면 `sumLeft + sumRight = sumLeft * 2`
      - `sumNums = sumLeft + sumRight + nums[i]`이기 때문
    - 만약 포인터 인덱스에서 조건을 만족하지 못한다면
      - `sumLeft`에 `nums[i]`를 더해 저장한다.
3. 만약 `(2)`의 과정에서 `i`를 반환하지 못하면 `pivot index`가 없으므로 `-1`은 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/find-pivot-index/)
### 태그
`배열 요소 합의 비교`