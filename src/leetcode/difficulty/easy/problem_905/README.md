# 905. Sort Array By Parity
정수 배열 `nums`가 주어지면, 배열의 짝수 요소를 배열 앞 쪽으로 홀수 요소를 뒤 쪽으로 모두 이동한다.  
모든 요소를 재배치한 정수 배열을 반환한다.
### 입력제한
- 1 <= `nums.length` <= 5000
- 0 <= `nums[i]` <= 5000
### 풀이핵심
- `nums`의 요소가 짝수(`0`포함)면 배열 앞부터 순차적으로 저장, 홀수면 뒤부터 순차적으로 저장한다.
### 문제풀이
1. `evenPointer`에 짝수를 저장할 인덱스를, `oddPointer`에는 홀수를 저장할 인덱스를 저장한다.
2. `nums[i]`에 따라 아래의 연산을 반복한다.
    - 짝수인 경우
      - `reformat`의 `evenPointer`위치에 `nums[i]`를 저장한다.
      - `evenPionter`를 `1`증가시킨다.
      - 다음 반복으로 넘어간다.
    - 홀수인 경우
      - `reformat`의 `oddPointer`위치에 `nums[i]`를 저장한다.
      - `oddPointer`를 `1`증가시킨다.
3. `(2)`의 반복이 끝나면 `reformat`을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/sort-array-by-parity/)
### 태그
`배열 요소 재배치`