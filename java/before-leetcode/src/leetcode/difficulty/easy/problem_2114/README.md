# 2114. Maximum Number of Words Found in Sentences
문장은 선행 또는 후행 공백이 없이 공백하나로 구분되는 단어들의 집합이다.  
문자열 타입의 문장들이 저장된 배열 `sentences`가 주어지며, 각 `sentences[i]`는 하나의 문장이다.  
배열의 문장들이 가지는 단어의 개수 중 가장 큰 단어의 수를 반환한다.
### 입력제한
- 1 <= `sentences.length` <= 100
- 1 <= `sentences[i].length` <= 100
- `sentences[i]`는 영소문자와 `' '`(공백문자)로만 구성 될 수 있다.
- `sentences[i]`는 선행 또는 후행 공백을 가지지 않는다.
- `sentences[i]`의 모든 단어는 공백으로 구분된다.
### 풀이핵심
- 결국 선후행 공백이 존재하지 않는다면 어떤 문장이든 단어의 수는 `공백의 수 + 1`이다.
- 각 문장들의 공백의 수를 구하고 비교해 가장 큰 공백의 수에 `+1`을 해서 반환하면 된다.
### 문제풀이
1. 문장의 단어의 수를 계산하는 메서드 `wordCount(String sentence)`를 구현한다.
   - 문자열(문장)을 처음 부터 끝까지 읽어서 `' '`이 있을 경우 `count`를 증가시킨다.
   - 최종적으로 구해진 `count`에 `1`을 더해 반환한다.
2. 주어진 문자열 배열에서 문장을 하나씩 꺼내 `wordCount(String sentence)`를 수행한다.
   - 메소드의 결과를 `wordCount`에 저장한다.
   - 만약 `wordCount > mostCount`이라면 `mostCount`에 `wordCount`값을 저장한다.
3. (2)의 과정을 주어진 배열의 길이만큼 반복한다.
4. `mostCount`에 저장된 값이 가장 많은 단어를 가진 문장의 단어 수 이므로 해당 변수를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/)
### 태그
`반복문` `조건문`