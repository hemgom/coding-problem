# 1768. Merge Strings Alternately
`word1`과 `word2`, 두 개의 문자열이 주어진다.  
`word1`부터 각 문자열의 문자를 번갈아 가며 추가해 문자열을 합친다.  
만약 한 문자열이 다른 문자열보다 길이가 길다면 남은 문자를 병합 문자열의 뒤에 추가한다.  
최종적으로 `병합된 문자열`을 반환한다.
### 입력제한
- 1 <= `word1.length(), word2.length()` <= 100
- `word1`과 `word2`는 `영소문자`로 구성된다.
### 풀이핵심
- 각 문자읠 문자를 번갈아가며 추가해 문자열을 합친다.
  - 만약 두 문자열의 길이가 다르다면 같은 개수의 문자를 추가한 뒤 남은 문자는 뒤에 모두 배치한다.
### 문제풀이
1. 아래의 변수를 생성 및 초기화한다.  
   - `merge` : 병합된 문자열의 문자들을 저장
   - `one` : `word1`의 인덱스를 저장, 초기값 `0`
   - `two` : `word2`의 인덱스를 저장, 초기값 `0`
   - `w1L` : `word1`의 길이를 저장, 초기값 `word1.length()`
   - `w2L` : `word2`의 길이를 저장, 초기값 `word2.length()`
2. `one`과 `two`가 각각 `w1L`, `w2L`과 같아질 때까지 아래의 연산을 반복한다.
   - `one`이 `w1L`과 같지 않을 경우
     - `word1`의 `one` 위치의 문자를 `merge`에 추가
     - `one`의 값을 `1` 증가시킴
   - `two`가 `w2L`과 같지 않을 경우
     - `word2`의 `two` 위치 문자를 `merge`에 추가
     - `two`의 값을 `1` 증가시킴
3. `(2)`의 과정을 모두 마치면 `merge`를 `String`으로 변환해 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/merge-strings-alternately/)
### 태그
`StringBuilder` `문자열 병합`