# 121. Best Time to Buy and Sell Stock
주식 가격이 저장된 배열 `prices`가 주어진다.  
각 인덱스는 날짜로 보며 각 각 배열에 저장된 가격은 당일의 주식가격으로 보면된다.  
주식으로 얻는 가장 큰 이익은 쌀때 사서 비쌀 때 파는 것이다.  
해당 배열을 보고 가장 큰 이익의 결과를 반환한다.  
수익을 얻을 수 없을 경우 `0`을 반환한다.
### 입력제한
- 1 <= prices.length <= 10ⁿ(n=5)
- 0 <= prices[i] <= 10⁴
### 문제풀이
- ` 수익 = 판매 가격 - 구매 가격`이다. 단 우리는 가장 큰 수익을 구해야 한다.
- `sub = prices[i] - minPrice`로 수익을 구하고 구한 값을 비교해서 `subMax`를 구한다.
- `minPrice`의 경우 초기화 값으로 `Integer.MAX_VALUE`를 사용한다.
1. `prices`에 저장된 값을 `prices.length`만큼 순차적으로 읽는다.
   1. `prices[i] < minPrice`일 경우 `minPrice`로 `prices[i]`를 사용한다.
   2. `sub`에 `prices[i] - minPrice`를 저장한다.
   3. `sub > subMax`일 경우 `subMax`는 `sub`가 된다.
- 결국 배열을 순차적으로 읽을 때 `minPrice`를 구하면서도 `subMax`를 갱신해야한다.
2. `subMax`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
### 태그
`다시 풀어봐야 할 문제`