# 2496. Maximum Value of a String in an Array
영소문자와 숫자로 구성될 수 있는 요소를 가진 문자열 배열 `strs`가 주어진다.  
`strs`의 요소에 대한 길이는 다음과 같이 정의한다.
- `strs[i]`가 숫자로만 이루어질 경우 `strs[i] == strs[i].length`이다.
- 그렇지 않은 경우 문자열의 길이는 `strs[i].length`이다.

`strs`의 요소들의 길이 중 가장 긴 길이를 반환한다.
### 입력제한
- 1 <= `strs.length` <= 100
- 1 <= `strs[i].length` <= 9
- `strs[i]`는 영소문자와 숫자로만 구성이 가능하다.
### 풀이핵심
- 해석한 바로는 `strs[i]`가 숫자로만 이루어졌는지 확인하고 길이를 구해 가장 긴 값을 반환하면 된다.
### 문제풀이
1. `strs[i]`가 가지는 문자중 `0 ~ 9`를 `""`로 바꿔 `checkOnlyNums`에 저장한다.
2. `checkOnlyNums`가 `""`와 같은지 확인한다.
   - 같다면 모든 문자가 숫자이므로 `Integer.parseInt()`를 통해 정수형으로 바꿔 `strLength`에 저장한다.
   - 다르다면 영소문자 또는 영소문자와 숫자로 구성되므로 `length()`로 문자열 길이를 `strLength`에 저장한다.
3. `maxStrLength < strLength`라면 `maxStrLength` 값을 갱신한다.
4. `(1) ~ (3)`과정을 `strs`의 요소수 만큼 반복한다.
5. 최종적으로 `maxStrLength`에 저장된 값을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/)
### 태그
`반복문` `조건문` `replaceAll()` `equals()` `length()`