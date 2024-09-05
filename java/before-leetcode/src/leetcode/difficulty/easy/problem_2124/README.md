# 2124. Check if All A's Appears Before All B's
`'a'`와 `'b'`로만 구성된 문자열 `s`가 주어질 때  
문자열의 모든 `'a'`가 모든 `'b'` 앞에 나타나면 `true`를 반환, 그렇지 않다면 `false`를 반환한다.
### 입력제한
- 1 <= `s.length()` <= 100
- `s`는 `'a'`또는 `'b'`로만 구성된다.
### 풀이핵심
- `'a'` 또는 `'b'`가 `s`에 존재하지 않으면 조건을 충족한다.
- `"ba"`가 `s`에 존재하지 않는다면 `'b'` 뒤에 `'a'`가 없기에 조건을 충족한다.
### 문제풀이
1. `s`에서 `"a"`와 같은 요소의 인덱스가 없다면 `true`를 반환한다.
2. `s`에서 `"b"`와 같은 요소의 인덱스가 없다면 `true`를 반환한다.
3. `s`에 `"ba"`가 포함되어있다면 `false`를 포함되지 않았다면 `true`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/)
### 태그
`문자열 비교`