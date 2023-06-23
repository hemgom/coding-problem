# 2574. Left and Right Sum Differences
정수형 배열 `nums`가 주어질 때, 정수형 배열 `answer`를 구해 반환한다.
- `nums.length == answer.length`
- `answer[i] = |leftSum[i] - rightSum[i]|`

`nums`의 어떠한 인덱스 `i`를 타겟으로 할 때  
- `leftSum[i]`는 `i`를 기준으로 왼쪽 요소들의 합을 뜻하며 없을 경우 `0`  
- `rightSum[i]`는 `i`를 기준으로 오른쪽 요소들의 합을 뜻하며 없을경우 `0`
### 입력제한
- 1 <= nums.length <= 1000
- 1 <= nums[i] <= 10ⁿ (n = 5)
### 풀이핵심
- `nums`에서 어떠한 인덱스 `i`를 타겟으로 삼고 `leftSum - rightSum`의 절대값을 구하면 된다.
### 문제풀이
1. 어떠한 인덱스 `i`가 타겟팅 되었을 때 `leftSum`과 `rightSum`을 구하는 메서드를 만들어 준다.
   - `leftSum(int[] nums, int i)` : 인덱스 `0`부터 `i-1`까지 요소들의 합을 구함
   - `rightSum(int[] nums, int i)` : 인덱스 `nums.length-1`부터 `i+1`까지 요소들의 합을 구함
2. 반복문을 통해 `nums`의 인덱스 값을 순차적으로 불러온다.
   - `answer[i]`에 `leftSum(nums, i) - rightSum(nums, i)`의 절대값을 저장한다.
   - 절대값의 경우 `Math 클래스`의 `abs()`를 사용해준다. 
3. 결과 요소들이 저장되어있는 `answer`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/left-and-right-sum-differences/)
### 태그
`반복문` `배열` `절대값 - Math.abs()`