# 2367. Number of Arithmetic Triplets
정수형 배열 `nums`와 정수 `diff`가 주어진다.  
- `nums`의 요소는 인덱스 값이 커질 수록 점점 큰 값을 가진다.
- `diff`는 어떠한 두 정수의 차이 값을 가진다.

`nums`의 요소들 중 `산술 삼항식` 조건을 만족하는 경우의 수를 구해 반환한다.  
`삼항식(i, j ,k)`이 아래의 조건을 충족하면 `산술 삼항식`이다.  
- `i < j < k`
- `nums[j] - nums[i] == diff` && `nums[k] - nums[j] == diff`
### 입력제한
- 3 <= `nums.length` <= 200
- 0 <= `nums[i]` <= 200
- 1 <= `diff` <= 50
- `nums`는 점점 증가하는 요소로 구성된다.
### 풀이핵심
- `nums`의 요소가 점점 증가한다고 되어있는데 간편하게 오름차순으로 정렬된 정수형 배열이다.
- `nums[i]`를 선택했을 때 조건을 충족하는 `nums[j], nums[k]`가 있는 경우의 수를 확인하면 된다. 
### 문제풀이
1. 정수형 배열 `nums`를 `List<Integer> numList`로 변환한다.
2. 선택한 요소 `nums[i]`에 `diff`를 더한 값이 `numList`에 있는지 확인
   - 값이 있다면 `checkArtithmeticTriplet()`를 통해 세 번째 값도 확인
   - 두 번째, 세 번째 값이 모두 존재할 경우 `count`의 값을 `1`증가 시킴
3. (2)의 과정을 인덱스 `0`부터 `nums.length-3`까지 반복한다.
   - `삼항식`을 만들기 위해선 요소가 최소 3개가 있어야하므로 `nums`의 뒤에서 세번째 요소까지 반복한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/number-of-arithmetic-triplets/)
### 태그
`반복문`