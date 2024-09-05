# 495. Teemo Attacking
`티모`가 `애쉬`를 공격하고 있다.  
이 때, `애쉬`는 `duration(초)` 동안 독에 중독된다. 
- `timeSeries[i]`는 중독(공격)이 시작되는 시간이다.
- `애쉬`는 `timeSeries[i]`부터 `timeSeries[i] + duration - 1`까지 중독된다.
  - 즉, `timeSeries[i] + duration`은 중독이 풀리는 시간이다.
- 만약 중독이 풀리기 전 다시 공격을 받으면 `duration`이 초기화 된다.

정수 배열 `timeSeries`와 정수 `duration` 주어질 때 `애쉬`가 중독된 시간을 반환한다.
### 입력제한
- 1 <= `timeSeries.length` <= 10⁴
- 0 <= `timeSeries[i], duration` <= 10<sup>7</sup>
- `timeSeries`의 요소는 오름차순으로 정렬되어있다.
### 풀이핵심
- `중독 시간`뿐만 아니라 `총 시간`도 신경써야 한다.
  - `중독 시간` : `duration`을 계속 더해 나가면 됨
    - 단, 중독 도중 다시 중독 되면 `duration`이 초기화 되므로 겹치는 시간 만큼 차감해야 함
  - `현재 시간` : `timeSeries[i]`가 중독 시작 시간이므로 현재 시간이라 할 수 있다.
  - `총 시간` : 중독이 풀리기 직전이다. `+1(초)`가 되면 중독이 풀린다.
### 문제풀이
1. 아래의 변수를 생성해 초기화한다.
   - `poisonSecond` : 중독된 시간을 저장, 초기값 `0`
   - `totalSecond` : 중독이 풀리기 직전의 시간을 저장, 초기값 `-1`
     - `timeSeries[i]`가 가질 수 있는 값 범위가 `0`부터이므로 `-1`을 초기값으로 한다.
2. `timeSeries`의 요소 개수만큼 아래의 연산을 반복한다.
   - `poisonSecond`에 `duration`을 더해 저장
   - 만약 `totalSecond`가 `t`보다 크거나 같을 경우, 중독 도중에 다시 중독된 상황이다.
     - `poisondSecond`에서 `totalSecond - t + 1`를 빼고 저장
   - `t(현재시간)`에 `t -1`을 더해 `totalSecond`에 저장
3. `(2)`의 과정이 끝났다면 `poisonSecond`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/teemo-attacking/)
### 태그
`디버프 총 유지 시간` `디버프 초기화`