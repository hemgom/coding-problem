# 2710. Remove Trailing Zeros From a String
문자열 `num`은 양의 정수이다.  
후행 `0`을 제외한 나머지 정수를 문자열로 반환한다.
### 입력제한
- 1 <= `num.length()` <= 1000
- `num`은 오직 숫자로 구성된다.
- `num`의 선행에는 `0`이 올 수 없다.
### 풀이핵심
- `num` 후행에 오는 연속적인 `0`들의 인덱스 중 가장 작은 인덱스를 구하고 `num`의 부분 문자열을 반환한다.
### 문제풀이
1. `num`을 `char[] digits`에 `String -> Char` 형변환하여 저장한다.
2. 2가지 경우에 따라 아래의 연산을 수행한다.
   1. `digits[i]`가 `'0'`이면서 `digits[i-1]`가 `'0'`이 아닌 숫자인 경우
      - `startZero`에 인덱스 `i`를 저장한다.
   2. `digits[i]`가 `'0'`이 아닌 숫자인 경우
      - `startZero`에 `-1`을 저장한다.
      - 후행 `'0'`의 조건은 연속적이어야 하므로 중간에 이외의 숫자가 나오면 `-1`로 초기화한다.
3. `(2)`의 과정을 반복 후 `startZero`의 값이 `-1`이라면
   - `num`에 후행 `'0'`이 존재하지 않으므로 `num`을 그대로 반환한다.
4. `(3)`의 과정에 부합하지 않는다면 후행 `'0'`이 존재한다는 뜻이다.
   - `startZero`에는 후행 `'0'`의 시작 인덱스가 저장되어있다.
   - `num.substring(0, startZero)`를 통해 `startZero` 이전의 부분 문자열을 반환한다. 
### 문제출처
- [leetcode](https://leetcode.com/problems/remove-trailing-zeros-from-a-string/)
### 태그
`반복문` `substring()` `toCharArray()`