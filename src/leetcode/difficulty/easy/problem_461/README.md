# 461. Hamming Distance
`Hamming Distance`란 두 정수의 서로 다른 비트의 위치 수 입니다.  
두 개의 정수 `x`와 `y`가 주어질 때 두 정수 사이의 해밍 거리를 반환한다.
### 입력제한
- 0 <= `x`, `y` <= 2<sup>31</sup> - 1
### 풀이핵심
- 결국 두 정수를 2진수로 표현한 다음 각 자리수가 다른 횟수를 구하면 된다.
  - `~_01.class` : 정수를 2진수로 바꾼 후 두 문자열을 같은 자릿수로 만들어 비교하는 방식
  - `~_02.class` : 정수를 2로 나누어 나머지 값을 비교하는 방식
### 문제풀이
- `~_01.class`
  1. `Integer.toBinaryString(int i)`를 사용해 2진수로 표현된 문자열로 변환
  2. `binaryX`와 `binaryY`의 길이를 비교해 더 큰 값에 문자열의 길이를 맞춘다.
  3. `settingBinary()`를 통해 짧은 길이의 문자열을 긴 쪽과 같게 만들어준다.
  4. `binaryX`와 `binaryY`의 문자를 비교해 다를 경우 `hammingDistance` 값을 `1` 증가시킨다.
- `~_02.class`
  1. `x`와 `y`를 2로 나누었을 떄의 나머지 값을 비교해 다르면 `hammingDistance` 값을 `1` 증가시킨다.
  2. `x`와 `y`에 각 값을 2로 나눈 몫을 저장한다.
  3. `(1) ~ (2)`과정을 `x`와 `y` 둘다 `0`일 될 때까지 반복해준다.
### 문제출처
- [leetcode](https://leetcode.com/problems/hamming-distance/)
### 태그
`Integer.toBinaryString(int i)` `Integer.parseInt(String s)`