# 2200. Find All K-Distant Indices in an Array
정수형 배열 `nums`와 정수 `k`와 `key`가 주어진다.

`k-distant index`의 정의는 아래와 같다.
- `|i - j| <= k`, `nums[i] == key` 모두를 충족할 경우
- `j`가 하나 이상 존재하는 `nums`의 인덱스 `i`

모든 `k-distant index`들의 리스트를 오름차순으로 정렬하여 반환한다.
### 입력제한
- 1 <= `nums.length` <= 1000
- 1 <= `nums[i]` <= 1000
- `key`는 `nums`의 요소입니다.
- 1 <= `k` <= `nums.length`
### 풀이핵심
- `key`와 같은 요소의 인덱스를 기준으로 `±k` 범위의 모든 인덱스가 `k-distant index`에 해당한다.
- 즉, `key == nums[i]`일 때, `i-k <= k-distant index <= i+k`이다.
### 문제풀이
1. `nums`의 요소를 인덱스 `0`부터 `nums.length-1`까지 순차적으로 `key`와 비교한다.
2. `nums[i] == key`일 경우 아래의 연산을 수행한다.
   - 해당 경우 `k-distant index`가 될 수 있는 인덱스의 범위는 `i-k <= k-distant <= i+k`이다.
   - 하지만 최소 최대 범위에 `nums`의 인덱스가 영향을 줄 수 있으므로
     - `i+k`와 `nums.length-1` 중에 작은 값을 범위의 최대값
     - `i-k`와 `0` 중에 큰 값을 범위의 최소값
   - 해당 범위의 모든 인덱스를 `kDistant`에 추가한다.
     - 중복이 없고, 요소의 순서가 유지되어야 하므로 `LinkedHashSet`을 사용한다.
3. `(1) ~ (2)` 과정을 `nums`의 요소수 만큼 반복 후, `kDistant`를 `List`로 변환해 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/)
### 태그
`반복문` `다시 한 번 풀어야 할 문제` `LinkedHashSet` `Math.min()`, `Math.max()`