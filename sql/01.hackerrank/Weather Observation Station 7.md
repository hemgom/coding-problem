# Problem interpretation
`STATION` 에서 `모음(a, e, i, o, u)` 로 끝나는 도시 이름 목록을 쿼리한다. 결과에 중복이 포함될 수 있다.
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
`도시 이름` 의 마지막 글자가 모음인 `city` 값들을 모아 결과 테이블에 담으면 된다.
- 문제에서 말한 대로 `city` 값이 중복될 수 있으므로 `DISTINCT` 를 통해 중복되는 값을 제외해야 한다.
<br/><br/><br/>

# Solution
```mysql
SELECT DISTINCT city
FROM STATION
WHERE city REGEXP('[a|e|i|o|u]$')
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 7](https://www.hackerrank.com/challenges/weather-observation-station-7/problem?isFullScreen=true)