# 1299. Replace Elements with Greatest Element on Right Side
영소문자로 구성되는 `words[i]`를 요소로하는 문자열 배열 `words`가 주어진다.  
임의의 인덱스 `i`를 선택해 아래의 연산을 수행한다.  
- `i`는 `0 < i < words.length` 범위이다.
- `words[i]`가 `words[i-1]`의 애너그램일 때 `words[i]`를 삭제한다.

모든 연산을 수행 후 남은 단어들을 반환한다.

애너그램은 단어의 문자를 정확히 한 번씩 사용하여 재배열해 만든 단어이다.
### 입력제한
- 1 <= `words.length` <= 100
- 1 <= `words[i].length` <= 10
- `words[i]`는 영소문자로 구성된다.
### 풀이핵심
- 선택한 요소가 이전 요소의 `anagram`일 경우 삭제한다.
- 맨 처음 요소는 이전 요소가 없으므로 반환 값에 무조건 포함된다.
- `makeAnagram(String word)`를 통해 `words[i]`의 문자를 오름차순으로 정렬한다.
### 문제풀이
1. 결과 `List<String> anagramWord`에 `words[0]`을 저장한다.
2. `words`의 인덱스 `1 ~ words.length-1` 동안 아래의 과정을 반복해 수행한다.
   - `words[i]`와 `words[i-1]`을 `makeAnagram()`를 통해 같은지를 확인한다.
   - 같지 않을 경우 `anagramWord`에 `words[i]`를 추가한다.
3. `anagramWord`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/)
### 태그
`조건문` `반복문`