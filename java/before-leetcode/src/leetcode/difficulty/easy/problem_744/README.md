# 744. Find Smallest Letter Greater Than Target
문자 배열 `letters`와 문자 `target`이 주어진다.  
`letters`에는 다른 문자가 적어도 2개 존재한다.  
글자에서 사전순으로 `target`보다 뒤에 있는 문자들 중 가장 빠른 순의 문자를 반환한다.  
만약 조건에 부합하는 문자가 존재하지 않는다면 `letters[0]`을 반환한다.
### 입력제한
- 2 <= `letters.length` <= 10⁴
- `letters[i]`와 `target`는 영소문자이다.
- `letters`는 내림차순이 아닌 순서로 정렬된다.
- `letters` 적어도 다른 2개의 문자로 구성된다.
### 풀이핵심
- 해당 문제에서 순서의 기준은 `사전순`이다.
- 즉, `target`보다 느린 순서의 문자들 중 가장 빠른 순서인 문자를 반환한다.
  - 없다면 `letters[0]`을 반환한다.
### 문제풀이
1. `minASCII`를 `'z'`의 10진수 값보다 `1`큰 `123`으로 초기화한다.
2. `letters`의 요소들의 수만큼 아래의 연산을 반복한다.
    - `letter`가 `target`보다 순서가 빠르거나 같다면 다음 반복을 진행한다.
    - `letter`가 `target`보다 순서가 느릴 경우 `minASCII`와 비교해 `minASCII`를 갱신한다.
      - `minASCII`보다 빠른 순서의 `letter`가 있다면 `minASCII`에 `letter`를 저장한다.
3. `minASCII`가 초기값 그대로라면 `letters[0]`를 반환한다.
4. `(3)`의 경우에 해당하지 않는다면 `minASCII`를 문자로 형변환해 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
### 태그
`사전순(오름차순)`