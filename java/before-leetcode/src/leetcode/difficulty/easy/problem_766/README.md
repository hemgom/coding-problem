# 766. Toeplitz Matrix
`m × n` 행렬이 주어질 때, `Toeplitz 행렬`이라면 `true`를 반환한다.  
그렇지 않다면 `false`를 반환한다.  
- `Toeplitz 행렬` : 좌상단에서 우하단 방향의 모든 대각선의 원소가 같은 행렬
### 입력제한
- `m == matrix.length`, `n == matrix[i].length`
- 1 <= `m` `n` <= 20
- 0 <= `matrix[i][j]` <= 99
### 풀이핵심
- `좌상단 -> 우하단` 방향의 모든 대각선에 위치한 요소들은 대각선 별로 서로 같은 값을 가지는지 확인한다.
### 문제풀이
1. 행 또는 열이 `1`이라면 따로 대각선이 존재하지 않으므로 `true`를 반환
2. 행의 최대 인덱스부터 `0`까지 아래의 연산을 반복
   - `check`를 호출해 `matrix, i, 0`을 파라미터로 결과가 `false`라면 `false`를 반환
3. `1`부터 열의 최대 인덱스까지 아래의 연산을 반복
   - `check`를 호출해 `matrix, 0, j`를 파라미터로 결과가 `false`라면 `false`를 반환
4. `(2), (3)`의 과정을 마쳤다면 `true`를 반환  

__check(int[][] matrix, int lineIndex, int rowIndex)__
- 파라미터의 시작 요소를 기준으로 대각선 요소들과 값이 같은지를 확인해 반환하는 메서드
- `matrix[i][j]`와 `matrix[i+1][j+1]`가 같은지 확인한다.
  - `i` `j`는 연산할 때마다 각각 `1`씩 증가시킨다.
  - `i`와 `j`는 `matrix`의 인덱스 범위를 벗어나면 안된다.
### 문제출처
- [leetcode](https://leetcode.com/problems/toeplitz-matrix/)
### 태그
`2차원 배열 대각선 요소 비교`