# 1475. Final Prices With a Special Discount in a Shop
가격이 저장된 정수형 배열 `prices`가 주어지며, `prices[i]`는 상점 물품의 원래 가격이다.  

상점에는 특별 할인이 있다. `i`번째 상품을 구매하면 `prices[j]`에 해당하는 할인을 받게 된다.  
- `i < j` `prices[i] >= prices[j]`를 만족하는 최소 인덱스가 `j`이다.
- 위의 조건을 충족하지 못한다면 할인 혜택을 받을 수 없다.

할인 혜택을 고려해서 혜택이 적용된 가격을 배열에 저장해 반환한다.
### 입력제한
- 1 <= `prices.length` <= 500
- 1 <= `prices[i]` <= 1000
### 풀이핵심
- 특정 가격 `prices[i]`가 있다면 할인 가격은 `i`보다 큰 인덱스에서 찾는다.
  - `할인 가격(prices[j])` : 원래가격 보다 작거나 같은 요소들 중 가장 작은 인덱스를 가진 요소
  - 할인 적용 가격 : `prices[i] - prices[j]`
### 문제풀이
- 인덱스 `0`부터 `prcies.length - 2`까지 반복문을 수행한다.
   - `prices[i]`의 가격을 할인 혜택에 적용된 가격으로 수정한다.
   - 할인 혜택이 적용된 가격은 `discountPrice()`를 사용한다.
- `discountPrice(int[] prices, int index, int price)` : `index + 1`부터 `prices.length - 1`까지 반복문을 수행한다.
  - `prices[j]`가 `price`(원래가격)보다 작거나 같으면 `price - prices[j]`(할인 혜택 적용가)를 반환한다.
  - 만약 조건에 부합하는 `prices[j]`가 존재하지 않는다면 할인혜택이 없으므로 `price`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/)
### 태그
`할인가 계산`