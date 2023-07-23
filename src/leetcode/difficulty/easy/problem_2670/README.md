# 2670. Find the Distinct Difference Array
길이 `n`의 정수형 배열 `nums`가 주어진다.  
정수형 배열 `diff`는 요소로 `nums`의 부분 배열의 고유요소 수의 차를 갖는다.  
- `diff[i]` = `nums[0, ..., i]`의 고유요소 갯수 - `nums[i+1, ..., n-1]`의 고유요소 갯수
- `diff.length == nums.length == n`

`nums`의 고유 차수 배열 `diff`를 반환한다.
### 입력제한
- 1 <= `n == nums.length` <= 50
- 1 <= `nums[i]` <= 50
### 풀이핵심
- 인덱스 `i`를 기준으로 고유 요소의 갯수를 구하고 연산을 통해 `diff[i]`를 구한다.
### 문제풀이
1. `nums`의 길이 `n`을 길이로 가지는 `diff`를 생성한다.
2. `nums`의 요소 갯수 만큼 아래의 연산을 반복한다.
   - 인덱스 `i`일 때, `0 ~ i` 범위의 고유 요소 수를 `frontCount`에 저장
   - 인덱스 `i`일 때, `i+1 ~ n-1` 범위의 고유 요소 수를 `backCount`에 저장
   - `diff[i]`에 `frontCount - backCount`를 저장한다.
3. (2)의 과정을 반복 후 `diff`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/find-the-distinct-difference-array/)
### 태그
`반복문` `HashSet`