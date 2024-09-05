# 1893. Check if All the Integers in a Range Are Covered
2차원 정수 배열 `ranges`와 두 개의 정수 `left` `right`가 주어진다.  
`ranges`의 요소 `ranges[i]`는 `[start, end]`로 포괄적인 범위를 나타낸다.  
`left`와 `right`를 포함한 범위의 정수들이 한 번이라도 `ranges[i]`의 범위에 포함된다면 `true`를 반환한다.
- 만약 포함되지 않는 정수가 하나라도 있다면 `false`를 반환한다.

`start <= x <= end` 라면 정수 `x`는 `ranges[i] = [start, end]` 범위에 포함된다 할 수 있다.
### 입력제한
- 1 <= `ranges.length` <= 50
- 1 <= `start` <= `end` <= 50
- 1 <= `left` <= `right` <= 50
### 풀이핵심
- `left`와 `right`를 포함한 범위의 정수들이 `ranges`의 범위 요소에 한 번이라도 포함되면 된다.
  - 만약 포함되지 못한 정수가 하나라도 존재한다면 `false`를 반환한다.
### 문제풀이
1. `range`을 생성 `ranges`의 범위요소에 해당하는 정수들을 저장한다.
   - `addIntger()` : 시작 정수와 끝 정수를 받아 범위의 모든 정수들을 `range`에 저장한다.
2. `left`에서 `right`까지의 모든 정수들이 `range`에 포함되어있는지 확인한다.
   - 만약 `range`에 정수가 없다면 `false`를 반환한다.
3. `(2)`의 과정을 마쳤다면 모든 정수들이 `range`에 포함되어 있으므로 `true`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/)
### 태그
`HashSet` `contains()` `2차원 배열`