# 821. Shortest Distance to a Character
문자열 `s`와 문자열을 구성하는 문자 `c`가 주어진다.  
인덱스 `i`가 있을 때 `i`에 위치한 `s`의 문자와 가장 가까운 `c`의 거리를 `answer[i]`에 저장한다.  
- 정수 배열 `answer`의 길이와 문자열 `s`의 길이는 같다.

연산 후 `answer`를 반환한다.  
(단, `거리`는 절대값이다.)
### 입력제한
- 1 <= `s.length()` <= 10⁴
- `s`의 요소와 `c`는 `영소문자`이다.
- `s`가 `c`를 적어도 하나 이상 가지고 있음을 보장한다.
### 풀이핵심
- `c`는 `s`에 적어도 하나 이상 포함되어있다.
- `s`의 각 문자와 가장 가까운 `c`의 거리를 반환할 정수 배열에 저장한다.
### 문제풀이
1. `s`의 길이와 같은 정수 배열 `answer`를 생성한다.
2. 인덱스 `i`를 기준으로 전/후로 존재하는 `c`의 인덱스를 구한다.
   - `before` : `i >= j` 범위에서 가장 가까운 `j`의 값을 저장
   - `after` : `i <= j` 범위에서 가장 가까운 `j`의 값을 저장
   - 만약 `j`가 존재하지 않아 `-1`의 값을 가질 경우 변수에 `Integer.MAX_VALUE`를 저장
     - 존재하지 않는다면 다른 변수가 가장 가까운 `c`의 위치가 되야 하므로
   - `distance`에 좀 더 짧은 거리를 저장 후, 이를 `answer[i]`에 저장
3. `(2)`의 과정을 `s`의 길이만큼 반복 후 `answer`를 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/shortest-distance-to-a-character/)
### 태그
`문자열 인덱스 연산` `Math.abs()` `Math.min()` `indexOf()` `lastIndexOf()`