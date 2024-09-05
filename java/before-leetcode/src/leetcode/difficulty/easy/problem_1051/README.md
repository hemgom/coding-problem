# 1051. Height Checker
학생들이 한 줄로 서 사진을 찍으려한다. 이때 학생들은 키가 작은 사람부터 순차적으로 줄을 선다.  
학생들이 조건에 맞게 줄을 섰을 때를 `expected[]`라고 하며 `expected[i]`는 `i`번 째 학생의 키다.  

학생들의 현재 줄 순서를 `heights[]`라고 할 때 `heights[i]`는 `i`번째 학생의 키다.  
`heights[i] != expected[i]`를 만족하는 `i`의 개수를 반환한다.
### 입력제한
- 1 <= `heights.length` <= 100
- 1 <= `heights[i]` <= 100
### 풀이핵심
- `heights`를 복사해두고 둘 중 한 배열을 오름차순으로 정렬한 후 두 배열의 요소를 비교한다.
### 문제풀이
1. 정수 배열 `origin`을 만들어 `heights`의 요소를 저장한다.
2. `heights`를 오름차순으로 정렬한다.
3. `origin[i]`와 `heights[i]`를 비교해 다를 경우를 카운트한다.
    - 두 요소가 다른 경우 `diffCount`를 `1`증가시킨다.
4. `(3)`의 반복이 끝났다면 `diffCount`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/height-checker/)
### 태그
`배열 정렬` `원본 배열과 수정 배열 요소 비교`