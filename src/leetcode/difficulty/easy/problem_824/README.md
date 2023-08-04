# 824. Goat Latin
공백으로 단어가 구분된 문자열 `sentence`가 주어진다.  
각 단어는 영소문자와 영대문자로만 구성된다.  
우리는 `sentence`를 `Goat Latin (돼지 라틴어 같은 합성어)`으로 변환하려 한다.  
규칙은 아래와 같다.  
- 단어가 `모음('a', 'e', 'i', 'o', 'u')`으로 시작하는 경우 단어 끝에 `"ma"`를 추가한다.
  - ex) `apple` -> `apple + ma`
- 단어가 자음으로 시작하는 경우 단어의 첫 글자를 단어 마지막으로 옮기며 끝에 `"ma"`를 추가한다.
  - ex) `goat` -> `oatg + ma`
- 또한 단어의 인덱스에 따라 `1`부터 시작하여 각 단어의 끝에 문자 `'a'`를 하나씩 추가한다.
  - 예를 들어 첫 번째 단어는 끝에 `'a'`가 추가되고, 두 번째 단어는 `'aa'`가 추가되는 식이다.  

`Goat Latin`으로 변환된 단어로 구성한 문자열을 반환한다.
### 입력제한
- 1 <= `sentence.length()` <= 150
- `sentence`는 영대소문자로 구성된다.
- `sentence`는 선행 또는 후행 공백이 없다.
- `sentence`의 모든 단어는 공백으로 구분된다.
### 풀이핵심
- `sentence`를 구성하는 단어들을 `Goat Latin` 규칙으로 수정한 문자열을 반환한다.
### 문제풀이
1. `split()`를 사용해 `sentence`의 단어들을 `String[] words`에 저장한다.
2. `words`의 요소를 `String word`라고 할 때 각 `word`를 `Goat Latin`방식으로 수정한다.
3. `checkVowel(char firstLetter)`의 결과에 따라 다음을 수행한다.
   - `vowels` : 모음 문자들을 요소로하는 `char[]`이다. (소문자, 대문자)
   - 결과가 `참(true)`이라면
     - `vowelToGoatLatin(String word, StringBuilder goatLatin, int countA)`
   - 결과가 `거짓(false)`이라면
     - `notVowelToGoatLatin(String word, StringBuilder goatLatin, int countA)`
4. `(3)`의 과정을 거친 단어를 `glWords`에 순차적으로 저장한다.
   - `join()`을 사용해 구분자는 `공백(" ")`으로하여 `glWords`를 문자열로 변환해 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/goat-latin/)
### 태그
`split()` `String.join()` `repeat()` `StringBuilder` `toString()` `setLength()`