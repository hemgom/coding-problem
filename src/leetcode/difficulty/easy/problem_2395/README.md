# 2395. Find Subarrays With Equal Sum
정수형 배열 `nums`가 주어질 때, 요소의 합이 같은 길이 `2`의 하위 배열 2개가 존재 여부를 확인한다.  
두 개의 하위 배열은 서로 다른 인덱스에서 시작한다는 점을 유의한다.  

이러한 하위 배열 2개가 존재하면 `true`를 반환, 아닌 경우 `false`를 반환한다.  

하위 배열 `subarrays`는 배열 내에서 비어 있지 않으며, 연속적인 요소를 가진다.
### 입력제한
- 2 <= `nums.length` <= 1000
- -10<sup>9</sup> <= `nums[i]` <= 10<sup>9</sup>
### 풀이핵심
- 길이가 `2`인, `nums`의 하위 배열은 연속된 요소를 가질 수가 있다.
  - 시작 인덱스가 `i`인 `nums[i]`를 가지면 자동으로 `nums[i+1]` 또한 가지게 된다.
- 이러한 하위 배열들이 있을 때, 하위배열 요소의 합이 같은 경우의 여부를 확인하면 된다.
### 문제풀이
1. `HashSet<Integer> elementSum`을 생성 후 하위 배열 요소의 합을 저장한다.
2. `nums`의 하위 배열 경우의 수는 `nums.length-1`가지이다.
   - 하위 배열의 길이는 `2`로 고정이고 요소는 연속된 요소만 가질 수 있기 때문이다.
   - 시작 인덱스 기준으로 `i`가 `0 ~ nums.length-2` 동안 연산을 반복한다.
3. 연산의 경우 아래와 같이 수행한다.
   - `nums[i] + nums[i+1]`를 `elementSum`에 추가한다.
   - 추가 시 실패할 경우는 이미 같은 요소가 있기 때문이다.
   - 실패한 경우 `checkResult`에 `1`을 저장 후 반복문을 벗어난다.
4. `checkResult`가 `1`인지 확인 후 `true` 또는 `false`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/find-subarrays-with-equal-sum/)
### 태그
`반복문` `HashSet`