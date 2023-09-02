# 1518. Water Bottles
정수 `numBottles`는 물이 가득찬 병의 개수이다.  
상점에서는 `numExchange`만큼의 빈 병을 물이 가득찬 병 `한 개`로 교환해준다.  
- 가득찬 물병을 마시게 되면 빈 물병으로 바뀐다.

두 정수 `numBottles`와 `numExchange`가 주어지면 마실 수 있는 물병의 최대 개수를 반환한다.
### 입력제한
- 1 <= `numBottles` <= 100
- 2 <= `numExchange` <= 100
### 풀이핵심
- `물을 마셔 빈 병이 생김 -> 빈 병을 새 물병으로 교환`의 과정을 반복한다.
  - 이 과정을 더 이상 마실 물병이 없을 때까지 반복한다.
### 문제풀이
1. 아래의 변수를 생성해 `0`으로 초기화한다.
   - `drinkCount` : 마신 물병의 개수를 저장
   - `empty` : 빈 물병의 개수를 저장
2. `마실 물병(numBottles)`이 없을 때까지 아래의 연산을 반복한다.
   - 물을 마셨을 때의 상황
     - `drinkCount`에 `numBottles`를 더해 저장한다.
     - `empty`에 `numBottles`를 더해 저장한다.
   - 빈 물병을 교환했을 때의 상황
     - `numBottles`에 교환한 새 물병의 개수를 저장한다.
     - `empty`를 `numExchange`로 나눈 나머지를 `empty`에 저장한다.
3. `(2)`의 과정을 마쳤다면 `drinkCount`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/water-bottles/)
### 태그
`빈 병 교환`