# 2169. Count Operations to Obtain Zero
음의 정수가 아닌 `num1`과 `num2`가 주어진다.  
`num1 >= num2`일 경우 `num1 - num2` 결과를 `num1`에 저장하고  
`num1 < num2`일 경우엔 `num2 - num1` 결과를 `num2`에 저장한다.  
최종적으로 `num1` 또는 `num2` 중 하나가 `0`이 될 때까지 필요한 연산 횟수를 구하여 반환한다.
### 입력제한
- 0 <= num1, num2 <= 10ⁿ (n=5)
### 문제풀이
1. 입력된 `num1` 또는 `num2`의 값이 `0`인지 아닌지를 확인
   - 둘 중 하나라도 `0`을 가진다면 연산 필요없이 반복문 바로 탈출
   - 이 경우 `count`의 초기값이 `0`을 반환
2. `(1)`의 결과로 둘다 0을 가지지 않는다면 연산 진행
   - 연산 진행 후 변수 `count`에 `1`을 더하여 변수에 저장
3. `(1,2)`의 과정을 계속해서 반복한다.
4. `num1`과`num2` 중 하나라도 `0`의 값을 가진다면 반복문 탈출
5. `count`에 저장된 값을 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/count-operations-to-obtain-zero/)