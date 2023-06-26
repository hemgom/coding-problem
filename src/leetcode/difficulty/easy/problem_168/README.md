# 168. Excel Sheet Column Title
정수 `columnNumber`가 주어질 때, 열 제목을 반환한다.
- 열 제목은 아래와 같이 반환된다.
```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
```
### 입력제한
- 1 <= `columnNumber` <= 2<sup>31</sup> - 1
### 풀이핵심
- 주어진 정수를 `26진법`으로 변환
   - 단 예시를 보면 알겠지만 `0`에 해당하는 문자가 없다.
   - 변환 값이 `2, 0`일 경우 `1, 26`으로 값을 바꿔야한다.
- `ASCII 코드` 활용
   - `'A'`의 ASCII 코드는 `65`이다.
   - `변환 값 + 64`를 통해서 예시와 같은 값으로 정수를 문자로 변환한다.
### 문제풀이
1. 주어진 정수가 `26`보다 큰지 아닌지를 확인한다.
   - 아닌 경우 그대로 값을 `LinkedList`에 저장한다.
2. 만약 `26`보다 크다면 정수를 `26`으로 나누어 `몫`과 `나머지` 값을 구해준다.
   - `value` : `columnNumber / 26`을 저장
   - `remain` : `columnNumber % 26`을 저장
3. `remain`의 값에 따라 조건문을 수행하고 `LinkedList digit`에 저장한다.
   - `remain == 0` 경우 : `value`를 `1`감소 시키고, `remain = 26`을 수행한다.
   - `remain != 0` 경우 : `remain`의 값을 그대로 `digit`에 저장한다.
4. `divideValue`의 값이 `26`보다 같거나 작을 때까지 `(2) ~ (3)` 과정을 반복한다.
   - 풀이핵심에 적은 것처럼 `26진법`을 활용하기 때문에 이와 같은 과정을 수행했다.
5. `digit`에서 값을 하나씩 꺼내 `64`를 더해 문자로 형변환 해준다.
6. 문자를 `String.valueOf()`을 통해 문자열로 형변환하고 `StringBuilder result`에 추가한다.
7. `result`의 타입이 `StringBuilder`이므로 `toString()`을 통해 문자열로 형변환 한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/excel-sheet-column-title/)
### 태그
`StringBuilder, append(String s)` `반복문` `LinkedList` `String.valueOf(char c)`  
`toString()`