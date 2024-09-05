# 2717. Semi-Ordered Permutation
`n`개의 정수로 구성된 `순열` `nums`가 주어진다.
- 순열 : 각 숫자가 정확히 한 번씩 포함된 `1부터 n까지`의 정수 시퀀스이다.  

만약 첫 번째 숫자가 `1`이고 마지막 숫자가 `n`인 순열을 `반순열`이라고 한다.  
`nums`를 반순열로 만들기 위해 필요한 최소 연산 횟수를 반환한다.
- 연산 : `nums[i]`는 인접한 요소를 선택해 서로의 위치를 바꿈
  - ex) `nums[i]`의 경우 `nums[i-1]` 또는 `nums[i+1]` 중 하나와 자릴 바꿀 수 있다.
### 입력제한
- 2 <= `nums.length` == `n` <= 50
- 1 <= `nums[i]` <= 50
- `nums`는 `순열`이다.
### 풀이핵심
- `1`와 `nums.length`를 값으로 가지는 요소들의 위치를 알아낸다.
- 인접한 요소와 자리를 바꿔 이동을 하기 떄문에 `거리 = 스왑 횟수`이다.
### 문제풀이
1. `oneIndex` `nIndex`를 `-1`로 초기화 한다.
    - 각각의 변수에는 `1`과 `nums.length`의 위치를 저장한다.
2. `nums`의 요소를 순차적으로 비교한다.
    - `nums[i]`가 `1`도 `nums.length`도 아니라면 다음 반복을 진행한다.
    - `nums[i]`가 `1`이라면 `i`를 `oneIndex`에 저장
    - `nums[i]`가 `nums.length`라면 `i`를 `nIndex`에 저장
3. `(2)`의 반복이 끝났다면 `oneIndex`와 `nIndex`의 값을 비교해 결과를 반환한다.
    - `oneIndex`가 `nIndex`보다 앞에 위치할 경우
      - `oneIndex` `nIndex` 각각 현재 위치와 목표 위치와의 거리를 구해 더한 값을 반환
    - `nIndex`가 `oneIndex`보다 앞에 위치할 경우
      - 둘 중 하나를 옮기면 나머지 하나와 스왑을 반드시 한 번 하므로 앞에 위치하는 경우의 결과에서 `-1`해 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/semi-ordered-permutation/)
### 태그
`인덱스 간 거리 계산`