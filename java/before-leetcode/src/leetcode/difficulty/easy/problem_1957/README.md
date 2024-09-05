# 1957. Delete Characters to Make Fancy String
`fancy string`은 같은 문자가 연속적으로 3개이상인 경우를 포함하지 않는 문자열을 말한다.   
문자열 `s`가 주어질 때 `s`의 문자 중 최소한의 제거를 통해 `fancy string`을 만든다.  
문자 제거 후 최종적으로 `fancy string`을 반환한다.
### 입력제한
- 1 <= `s.length` <= 10<sup>5</sup>
- `s`는 오직 `영소문자`로만 구성된다.
### 풀이핵심
- `삼단논법`을 통해 생각해보면
  - `s.charAt[i] == s.charAt[i+1]`이고 `s.charAt[i+1] == s.charAt[i+2]`이면 `s.charAt[i] == s.charAt[i+2]`이다.
- `sameCount`라는 변수를 통해 연속된 횟수를 저장한다.
  - `sameCount == 2`라면 동일한 문자가 연속으로 3개 존재한다는 걸 알 수 있다.
### 문제풀이
1. `s`의 첫 번째 문자를 `StringBuilder fancyString`에 추가한다.
2. `s`의 두 번째 문자부터 마지막 문자까지 순차적으로 조건문을 수행한다.
3. 인덱스가 `i`인 문자와 `i-1`인 문자를 비교한다.
   1. 같다면 `sameCount`를 `1`증가 시킨다.
      - `sameCount < 2`인 경우에만 `fancyString`에 문자를 추가한다.
   2. 다르다면 `sameCount`를 `0`으로 초기화한다.
      - `fancyString`에 문자를 추가한다.
4. 최종적으로 `fancyString`에 저장된 문자열을 반환한다. 
### 문제출처
- [leetcode](https://leetcode.com/problems/delete-characters-to-make-fancy-string/)
### 태그
`문자열` `반복문` `조건문` `StringBuilder` `charAt`