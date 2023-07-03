# 35. Search Insert Position
중복이 없는 정수 배열 `nums`가 주어진다.  
`target`을 배열이 가지고 있다면 `target`의 인덱스를 반환한다.  
그렇지 않은 경우 `target`을 `nums`에 추가하고 정렬했을 때, `target`의 인덱스를 반환한다.
### 입력제한
- 1 <= `nums.length` <= 10⁴
- -10⁴ <= `nums[i]` <= 10⁴
- `nums`는 정수가 중복 없이 오름차순으로 정렬되어 있다.
- -10⁴ <= `target` <= 10⁴
### 풀이핵심
- `target`이 `nums`에 포함되어있지 않을 경우 두 가지 방법으로 `targetIndex`를 구한다.
  1. `target`이 `nums[nums.length-1]`보다 클 경우
     - `targetIndex = nums.length`
  2. `target`이 `nums[nums.length-1]`보다 작을 경우
     - `nums`의 요소를 순차적으로 확인해 `target`보다 큰 요소를 찾는다.
     - 해당 요소 인덱스 이전에 `target`이 위치하면 된다.
### 문제풀이
1. `target`이 `nums`에 포함되어 있는지 아닌지 확인한다.
2. `target`이 `nums`의 마지막 인덱스 요소보다 큰지 아닌지 확인한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/search-insert-position/)
### 태그
`배열` `반복문` `asList()` `contains()` `indexOf()`