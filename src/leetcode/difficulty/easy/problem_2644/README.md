# 2644. Find the Maximum Divisibility Score
2개의 정수 배열 `nums`와 `divisors`가 주어진다.  
`divisors[i]`의 `나눗셈 점수`는 `divisors[i]`가 나눌 수 있는 `nums[j]`의 개수이다.  
`나눗셈 점수`가 가장 높은 `divisors[i]`를 반환한다.  
- 단, 점수가 동일한 경우가 있다면 크기가 작은 `divisors[i]`를 반환한다.
### 입력제한
- 1 <= `nums.length, divisors.length` <= 10³
- 1 <= `nums[i], divisors[j]` <= 10<sup>9</sup>
### 풀이핵심
- 결국 `나눗셈 점수`란 `divisors[i]`의 배수 개수이다.
### 문제풀이
1. `divisors[i]`마다 `nums`에서 배수를 찾아 그 개수를 `divScore`에 저장한다.
2. `maxScore`와 `divScore`를 비교해 저장 값을 갱신한다.
   - `maxScore`가 큰 경우 : 다음 반복을 진행
   - `divScore`가 큰 경우
     - `maxScore`에 `divScore`를 저장
     - `result`에 `divisor`를 저장
     - 위의 연산이 후 다음 반복을 진행
   - 두 변수가 값이 같은 경우 : `result`와 `divisor`를 비교해 작은 값을 `result`에 저장
3. `(2)`의 과정이 끝났다면 `result`를 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/find-the-maximum-divisibility-score/)
### 태그
`배수의 개수`