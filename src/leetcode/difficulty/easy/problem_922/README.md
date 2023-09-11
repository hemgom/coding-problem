# 922. Sort Array By Parity II
정수 배열 `nums`가 주어질 때, 배열에 포함된 요소의 절반은 홀수, 절반은 짝수이다.  
`nums[i]`가 홀수라면 `i`가 홀수인 위치에 짝수라면 짝수인 위치에 있도록 한다.  
위의 조건을 만족하는 정수 배열을 반환한다.
### 입력제한
- 2 <= `nums.length` <= 2 * 10⁴
- `nums.length`는 짝수이다.
- `nums`의 요소 절반은 짝수이다.
- 0 <= `nums[i]` <= 1000
### 풀이핵심
- 짝수 요소는 짝수 인덱스에 홀수 요소는 홀수 인덱스에 위치하도록 한다.
### 문제풀이
1. `nums`의 요소수 만큼 아래의 연산을 반복한다.
   - `num`이 짝수일 경우
     - `result[even]`에 `num`을 저장하고 `even`에 `2`를 더해 저장
   - `num`이 홀수일 경우
     - `result[odd]`에 `num`을 저장하고 `odd`에 `2`를 더해 저장
2. `(1)`의 과정을 마쳤다면 `result`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/sort-array-by-parity-ii/)
### 태그
`홀수 & 짝수` `배열 요소 비교`