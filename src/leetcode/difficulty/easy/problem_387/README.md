# 387. First Unique Character in a String
문자열 `s`가 주어지면, 그 안에서 반복되지 않는 첫 번째 문자를 찾아 인덱스를 반환한다.  
만약 존재하지 않는다면 `-1`을 반환한다.
### 입력제한
- 1 <= `s.length()` <= 10<sup>5</sup>
- `s`는 영소문자로 구성된다.
### 풀이핵심
- `s`의 길이의 범위가 꽤 크고 영소문자로만 이루어지기 때문에 `영소문자`을 활용한다.
- 영소문자가 `s`에서 가지는 첫 번째 인덱스를 `firstIndex`에 마지막 인덱스를 `lastIndex'에 저장한다.
### 문제풀이
1. 영소문자 `'a'`부터 `'z'`까지 아래의 연산을 반복한다.
   - `char sLetter`의 첫 번째 인덱스와 마지막 인덱스를 구한다.
   - 첫 번째 인덱스와 마지막 인덱스가 같다면 `s` 내에 `sLetter`와 같은 요소가 하나만 존재하는 걸 의미한다.
   - 또한 `s`에 영소문자가 없다면 `firstIndex == lastIndex == -1`이기 때문에 `firstIndex >= 0`이어야 한다.
   - 위의 조건이 만족할 경우 `checkMinIndex()`를 수행해 `minIndex`에 저장한다.
2. `checkMinIndex()`는 `minIndex`와 `firstIndex`를 받아 더 작은 값을 반환한다.
   - `minIndex`의 초기 값은 `s.length()`이다. 조건에 부합하는 요소가 있을 경우 이를 통해 확인한다.
3. `(1) ~ (2)` 과정을 반복 후 `minIndex`의 값에 따라 `result`를 반환한다.
   - `minIndex`가 초기값과 같다면 조건에 맞는 요소가 없기 때문에 초기값을 가진 `result`를 반환
   - 초기값이 아니라면 `result = minIndex` 수행 후 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/first-unique-character-in-a-string/)
### 태그
`반복문` `문자 중복확인`