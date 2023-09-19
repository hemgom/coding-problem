# 1832. Check if the Sentence Is Pangram
`pangram`은 문장에 알파벳의 모든 글자가 한 번 이상 등장하는 문장을 말한다.  
`영소문자`만으로 이루어진 문자열 `sentence`가 주어질 때, `pangram`이라면 `true`를 아니라면 `false`를 반환한다.
### 입력제한
- 1 <= `sentence.length()` <= 1000
- `sentence`는 `영소문자`로만 구성된다.
### 풀이핵심
- `sentence`가 모든 소문자 알파벳을 한 번 이상 사용했다면 `pangram`이다.
### 문제풀이
1. 중복된 요소를 가지지 않는 `HashSet<Character> alphabet`을 생성한다.
2. `sentence`의 문자 개수만큼 아래의 연산을 반복한다.
   - `alphabet`에 `sentence`의 문자를 순차적으로 추가한다.
3. `(2)`의 과정을 마친 후 `alphabet`의 크기가 `26`이라면 `true`, 아니라면 `false`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
### 태그
`HashSet`