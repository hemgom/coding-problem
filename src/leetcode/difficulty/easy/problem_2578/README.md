# 2578. Split With Minimum Sum
양수 `num`이 주어질 때, 이를 음수가 아닌 정수 `num1`과 `num2`로 분할한다.  
- `num1`과 `num2`의 연결은 `num`의 순열이다.  
  - 즉, `num1`과 `num2`의 각 자리의 경우의 수 합은 `num`의 각 자리의 경우의 수 합과 같다.  
- `num1`과 `num2`는 선행 `0`을 포함할 수 있다.
- `num1`과 `num2`의 최소 합을 반환한다.
- `num`에는 선행 `0`이 포함되지 않도록 보장된다.
- `num1`과 `num2`의 자릿수 발생 순서는 `num`의 발생 순서와는 다를 수 있다.
### 입력제한
- 10 <= `num` <= 10<sup>9</sup>
### 풀이핵심
- 직역의 문제 때문일 수도 있지만 요약한 바는 이렇다
- `num`을 구성하는 정수들을 나누어 조합해 `num1`과 `num2`를 구성한다.
  - 당연히 `num`의 구성하는 정수는 1번만 사용 가능하다.
- `num1`과 `num2`의 최소합을 구해 반환해야 한다.
  - `num`의 구성하는 정수 중 작은 값이 `num1, num2`의 높은 자릿수에 위치해야한다.
### 문제풀이
1. `num`를 `String`형으로 변환 후 문자열의 길이만큼의 정수형 배열을 생성한다.
2. `int[] positionValue`에 `num`의 각 자리 정수를 저장한다.
3. `sort()`를 사용해 `positionValue`의 값을 오름차순으로 정렬한다.
4. `StringBuilder sum1, sum2`를 생성한다.
5. `sum1`과 `sum2`에 `positionValue`의 요소를 하나씩 추가한다.
6. `sum1`과 `sum2`를 `String -> int`형으로 바꿔 더한 값을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/split-with-minimum-sum/)
### 태그
`반복문` `조건문` `StringBuilder` `Integer` `toString()` `parseInt()`