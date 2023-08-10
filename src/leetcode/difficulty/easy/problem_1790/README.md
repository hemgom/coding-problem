# 1790. Check if One String Swap Can Make Strings Equal
길이가 서로 같은 문자열 `s1`과 `s2`가 주어진다.  
`string swap`은 문자열에서 두 개의 인덱스(반드시 다를 필요는 없다)를 선택하고 인덱스의 문자를 서로 바꾸는 연산이다.  

문자열 중 한 문자열에 대해 최대 한 번의 `string swap`을 수행했을 때 두 문자열이 같다면 `true`를 반환  
그렇지 않다면 `false`를 반환한다.
### 입력제한
- 1 <= `s1.length(), s2.length()` <= 100
- `s1.length() == s2.length()`
- `s1`과 `s2`는 오직 영소문자로 구성된다.
### 풀이핵심
- `s1`을 기준으로 `s2`와 비교한다.
  - 두 문자열이 다르다면 `s2`의 다른 문자 2개의 위치를 서로 바꿔 `s1`과 같은지 비교한다.
  - 연산 후에도 다르다면 `false`를 반환한다.
### 문제풀이
#### areAlmostEqual(String s1, String s2)
- 두 문자열을 입력받아 서로 같은지 확인한다.
  - 같다면 `true`를 반환
  - 다르다면 `checkSwapString(s1, s2)`의 결과를 반환
#### checkSwapString(String s1, String s2)
1. `s1`과 `s2`의 문자를 저장한 문자 배열 `s1Letters` `s2Letters`를 생성
   - `s1`과 다른 `s2`의 문자를 저장할 `s2difChar`도 생성
2. `s1Letters`의 요소 수 만큼 아래의 연산을 반복한다.
   - `s1Letter[i]`와 `s2Letters[i]`가 같은지 확인
     - 같다면 바로 다음 `i+1`에 대해 반복문을 수행한다.
   - `difCharCount`에 저장된 값을 `1`증가 시킨다.
     - 증가 시킨 값이 `3` 이상이라면
       - 한 번의 `string swap`연산으론 `s1`과 `s2`가 같아질 수 없음
       - 바로 `false`를 반환
   - `difCharCount-1`의 값을 인덱스로 하여 `s2difChar`에 저장한다.
     - 어처피 한 번의 `string swap`만이 허용되기 때문에 `s2difChar`의 크기는 `2`ㅁ면 된다.
3. `(2)` 반복문 이후 `difCharCount`가 `1`이라면 `false`를 반환
4. 아니라면 아래의 과정을 통해 `s2Letters`의 요소를 수정한다.
   - `temp`에 `s1Letters`와 다른 `s2Letters`의 첫 번째 요소를 저장
   - 첫 번째 요소에는 두 번째 요소를 저장
   - 두 번째 요소에는 `temp`를 저장
5. `s1Letters`와 `s2Letters`가 같은지를 비교하고 결과를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/)
### 태그
`문자열 비교` `String.equals(String s)` `String.toCharArray()` `if - continue` `Arrays.equals(Object[] a, Object[] b)`
