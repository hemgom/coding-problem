# 500. Keyboard Row
단어를 요소로 가지는 문자열 배열 `words`가 주어진다.  
키보드의 각 줄마다 속한 알파벳으로만 이루어진 단어들을 찾아 반환한다.  

키보드의 각 줄에 속한 알파벳은 다음과 같다.
- 첫 번째 줄 "qwertyuiop", 알파벳으로 구성된다.
- 두 번째 줄 "asdfghjkl", 알파벳으로 구성된다.
- 세 번째 줄 "zxcvbnm", 알파벳으로 구성된다.
### 입력제한
- 1 <= `words.length` <= 20
- 1 <= `words[i].length()` <= 100
- `words[i]`는 영문자(소문자와 대문자 모두)로 구성된다.
### 풀이핵심
- `words[i]`가 키보드의 각 행에 속한 알파벳으로만 구성되어 있는지 확인한다.
### 문제풀이
1. `words`의 요소를 `word`라고 했을 때, 모든 문자를 소문자로 바꿔준다.
   - `lowerWord`에 해당 문자열을 저장한다.
2. `lowerWord`의 첫 번째 글자를 `firstLetter`에 문자열로 저장한다.
3. `firstLetter`가 속한 키보드 행을 찾는다.
   - 속한 행을 찾았다면 `lowerWord`와 함께 파라미터로해 `checkWord()`을 수행한다.
4. `lowerWord`의 각 글자가 속한 행에 존재하는지 확인한다.
   - 속한다면 `1`을 반환 없다면 `0`을 반환한다.
5. `checkResult`에 `(4)`의 반환 값을 저장한다.
6. `(5)`의 반환 값이 `1`일 때 `List<String> result`에 `word`를 저장한다.
7. `(1) ~ (6)`의 과정을 `words`의 요소 수 만큼 반복한다.
8. `List`를 문자열 배열로 변환하여 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/keyboard-row/)
### 태그
`toLowerCase()` `substring()` `contains()` `toArray()` `indexOf()` `charAt()`