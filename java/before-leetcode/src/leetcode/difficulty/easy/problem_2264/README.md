# 2264. Largest 3-Same-Digit Number in String
큰 정수를 나타내는 문자열 `num`이 주어진다.  
아래의 조건을 충족하면 `좋은 정수`라고 할 수 있다.  
- 길이가 `3`인 `num`의 부분 문자열
- 한 종류의 숫자로 구성되어야 함

가장 큰 `좋은 정수`를 문자열로 반환한다.  
만약 `좋은 정수`가 존재하지 않는다면 `""`을 반환한다.  
(`num` 또는 `좋은 정수`에 선행으로 `0`이 존재할 수 있다.)
### 입력제한
- 3 <= `num.length()` <= 1000
- `num`은 오직 `숫자`로만 구성된다.
### 풀이핵심
- `num`에 같은 숫자로 연속된 3자리 정수가 있는지 확인한다.
  - 해당 정수가 다수 있다면 가장 큰 정수를 반환
  - 없다면 `""(빈 문자열)`을 반환
### 문제풀이
1. 아래의 용도로 변수를 선언/초기화한다.
   - `digit` : `num`의 숫자를 저장, 초기값은 `-1`
   - `maxDigit` : 연속된 3자리 정수의 `digit`을 저장, 초기값은 `-1`
   - `count` : `digit`가 연속된 횟수를 저장, 초기값은 `1`
2. 아래의 연산을 `num`의 길이만큼 반복한다.
   - `digit`과 `n`이 같을 경우
     - `count`를 `1` 증가시킨다.
     - 만약 `count`가 `3`일 때 `n`이 `maxDigit`보다 크다면 `n`을 `maxDigit`에 저장한다.
     - 이후 다음 반복으로 넘어간다.
   - `digit`과 `n`이 다를 경우
     - `digit`에 `n`을 저장하고 `count`를 `1`로 초기화한다.
3. `(2)`의 과정이 끝났다면 `maxDigit`에 따라 문자열을 반환한다.
   - `maxDigit`이 `0`보다 크다면 `"(111 * maxDigit)"`을 반환
   - `maxDigit`이 `-1`이라면 조건에 부합하는 `좋은 정수`가 없으므로 `""`를 반환
   - `maxDigit`이 `0`이라면 `"000"`을 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/largest-3-same-digit-number-in-string/)
### 태그
`문자열 요소 확인` `Character.getNumericValue()` `Integer.toString()`