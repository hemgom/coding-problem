# 1822. Sign of the Product of an Array
반환 값이 있는 함수 `signFunc(x)`가 있다.
- `x`가 양수라면 `1`
- `x`가 음수라면 `-1`
- `x`가 `0`이라면 `0`  

정수형 배열 `nums`가 주어지고, `nums`의 모든 요소들의 곱의 결과를 `product`라 할 때  
`signFunc(product)`를 반환한다.
### 입력제한
- 1 <= `nums.length` <= 1000
- -100 <= `nums[i]` <= 100
### 풀이핵심
- `nums`의 모든 요소의 곱의 결과를 언급하나 중요한건 `음수`인지 `양수`인지, `0`인지 이다.
- `곱셈`의 성질을 이용한다 `-`피연산자가 짝수라면 양수일 것이고 홀수라면 음수일 것이다.
  - 당연하지만 요소들 중 `0`이 하나라도 있다면 결과는 `0`이다.
### 문제풀이
1. `nums`의 요소 `num`을 하나씩 꺼내 확인한다.
2. `num`이 `0`이라면 `0`을 반환하고, `num`이 음수라면 `negativeCount`를 `1`증가시킨다.
3. `(1) ~ (2)`의 과정을 `nums`의 요소 수 만큼 반복 후 아래의 과정을 수행한다.
   - `checkEvenNumber`에 `negativeCount`를 `2`로 나눈 나머지 값을 저장한다.
   - 만약 `checkEvenNumber`가 `0`이 아니라면 모든 요소들의 곱의 결과는 홀수이다.
     - `-1`을 반환한다.
4. 여기까지 왔다면 모든 요소들의 결과는 짝수이다.
   - `1`을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/sign-of-the-product-of-an-array/)
### 태그
`정수 곱셈` `홀수 or 짝수 구분`
