# 1078. Occurrences After Bigram
문자열 `text`와 `first`, `second`가 주어진다.  
`text`에서 `first second`와 같은 부분이 있다면, `first second` 뒤에 오는 단어를 `third`라고 한다.  
`third`를 `String[]`에 저장하고 해당 문자열 배열을 반환한다.
### 입력제한
- 1 <= `text.length()` <= 1000
- `text`는 영소문자와 공백문자로 구성된다.
- `text`의 모든 단어는 하나의 공백으로 구분된다.
- 1 <= `first.length(), second.length()` <= 10
- `first`와 `second`는 영소문자로 구성된다.
### 풀이핵심
- 한 마디로 `text`에서 `first second third`라는 부분 문자열이 존재할 때 `third`에 해당하는 단어들이 저장된 문자열 배열을 반환한다.
### 문제풀이
1. `text`의 단어들을 `words`에 저장한다.
2. `first`와 같은 `words[i]`를 찾는다.
3. `words[i+1]`이 `second`와 같은지 확인한다.
4. `(3)`이 참일 경우 `words[i+2]`를 `thirdWords`에 추가한다.
5. 인덱스 `0 ~ words.length-3`만큼 `(2) ~ (4)`를 반복한다.
   - 문제는 `third`를 구하는게 목적이므로 마지막부터 2개의 요소는 `first`와 비교 할 필요가 없기 때문
6. `thirdWords`를 `String[]`로 변환 후 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/occurrences-after-bigram/)
### 태그
`반복문` `split()` `toArray()` `ArrayList`