# 242. Valid Anagram
문자열 `s`와 `t`가 주어진다.  
`t`가 `s`의 `애너그램<1>`이면 `true`를, 아니라면 `false`를 반환한다.
### 입력제한
- 1 <= s.length, t.length <= 5 * 10⁴ 
- 문자열 `s`와 `t`는 영어 소문자로 구성된다. 
### 문제풀이
1. `s`와 `t`를 `char`배열로 변환한다.
   - toCharArray() : `String`에 저장된 문자열의 문자를 `char`배열에 한 문자씩 순차적으로 저장한다.
2. 각 `char`배열을 오름차순으로 정렬한다.
   - Arrays.sort() : 배열에 저장된 값을 오름차순으로 정렬한다.
3. 변환한 각 `char`배열을 `String`으로 형변환 하고 두 문자열이 같은지 확인한다.
   - String1.equals(String2) : `문자열1`과 `문자열2`에 저장된 값이 같은지 확인한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/valid-anagram/)
### 정보출처
- <1> [애너그램](https://namu.wiki/w/%EC%95%A0%EB%84%88%EA%B7%B8%EB%9E%A8)
### 태그
`배열 비교`