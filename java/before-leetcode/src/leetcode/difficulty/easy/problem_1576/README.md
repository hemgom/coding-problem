# 1576. Replace All ?'s to Avoid Consecutive Repeating Characters
영소문자와 `'?'`문자로만 이루어진 문자열 `s`가 주어진다.  
최종 문자열은 연속적으로 같은 문자가 없도록 `'?'`문자를 영소문자로 수정한 문자열이다.  
- `'?'`가 아닌 영소문자는 수정할 수 없다.

주어진 문자열이 `'?'`을 제외하곤 연속적으로 반복되는 문자가 없도록 보장한다.  
모든 변환(변환이 없을 수도 있음)이 완료된 후 최종 문자열을 반환한다.  
- 결과가 2개 이상이라면 그 중 하나를 반환함
- 주어진 제약 조건에서 항상 답이 나올 수 있음을 알 수 있다.
### 입력제한
- 1 <= `s.length()` <= 100
- `s`는 영소문자와 `'?'`로 구성된다.
### 풀이핵심
- `s`에서 `'?'`을 발견하면 해당 위치기준 앞 또는 뒤 문자, 혹은 앞뒤 두 문자 모두 비교한다.
  - `a-z` 영소문자 중 앞 뒤 문자와 같지 않은 문자를 찾아 `'?'`를 수정한다.
### 문제풀이
__modifyString(String s)__
1. 문자열 `s`의 문자들을 `char[] letters`에 저장한다.
   - `toCharArray()`를 사용해 문자열을 문자배열 형태로 바꿔 저장한다.
2. `letters`의 문자를 순차적으로 읽어 `'?'`문자를 찾아낸다.
   - `문자(letters[i])`를 찾아낸 경우 `changeChar(char[] letters, int index)`를 호출한다.
     - 호출한 메서드의 반환 값을 `letters[i]`에 저장한다.  
<br/>

__changeChar(char[] letters, int index)__
1. `char front, back`를 생성하고 `'0'`으로 초기화 한다.
2. 세 가지 경우에 대해서 나누어 조건문을 수행한다.  
   1. `index` 즉, `'?'`의 위치가 `0`일 경우(`s`의 첫 문자)
   2. `index`의 값이 `letters.length-1`인 경우(`s`의 마지막 문자)
   3. 그 외의 경우`(0 < index < letters.length-1)`
3. 영소문자 `'a'`부터 `'z'`까지 순차적으로 반복문을 수행한다.
   - `ch`가 `front`와 `back` 둘 모두와 다를 때 `letters[i]`를 `ch`로 수정한다.
   - 만약 조건을 만족하는 영소문자를 찾았다면 수정 후 `break`를 통해 반복문을 종료
4. `String.valueOf()`을 사용해 문자배열 `letters`를 문자열로 변환해 반환한다. 
### 문제출처
- [leetcode](https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/)
### 태그
`toCharArray()` `String.valueOf()` `문자 비교`