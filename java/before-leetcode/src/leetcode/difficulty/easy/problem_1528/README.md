# 1528. Shuffle String
문자열 `s`와 정수형 배열 `indices`가 주어질 때 관계는 아래와 같다.  
`s`를 구성하는 문자 `s.charAt(i)`가 있을 때
- `indices[i]`는 해당 문자가 이동해야 할 인덱스를 뜻 한다.

`s` 문자를 재배열한 문자열을 반환한다.
### 입력제한
- `s.length == indices.length == n`
- 1 <= `n` <= 100
- `s`는 오직 영소문자로만 구성된다.
- 0 <= `indices[i]` < n
- `indices`의 요소는 중복이 없다.
### 풀이핵심
- `s`를 `indices`를 참고해 재배열 한 후 반환한다.
### 문제풀이
1. `s`의 문자들을 `String[] sLetter`에 저장하고, `String[] result`를 생성한다.
2. `result`의 인덱스 `indices[i]`에 `sLetter[i]`를 저장한다.
3. `indices`의 길이 만큼 `(2)`의 과정을 반복한다.
4. `String.join()`을 통해 `result`의 요소를 합쳐 문자열로 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/shuffle-string/)
### 태그
`반복문` `조건문` `split()` `join()`