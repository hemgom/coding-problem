# 2016. Maximum Difference Between Increasing Elements
크기가 `n`인 `0-indexed` 정수형 배열인 `nums`가 주어진다.   
`0 <= i < j <= n`이고 `nums[i] < nums[j]`일 때  
`nums[j] - nums[i]`의 최대 값을 구해 반환한다.  

만약, 입력된 배열이 조건에 부합하지 않을 경우 `-1`을 반환한다.
### 입력제한
- n == nums.length
- 2 <= n <= 1000
- 1 <= nums[i] <= 10ⁿ (n = 9)
### 풀이핵심
문제를 쓸데없이 꼬았지만 결국 하는 말은 아래와 같다.
- `nums[i]`보다 큰 인덱스 값과 저장 값을 가진 `nums[j]`에서 `nums[i]` 뺀다.
- 그러한 여러 결과 값들 중에서 제일 큰 값을 반환한다.
- 만약 `maximum difference` 값이 `0`보다 작거나 같을 경우 `-1`을 반환한다.
### 문제풀이
1. 배열의 마지막 요소`nums[nums.length-1]`를 제외하고 순차적으로 요소를 읽는다.
2. 읽어온 요소의 인덱스 보다 큰 인덱스를 가진 요소들과 `-`연산을 한다.
3. 연산 결과를 저장하며 저장된 값보다 큰 경우 저장 값을 변경한다.
4. 최종적으로 저장된 결과 값이 `0` 보다 작거나 같은 경우 `-1`을 반환한다.
   - 이외의 경우 저장된 결과 값을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/maximum-difference-between-increasing-elements/)
### 태그
`배열` `최대 차(maximum difference)`