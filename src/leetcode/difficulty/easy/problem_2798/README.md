# 2798. Number of Employees Who Met the Target
회사에는 `0`에서 `n-1`까지 번호가 매겨진 `n`명의 직원이 있다.  
각 직원 `i`는 회사에서 `hours[i]`시간 동안 근무한 상태이다.  

회사는 각 직원이 `최소 목표 시간`만큼 일하도록 요구한다.  

길이 `n`의 음수가 아닌 정수의 시간으로 구성된 `hours`와 정수의 `target`이 주어질 때  
`target`이상으로 근무한 직원의 수를 반환한다.
### 입력제한
- 1 <= `n` == `hours.length` <= 50
- 0 <= `hours[i], target` <= 10<sup>5</sup>
### 풀이핵심
- 문제가 풀이 코드보다 길다...
- `hours`에서 `target`보다 크거나 같은 요소의 개수를 반환한다.
### 문제풀이
1. `hours`의 요소를 순차적으로 읽는다.
2. 만약 `hours[i]`가 `target`보다 크거나 같다면 `finishEmployee`를 `1` 증가시킨다.
3. `(1) ~ (2)`의 과정이 끝났다면 `finishEmployee`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/number-of-employees-who-met-the-target/)
### 태그
`배열 요소 비교`