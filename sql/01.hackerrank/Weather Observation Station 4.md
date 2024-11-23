# Problem interpretation
`STATION` 테이블의 전체 행의 개수에서 고유한 도시에 대한 행의 개수를 뺀 값을 구한다.
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
`STATION` 테이블의 `city` 컬럼 값을 기준으로 총 행(=레코드)의 개수와 고유한 도시의 개수를 구해 두 값의 차이를 구해 반환하면 된다.
<br/><br/><br/>

# Solution
```mysql
SELECT COUNT(city) - COUNT(DISTINCT city)
FROM station
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 4](https://www.hackerrank.com/challenges/weather-observation-station-4/problem?isFullScreen=true)