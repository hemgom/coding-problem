# 2224. Minimum Number of Operations to Convert Time
시간을 나타내는 2개의 문자열 잘못된 시간 `current`와 옳은 시간 `correct`가 주어진다.  
시간 표현은 `"HH:MM"` 형식이며, 각 자리의 범위는 아래와 같다.
- HH : 00 ~ 23, MM : 00 ~ 59

시간의 범위는 `00 : 00 ~ 23 : 59`이다.  
연산을 통해 `current`를 `correct`로 맞춰야하는데 연산 조건은 아래와 같다.
- 1분 증가, 5분 증가, 15분 증가, 60분 증가

연산은 여러번 수행가능하며, 올바른 시간으로 수정하는데 필요한 최소한의 연산 횟수를 반환한다.
### 입력제한
- `current`와 `correct`의 표현은 `"HH:MM"`이다.
- `current <= correct`
### 풀이핵심
- 입력제한을 보면 `correct`가 `current`보다 늦거나 같은 시간이지만, 사실 다음 날일 경우도 예상해 풀이를 진행했다.
- `current`와 `correct`를 `분`단위로 변환 후 연산을 진행한다.
### 문제풀이
1. `current`와 `correct`를 `분`단위로 변환한다.
2. `currentMinutes`와 `correctMinutes`를 비교한다.
   1. `currentMinutes`가 클 경우 `1440 - currentMinutes + correctMinutes`를 `subMinutes`에 저장한다.
   2. `correctMinutes`와 같거나 클 경우 `correctMinutes - currentMinutes`를 `subMinutes`에 저장한다.
3. `subMinutes`의 값을 비교해서 `0`이 될 때까지 연산 수행을 반복한다.
   - `1, 5, 15, 60`으로 `subMinutes`를 나누고 몫은 `count`에 더해 저장한다.
   - 나머지는 `subMinutes`에 저장한다.
4. (3)의 과정을 반복 후 `count`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/)
### 태그
`반복문` `조건문`