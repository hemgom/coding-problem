# 2011. Final Value of Variable After Performing Operations
4개의 연산과 하나의 변수`x`만 있는 프로그래밍 언어가 있다.  
`++X` 또는 `X++`는 변수 `x`의 값을 1씩 증가시킨다.  
`--X` 또는 `X--`는 변수 `x`의 값을 1씩 감소시킨다.  
`X`의 초기 값은 `0`이다.  
연산 목록이 포함된 `문자열`연산 배열이 주어졌을 때, 모든 연산 수행 후 `x`를 반환한다.
### 입력제한
- 1 <= operations.length <= 100
- operations[i] 값으로는 `"++X"`, `"X++"`, `"--X"`, `"X--"`만 가질 수 있다.
### 문제풀이
1. 입력 받은 `operations`에서 순차적으로 값을 꺼내 확인 후 연산을 한다.
   1. `"++X"` 또는 `"X++"`일 경우 `x`에 `+1` 연산
   2. `"--X"` 또는 `"X--"`일 경우 `x`에 `-1` 연산
### 문제출처
- [leetcode](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/)
### 태그
`문자열 비교`