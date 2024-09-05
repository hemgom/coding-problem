# 1009. Complement of Base 10 Integer
정수의 `보수`는 정수를 2진 표현 했을 때, `1 -> 0`, `0 -> 1`로 바꿔 얻을 수 있는 정수이다.
- 정수 `5`의 2진법 표현은 `101`이고 이 때 보수는 `010`이며 정수 `2`입니다.

정수 `n`이 주어질 때, 그 보수를 반환한다.
### 입력제한
- 0 <= `n` <= 10<sup>9</sup>
### 풀이핵심
- 주어진 정수의 보수를 구하면 된다.
### 문제풀이
1. 정수 `n`을 2진수로 바꾸어준다.
   - 10진수의 2진수 변환은 `Integer` 클래스의 `toBinaryString()`을 사용했다.
   - `toBinaryString()` : 정수를 2진수로 변환해준다. 단, 타입은 `String`이다.
2. 변수 `binaryString`에서 `index`마다 문자를 읽어 `if문`을 수행한다.
   1. 문자가 `0`일 경우 : `StringBuilder bc`에 `"1"`을 추가한다.
   2. 문자가 `1`일 경우 : `StringBuilder bc`에 `"0"`을 추가한다.
3. `StringBuilder bc`를 정수형으로 변환 후 값을 반환한다.
   1. 타입이 `StringBuilder`이므로 `toString()`을 통해 `String`으로 바꾸어 준다.
   2. `Integer` 클래스의 `parseInt(String s, 2)`를 통해 2진 표현된 문자열을 정수로 형변환 한다.
- 문자열 합칠 때 단순하게 `+`연산을 해도 되지만 `불변`의 특성을 가진 `String` 때문에 `StringBuilder`를 사용했다.
### 문제출처
- [leetcode](https://leetcode.com/problems/complement-of-base-10-integer/)
### 태그
`StringBuilder, append(String s)` `Integer.toBinaryStrint(int i)` `Integer.parseInt(String s, 2)`