# 697. Degree of an Array
음수가 아닌 정수를 요소로하는 정수형 배열 `nums`가 주어진다.  
`nums`의 `차수`는 요소들 중 가장 높은 빈도로 정의된다.  

`nums`의 차수를 가진 요소가 모두 포함하는 `nums의 부분 배열(연속적인)`들 중에 가장 짧은 길이를 반환한다.
### 입력제한
- 1 <= `nums.length()` <= 50,000
- 0 <= `nums[i]` < 50,000
### 풀이핵심
- 복잡하긴 하지만 `nums` 중 가장 많은 요소의 갯수를 찾고 그 요소를 모두 포함하는 부분 배열(연속적인)의 길이를 찾으면 된다.
### 문제풀이
1. `HashMap<Integer, int[]>`를 생성한다. `key` 값은 중복이 없는 점을 활용한다.
   - `key` 값에 `nums`의 요소를 저장한다.
   - `value` 값에 정수형 배열을 저장한다. 틀은 `{i, i, 1}`으로 `{최초 인덱스, 마지막 인덱스, 빈도 수}`이다. 
2. `map`에 `key 값`으로 `nums[i]`가 없을 경우 `nums[i], {i, i, 1}`을 저장한다.
   - 만약 `key 값`에 `nums[i]`가 존재한다면 `value 값`을 수정한다.
     - `int[] keyValue = {i, i, 1}`이라고 할 때
     - `keyValue[1]`에 저장된 인덱스를 `nums[i]`로 수정한다.
     - `keyValue[2]`의 값을 `1`증가시킨다.
3. `(2)`의 과정이 끝나면 `map`에 저장된 값들 중 빈도 수가 가장 높으며, 길이가 가장 짧은 값을 찾는다.
   - `keyCount`에는 요소의 빈도 수를 저장하며 더 큰 값이 있다면 갱신한다.
   - `smallestLength`에는 `마지막인덱스 - 최초인덱스 + 1`의 값을 저장한다.(부분 배열의 조건이 연속적이므로)
   - `smallestLength`는 더 작은 값이 있다면 갱신한다.
4. `(3)`의 과정이 끝나면 `smallestLength`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/degree-of-an-array/)
### 태그
`HashMap` `key` `value` 