# 2185. Counting Words With a Given Prefix
단어들을 포함한 문자열 배열 `words`와 접두사 `pref`가 주어진다.  
단어들 중에 접두사가 포함된 단어의 개수를 반환하다.
### 입력제한
- 1 <= `words.length` <= 100
- 1 <= `words[i].length`, `pref.length()` <= 100
- `words[i]`와 `pref`는 영소문자로 구성된다
### 풀이핵심
- 단어의 길이와 접두사의 길이를 비교한 결과에 따라 단어가 접두사를 가졌는지 확인한다.
- 접두사는 결국 단어의 앞부분에 해당하므로 단어의 처음부터 접두사의 길이 만큼만 잘라 비교한다.
### 문제풀이
- `prefixCount(int wordSize, int prefSize)`
  - 단어길이와 접두사의 길이를 비교해 특정 정수 값을 반환한다.
- `prefixCount(String[] words, String pref)`
  - 특정 정수 값에 따라 단어가 접두사를 포함하고 있는지 확인하고 포함된 경우의 수를 반환한다.
1. 입력 받은 `pref`의 길이를 구한다.
2. 입력 받은 `words`에서 단어들을 하나씩 꺼낸다.
3. `word[i]`와 `pref`의 길이에 따라서 `collectCount`에 값을 더해 저장한다.
   - `word[i].length()` > `pref.length()` : 접수사의 길이 만큼 단어의 앞부분을 잘라 비교한다.
   - `word[i].length()` = `pref.length()` : 단어와 접두사가 같은지 학인한다.
   - `word[i].length()` < `pref.length()` : 단어에 접두사가 포함될 수 없는 경우다.
### 문제출처
- [leetcode](https://leetcode.com/problems/counting-words-with-a-given-prefix/)
### 태그
`switch-case` `문자열(String) 비교`