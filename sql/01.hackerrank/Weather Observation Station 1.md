# Problem interpretation
`STATION` 테이블에서 도시 및 주 목록을 쿼리한다.
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
`STATION` 테이블에 존재하는 `city` 컬럼과 `state` 컬럼을 결과 테이블에 담아 반환하면 된다.
<br/><br/><br/>

# Solution
```mysql
SELECT city, state
FROM station
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 1](https://www.hackerrank.com/challenges/weather-observation-station-1/problem?isFullScreen=true)