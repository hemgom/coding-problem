# 1512. Number of Good Pairs
정수 배열 `nums`가 주어질 때 `좋은 쌍`의 수를 반환한다.  
- 좋은 쌍이란, 아래의 조건을 모두 만족하는 `(i, j)` 한 쌍을 말한다.
  1. `nums[i] == nums[j]`
  2. `i < j`
### 입력제한
- 1 <= `nums.length` <= 100
- 1 <= `nums[i]` <= 100
### 풀이핵심
- `nums`의 요소들을 순차적으로 꺼내 비교한다.
- 비교 할 때 `nums[i]`보다 큰 인덱스를 가진 요소들하고 비교하면 된다.
### 문제풀이
1. `for문`을 통해 `nums`의 요소를 순차적으로 꺼내 `numCheckSame()`을 수행한다.
   - 반복 횟수는 `nums.length - 1`이다. 마지막 요소는 어처피 조건을 만족하지 못한다.
   - `numCheckSame(int[] nums, int num, int index)`
      - 지정한 요소와 요소의 인덱스를 입력받는다.
      - 입력 요소의 인덱스보다 큰 인덱스를 가진 요소들과 입력 요소를 비교해 같은 경우의 수를 카운팅한다.
2. `result`에 `numCheckSame()`의 결과를 더해 저장한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/number-of-good-pairs/)
### 태그
`배열` `반복문`