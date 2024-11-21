# Problem interpretation
`STATION` 에서 도시 이름 목록을 쿼리해 `id` 가 짝수인 도시를 찾는다. 결과를 임의의 순서로 인쇄하되 중복된 항목은 답변에서 제외한다.
<br/><br/>

## Constraints
- `STATION` 테이블의 레코드는 `역 정보` 를 나타낸다.
    - `id` : 역 ID
    - `city` : 도시 이름
    - `state` : 주 이름
    - `lat_n` : 북위
    - `long_w` : 서경
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
구해야 하는 것은 결국 `id` 컬럼이 짝수인 행의 `city` 컬럼 값들의 목록이다. 목록을 구했다면 해당 목록에서 중복되는 값을 제외하고 결과 테이블에 담아 반환하면 된다.
<br/><br/><br/>

# Solution
```mysql
SELECT DISTINCT city
FROM station
WHERE MOD(id, 2) = 0
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 3](https://www.hackerrank.com/challenges/weather-observation-station-3/problem?isFullScreen=true)