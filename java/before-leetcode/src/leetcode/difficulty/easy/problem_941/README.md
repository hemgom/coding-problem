# 941. Valid Mountain Array
정수 배열 `arr`가 주어질 때, `산(mountain)` 배열이라면 `true`를 아니라면 `false`를 반환한다.  
`산 배열`은 아래의 경우를 만족해야 한다.
- `arr.length >= 3`
- `arr`의 인덱스 중에서 아래와 같은 `i`가 존재해야 한다.
  - `arr[0] < arr[1] < ... < arr[i-1] < arr[i]`
  - `arr[i] > arr[i+1] > ... > arr[arr.length-2] > arr[arr.length-1]`

![ex_img](https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png)
### 입력제한
- 1 <= `arr.length` <= 10⁴
- 0 <= `arr[i]` <= 10⁴
### 풀이핵심
- `arr`에 값이 제일 큰 요소(산 정상) 왼쪽으로는 모든 요소가 오름차순, 오른쪽은 내림차순이어야 한다.
  - 단, 중간에 값이 같은 경우는 없어야 한다.
### 문제풀이
1. `arr`의 길이가 `3`미만이라면 `false`를 반환한다.
   - `산 배열`이 되려면 적어도 3개 이상의 요소가 있어야 하므로
2. 필요한 변수를 선언 및 초기화한다.
   - `before` : 이전 요소의 값을 저장, 초기 값은 `arr[0]`
   - `topIndex` : `가장 큰 요소(산 정상)`의 인덱스르 저장, 초기 값은 `-1`
   - `now` : 현재 요소의 값을 저장
3. `arr`의 인덱스 `1`부터 `산 정상`을 찾을 때까지 아래의 연산을 반복한다.
   - `now`에 `arr[i]`를 저장
   - `before`와 `now`가 같다면 `false`를 반환
     - `산 정상`의 왼쪽 요소는 순차적으로 커져야 하므로
   - `before`가 `now`보다 크다면 반복을 종료
   - `before`에 `now`를 저장, `topIndex`에 `i`를 저장
4. `(3)`의 과정이 끝났다면 `산 정상`을 찾았다는 것
   - 단, `arr[arr.length-1]`은 산 정상이 될 수 없다.
   - `topIndex`가 `arr`의 마지막 인덱스와 같다면 `false`반환
5. `topIndex`이후 부터 나머지 `arr`요소들이 순차적으로 작아지는지 확인한다.
   - `now`에 `arr[j]`를 저장
   - 만약 `before`가 `arr[j]`보다 작거나 같다면 `false`를 반환
     - 작은 경우 : `topIndex`이후로는 모든 요소가 순차적으로 작아져야함
     - 같은 경우 : `arr[0]`은 `산 정상`이 될 수 없음(`topIndex` 초기 값은 `-1`)
   - `before`에 `now`를 저장
6. `(5)`의 과정을 끝냈다면 `산 배열`의 조건을 만족하므로 `true`를 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/valid-mountain-array/)
### 태그
`산(mountain) 배열` `배열 요소 비교`