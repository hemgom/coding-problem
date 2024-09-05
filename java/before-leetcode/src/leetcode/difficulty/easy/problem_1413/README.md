# 1413. Minimum Value to Get Positive Step by Step Sum
정수 배열 `nums`가 주어질 때, 초기 양수 값 `startValue`으로 연산을 시작 할 수 있다.  
`startValue + nums[0]`을 시작으로 해당 결과를 다음 요소와 더 해 또 결과 내기를 반복한다.  
이 과정에서 요소마다 결과가 `1`보다 작지 않도록하는 `startValue`중 가장 작은 양수를 반환한다.
### 입력제한
- 1 <= `nums.length` <= 100
- -100 <= `nums[i]` <= 100
### 풀이핵심
- 반환 값이 `제일 작은 양수`이므로 `startValue`는 `1`부터 시작한다.
  - 만약 `1`로 연산을 시작했을 때 조건을 만족하지 못한다면 그 다음 양수인 `2`에 대해 연산한다.
  - 조건에 맞는 `startValue`가 나올 때까지 해당 변수를 `1`씩 증가시켜 연산을 반복한다.
### 문제풀이
__minStartValue(int[] nums)__
1. `1`의 값을 가진 `startValue`를 생성한다.
2. `stepByStepSum()`의 결과가 `false`일 경우 `startValue`의 값을 `1` 증가시킨다.
   - 만약 `true`라면 `startValue`를 반환한다.  

__stepByStepSum(int[] nums, int startValue)__
   - `startValue += nums[i]`의 연산을 `nums[nums.length-1]`까지 반복한다.
   - 단, 합의 결과들 중 `startValue < 1`인 경우가 있다면 `false`를 반환한다.
   - 모든 요소의 합의 결과가 `1`보다 크거나 같다면 `true`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/)
### 태그
`단계별 연산 결과 비교`