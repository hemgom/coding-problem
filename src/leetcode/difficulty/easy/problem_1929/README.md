# 1929. Concatenation of Array
길이 `n`의 정수형 배열 `nums`가 주어진다.  
길이 `2n`의 정수형 배열 `ans`를 만들고 `nums`의 값을 순차적으로 저장한다.  
단, 길이가 늘어난 만큼 한 번더 순차적으로 저장한다.  
즉, `ans`는 2개의 `nums`가 이어진 배열이다.
### 입력제한
- n == nums.length
- 1 <= n <= 1000
- 1 <= nums[i] <= 1000
### 문제풀이
1. `nums` 길이의 2배인 `ans` 배열을 생성한다.
   - `nums.length` x 2 = `ans.length`
2. `nums` 인덱스 `i`에 저장된 값을 저장된 값을 `ans` 인덱스 `i`와 `nums.length+i`에 저장한다.
   - `nums[i]` == `ans[i]` & `ans[nums.length+i]`
3. 결과적으로 `nums` 2개를 연결한 `ans`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/concatenation-of-array/)