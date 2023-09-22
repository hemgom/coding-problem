# 2739. Total Distance Traveled
트럭에 두 개의 연료 탱크가 있다.  
각 탱크의 연료를 `L` 단위로 나타내는 정수 `mainTank`와 `additionalTank`가 주어진다.  
- 트럭의 `1L`당 주행거리는 `10km`
- `mainTank`에서 `5L`가 소모될 때마다 `additionalTank`으로 부터 `1L`가 전송

주어진 연료로 주행할 수 있는 최대 거리를 반환한다.  

※ 참고 : 추가 탱크의 연료 보급은 연속적으로 이루어지지 않으며 `5L`가 소모됨과 동시에 이루어진다.
### 입력제한
- 1 <= `mainTank, additionalTank` <= 100
### 풀이핵심
- 주어진 연료로 갈 수 있는 최대 거리를 반환한다.
### 문제풀이
1. `mainTank`가 `0`이 될 때까지 아래의 연산을 반복
   - `distance`를 `10` 증가
   - `mainTank`를 `1` 감소
   - `useOil`을 `1` 증가
   - `useOil`의 값에 따라 다음을 수행
     1. `5`가 아닐 경우
        - 바로 다음 반복을 진행
     2. `5`일 경우
        - `useOil`을 `0`으로 초기화
        - `additionalTank`에 연료가 `1L`이상 남아있다면
          - `mainTank`를 `1` 증가
          - `additionalTank`를 `1` 감소
2. `(1)`의 과정을 마쳤다면 `distance`를 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/total-distance-traveled/)
### 태그
`최대 주행거리 반환`