# 2133. Check if Every Row and Column Contains All Numbers
모든 행과 모든 열에 `1`부터 `n(포함)`까지의 모든 정수가 포함되는 경우  
`n × n` 행렬이 유효하다 할 수 있다.  

`n × n` 행렬이 주어질 때, 행렬이 유효하다면 `참`을 아니라면 `거짓`을 반환한다.
### 입력제한
- `n == matrix.length == matrix[i].length`
- 1 <= `n` <= 100
- 1 <= `matrix[i][j]` <= `n`
### 풀이핵심
- 모든 행과 열에 `1 ~ n`의 모든 정수가 있는지 확인하면 된다.(`n` == `matrix.length`)
  - `n × n` 행렬이므로 결국 행과 열의 길이는 `n`으로 같다.
### 문제풀이
1. 인덱스 `0`부터 `matrix.length-1`까지 아래의 과정을 반복 수행한다.
   - 파라미터로 `matrix`와 인덱스 `j`를 넘겨 `checkLine()`과 `checkRow()`를 수행한다.

- `checkLine(int[][] matrix, int fixLine)`
  - `fixLine`행에 해당하는 요소들을 `HashSet<Integer>`타입 `e`에 저장한다.
  - 만약 저장 결과가 `false`라면 이미 같은 요소가 존재하는 것 이므로 `false`를 반환한다.
  - 모든 요소가 저장된다면 `1 ~ n`의 모든 정수가 해당 행에 존재하는 것 이므로 `true`를 반환한다.
- `checkRow(int[][] matrix, int fixRow)`
    - `fixRow`열에 해당하는 요소들을 `HashSet<Integer>`타입 `e`에 저장한다.
    - 결과 반환에 대한 내용은 위의 `checkLine()`과 같다.
2. `(1)`의 과정 수행 중 유효하지 않은 행 또는 열을 찾는다면 `false`를 반환한다.
   - 유효하지 않은 행 또는 열을 찾지 못했다면 `true`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/)
### 태그
`2차원 배열` `HashSet`