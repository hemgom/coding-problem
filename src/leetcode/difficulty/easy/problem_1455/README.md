# 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
공백으로 구분된 문자열 `sentence`와 검색할 단어 문자열 `searchWord`가 주어진다.  
`searchWord`가 `sentence`의 단어들 중 어떤 단어의 접두사인지 확인한다.  
- `searchWord`가 `sentence`의 몇 번째 단어의 접두사인지를 반환한다.
- 만약 2개 이상의 단어가 있다면 앞 단어의 순서를 반환한다.
- `searchWord`를 접두사로 하는 단어가 `sentence`에 없다면 `-1`을 반환한다.

문자열 `s`의 접두사는 `s 앞쪽의 연속 하위 문자열`이다.
### 입력제한
- 1 <= `sentence.length()` <= 100
- 1 <= `searchWord.length()` <= 10
- `sentence`는 `영소문자`와 `공백문자`로 구성된다.
- `searchWord`는 `영소문자`로 구성된다.
### 풀이핵심
- `sentence`를 `" "`으로 구분한 단어들의 `searchWord`의 위치를 확인한다.
  - 만약 `0`의 위치를 가진 단어를 찾았다면 해당 단어가 몇 번째인지 반환한다.
### 문제풀이
1. `" "`을 구분자로하여 `sentence`의 단어들을 문자열 배열 `words`에 저장한다.
   - 현재 `sentence`의 몇 번째 단어를 확인하지 `count`에 저장한다.
2. `words`의 요소 개수만큼 아래의 연산을 반복한다.
   - `count`의 값을 `1` 증가시킨다.
   - 만약 `word.indexOf(searchWord)`의 값이 `0`일 경우
     - 해당 단어가 `searchWord`를 접두사로 사용하고 있으므로 `count`를 반환한다.
3. `(2)`의 과정을 모두 마쳤다면 `searchWord`를 접두사로하는 단어는 없다는 뜻이므로 `-1`을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/)
### 태그
`접두사` `부분 문자열 확인`