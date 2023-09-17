# 2154. Keep Multiplying Found Values by Two
정수 배열 `nums`가 주어진다. 또한 `nums`에서 찾아야하는 정수 `original`이 주어진다.  
그런 다음 아래의 연산을 수행한다.  
- `nums`에서 `original`을 찾은 경우
  - `original`에 `2`를 곱한 후 해당 값을 다시 `nums`에서 재탐색한다.
- 찾지 못한 경우
  - 연산 수행을 마치고 현재 찾아야하는 정수를 반환한다.  

정수를 계속해서 `nums`에서 찾을 수 있는 한 위의 과정을 반복한다.
### 입력제한
- 1 <= `nums.length` <= 1000
- 1 <= `nums[i], original` <= 1000
### 풀이핵심
- `original`의 값이 `nums`의 요소에 있다면 `original` 값을 갱신한 후 다시 `nums`에서 같은 값을 탐색한다.
  - `nums`에서 같은 값의 요소를 찾을 수 있는 한 계속해서 위의 과정을 반복한다.
- 어쨌든 우리가 반환할 값은 현재 `nums`에서 찾아야 할 정수 값이다.
### 문제풀이
1. `nums`의 요소를 순차적으로 읽어온다.
   - 만약 `original`과 일치하는 요소가 있을 경우
     - `[nums, original * 2]`를 매개변수로 사용해 `findFinalValue`를 호출한다.
     - 위의 메서드가 반환한 정수를 `original`에 저장한다.
2. `(1)`의 과정을 마쳤다면 `origianl`을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/keep-multiplying-found-values-by-two/)
### 태그
`재귀호출`