# 2788. Split Strings by Separator
문자열 리스트 `words`와 문자 `separator`가 주어진다.  
각 문자열을 `separator`를 구분자로 사용해 `단어 단위`로 나눈다.  
빈 문자열을 제외하고 새로운 단어들을 포함하는 문자열 리스트를 반환한다.  
- 참고
  - `separator`는 단어를 나눌 위치를 결정하는데 사용된다.
    - 하지만 `단어`의 일부로 포함되지 않는다.
  - 분할로 인해 두 개 이상의 `문자열(단어)`이 생성될 수 있다.
  - 반환하는 문자열 리스트는 처음 주어지는 문자열 리스트와 동일한 순서를 유지해야 한다.
### 입력제한
- 1 <= `words.length` <= 100
- 1 <= `words.get(i).length()` <= 20
- `words`의 요소는 `영소문자` 또는 `.,|$#@`의 문자로만 구성될 수 있다.
- 구분 기호는 `.,|$#@` 중 하나이다.
### 풀이핵심
- 주어진 문자열 리스트와 구분자 문자를 사용해 최하 단위의 단어들로 바꾼 후 리스트에 저장해 반환한다.
- `separator`의 경우 `특수문자`이므로 정규표현식 사용시 앞에 `\\`를 붙여서 사용한다. 
### 문제풀이
1. 새로운 단어들을 저장할 문자열 리스트 `reWords`를 생성한다.
2. `\\`와 `separator`를 합친 문자열을 `div`에 저장한다.
3. `words`의 각 요소를 꺼내서 아래의 연산을 반복한다.
   - `removeSeparator`에 `word`와 `div.toString()`을 파라미터로하여 호출한다.
     - `removeSeparator` : 문자열에서 구분자를 제거해 단어를 구분짓고 단어들을 `reWords`에 추가한다.
4. `(3)`의 과정을 마쳤다면 `reWords`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/split-strings-by-separator/)
### 태그
`문자열 분할` `구분자` `ArrayList` `StringBuilder`