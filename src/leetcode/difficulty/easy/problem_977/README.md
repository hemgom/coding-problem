# 977. Squares of a Sorted Array
오름차순으로 정렬된 정수 배열 `nums`가 주어진다.  
각 요소의 `제곱`을 오름차순으로 정렬한 배열을 반환한다.
### 입력제한
- 1 <= `nums.length` <= 10⁴
- -10⁴ <= `nums[i]` <= 10⁴
- `nums`는 오름차순으로 정렬됨을 보장한다.
### 풀이핵심
- `nums`에 음의 정수가 존재하면 해당 수를 제곱하면 양의 정수가 된다.
  - 즉, 제곱한 결과를 통해 재정렬이 필요하다.
### 문제풀이
1. 아래의 정수를 생성 및 초기화한다.
   - `fIndex` : `nums`의 제일 값이 작은 요소의 인덱스를 저장, 초기값 `0`
   - `bIndex` : `nums`의 제일 값이 큰 요소의 인덱스를 저장, 초기값 `nums.length - 1`
   - `result` : `nums`의 요소를 제곱한 결과들을 저장하는 정수 배열, 길이는 `nums`와 동일
   - `i` : `result`의 인덱스, 초기값 `back`
2. `fIndex`가 `bIndex`보다 작거나 같을 때까지 아래의 연산을 반복한다.
   - `nums[fIndex]`와 `nums[bIndex]`의 절대값에 따라 연산을 진행
     1. 절대값이 `nums[fIndex]`가 큰 경우
        - `result[i]`에 `nums[fIndex]`의 제곱을 저장, `fIndex`를 `1` 증가시킴
     2. 절대값이 `nums[bIndex]`가 크거나 같은 경우
        - `result[i]`에 `nums[bIndex]`의 제곱을 저장, `bIndex`를 `1` 감소시킴
   - `i`를 `1` 증가시킴
3. `(2)`의 과정을 마쳤다면 `result`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/squares-of-a-sorted-array/)
### 태그
`오름차순` `절대값`