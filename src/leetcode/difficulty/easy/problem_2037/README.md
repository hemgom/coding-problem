# 2037. Minimum Number of Moves to Seat Everyone
방 하나에 좌석은 `n`개이고 학생도 `n`명이다.  
- 길이가 `n`인 정수 배열 `seats`가 주어지며, `seats[i]`는 `i`번째 좌석의 위치이다.  
- 길이가 `n`인 정수 배열 `students`가 주어지며, `students[j]`는 `j`번째 학생의 위치이다.  

아래의 이동을 횟수 제한 없이 수행한다.  
- `j`번째 학생의 위치를 `1`씩 늘리거나 줄인다. (`j`번째 학생의 위치가 `x`라면 `x+1` or `x-1`로 이동)
- 학생은 같은 위치의 좌석에 앉을 수 없다.

각 학생이 모든 좌석에 앉는데 필요한 최소 이동 횟수를 반환한다.  
처음에 여러 `좌석 또는 학생`이 같은 위치에 있을 수 있다.
### 입력제한
- `n == seats.length == students.length`
- 1 <= `n` <= 100
- 1 <= `seats[i], students[j]` <= 100
### 풀이핵심
- 두 정수 배열을 오름차순으로 정렬한 뒤 각 위치의 요소의 차(절대값)를 구해 비교한다.
### 문제풀이
1. `seats`와 `students`를 오름차순으로 정렬
2. 요소 길이 `n`만큼 아래의 연산을 반복
   - 각 배열의 `i`번째 요소의 차를 구해 절대값을 `moveCount`에 더해 저장
3. `(2)`의 과정을 마치면 `moveCount`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/)
### 태그
`배열 정렬` `Math.abs()`