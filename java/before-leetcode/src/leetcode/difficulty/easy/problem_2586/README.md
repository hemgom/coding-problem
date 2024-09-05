# 2586. Count the Number of Vowel Strings in Range
문자열 배열 `words`, 정수 `left` `right`이 주어진다.  
- 모음 문자 : `'a' 'e' 'i' 'o' 'u'`
- 모음 문자열 : 첫 글자와 마지막 글자가 모두 모음인 `words[i]`

범위가 `[left, right]`일 때 `모음 문자열`인 `words[i]`의 개수를 반환한다.
### 입력제한
- 1 <= `words.length` <= 1000
- 1 <= `words[i].length()` <= 10
- `words[i]`는 오직 `영소문자`로 구성된다.
- 0 <= `left` <= `right` < `words.length`
### 풀이핵심
- 주어진 정수의 범위의 `words[i]`가 `모음 문자열`인지를 확인한다.
### 문제풀이
1. `left`부터 `right`까지(포함) 아래의 연산을 반복한다.
   - `words[i]`의 첫 글자와 마지막 글자가 모음인지 확인한다.
     - `checkVowel(char[] vowel, char c)` : 주어진 문자가 모음이라면 `true` 아니라면 `false` 반환
   - `첫 글자` `마지막 글자`가 모두 모음인 경우 `count`를 `1` 증가시킨다.
2. `(1)`의 과정을 마쳤다면 `count`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/)
### 태그
`문자 비교` `특정 인덱스 요소 확인`