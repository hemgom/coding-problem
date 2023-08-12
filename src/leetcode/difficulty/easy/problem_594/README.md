# 594. Longest Harmonious Subsequence
`조화로운 배열`은 배열 요소의 최대값과 최소값의 차이가 정확하게 `1`인 배열이라 정의한다.  

정수 배열 `nums`가 주어질 때, 가능한 길이가 가장 긴 `조화로운 배열`의 길이를 반환한다.  
- 배열의 일부 또는 특정 요소를 제거해 `조화로운 배열`을 만든다.
### 입력제한
- 1 <= `nums.length` <= 2 * 10⁴
- -10<sup>9</sup> <= `nums[i]` <= 10<sup>9</sup>
### 풀이핵심
- 결국 `nums`의 부분 배열을 만들 때 최대값과 최소값의 차이가 `1`인 배열을 만들어야한다.
  - 즉, `num`의 요소 2개로 부분 배열을 만들며 그 중 제일 길이가 긴 부분 배열을 반환한다.
### 문제풀이
1. 포인터 개념의 `operandA`와 `operandB`를 생성해 각각 `0`과 `1`로 초기화한다.
   - 앞으로 해당 변수를 움직여 결과를 계산한다.
2. `operandB`가 `nums.length-1`이 될 때까지 아래의 연산을 반복한다.
   - `opernadA`와 `operandB`를 인덱스로 했을 때 `nums` 요소의 차이를 구해 `subValue`에 저장한다.
   - 만약 `subValue`가 `1`이라면
     - `biggestLength`와 비교해 더 큰 값을 `biggestLength`에 저장한다.
   - `subValue`가 `1`의 값을 비교하면
     - `subValue`가 `1`보다 작거나 같다면 두 요소는 같은 값의 요소이거나 차이가 `1`인 요소이다.
       - `operandB`를 `1` 증가시킨다.
     - 그 외의 경우 새로운 종류의 요소가 추가 되었거나 `1`보다 큰 요소가 추가된 것이다.
       - `operandA`를 `1` 증가시킨다.
3. `(2)`의 과정을 마쳤다면 `biggestLength`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/longest-harmonious-subsequence/)
### 태그
`다시 풀어 볼 문제` `포인터 개념 접근`