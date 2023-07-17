# 2160. Minimum Sum of Four Digit Number After Splitting Digits
네 자릿수를 가진 양의 정수 `num`이 주어진다.  
`num`의 각 자릿수를 이용해 두 개의 새 정수 `new1`과 `new2`를 구성한다.  
`new1`과 `new2`는 선행으로 `0`을 가질 수 있으며, `num`의 모든 자릿수를 사용해 만들어야한다.  
- 예를 들어 `num = 2932`일 경우
  - `2`가 두 자리, `9`가 한 자리, `3`이 한 자리이다.
  - 만들 수 있는 `[new1, new2]`로는 `[22, 93], [23, 92], [223, 9]` 등이 있다.

`new1`과 `new2`의 가능한 최소합을 반환한다.
### 입력제한
- 1000 <= `num` <= 9999
### 풀이핵심
- `new1`과 `new2`의 최소합을 구하려면 각 정수는 최대한 작은 값을 가져야한다.
  1. 자릿수가 작아야 한다.
  2. 높은 자리수는 작은 숫자를 가져야한다.
- 결국 둘다 2자리 수에 `10의 자리 수`는 작은 숫자 `1의 자리 수`는 비교적 큰 숫자를 가져야한다.
### 문제풀이
1. `num`의 자릿 수를 문자열 배열 `nums`에 저장한다.
2. `nums`의 요소를 오름차순으로 정렬한다.
3. `new1 = num[0] + num[2]`, `new2 = num[1] + num[3]`
4. `new1`과 `new2`를 정수형으로 변환 후, 합을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/)
### 태그
`문자열` `sort()`