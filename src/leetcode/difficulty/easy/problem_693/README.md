# 693. Binary Number with Alternating Bits
양수인 정수 `n`이 주어질 때, 인접한 비트가 서로다른 값을 갖는지 확인한다.
- 즉, 비트가 번갈아가며 값이 달라지는 지를 확인

조건에 부합한다면 `true`, 그렇지 않다면 `false`를 반환한다.
### 입력제한
- 1 <= `n` <= 2<sup>31</sup> - 1
### 풀이핵심
- `n`을 2진수로 변환한 다음 `1`과 `0`이 번갈아가며 배치해 있는지 확인한다.
### 문제풀이
1. `n`이 `1`이라면 `true`를 반환한다.
   - 2진수에서 한 자리인 정수는 `1` 밖에 없다.
   - 2자리 이상의 정수인 경우 `(2)`의 과정을 수행한다.
2. `n`을 2진수 문자열로 변환`(-> binary)` 후 해당 변수의 길이 만큼 아래의 연산을 반복한다.
   - `before[초기 값 = binary.charAt(0)]`과 `binary.charAt(i)`의 값을 비교한다.
     - 같다면 `false`를 반환한다.
     - 다르다면 `before`에 `binary.charAt(i)`을 저장한다.
3. 만약 `(2)`과정을 마쳤다면 `true`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/binary-number-with-alternating-bits/)
### 태그
`Integer.toBinaryString()` `문자 비교`