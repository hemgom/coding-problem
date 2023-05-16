# 1827.Minimum Operations to Make the Array Increasing
정수 배열 nums 가 입력 될 때, 배열에 저장된 값 중 하나의 값을 선택해 그 값을 1을 증가시킨다.  
예를 들어 nums = [1,2,3] 라고 했을 때, nums[1] 을 선택할 경우 nums = [1,3,3] 이 된다.  
이러한 연산 방식을 가질 때 입력된 nums 배열에 저장된 값이  
nums[i] < nums[i+1] < ... < nums[nums.length-1] 이 되도록 연산 횟수를 반환한다.
### 입력제한
- 1 <= nums.length <= 5000
- 1 <= nums[i] <= 10⁴
### 문제풀이
1. 입력된 배열에 저장된 값을 순차적으로 확인하다.
2. 만약 nums[i] >= nums[i+1] 인 경우 nums[i] < nums[i+1] 가 될 때까지 정해진 연산을 반복한다.
3. 연산을 수행 할 때마다 결과 변수에 1을 추가하고 (2)의 경우가 완료되면 변수의 값을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/)
