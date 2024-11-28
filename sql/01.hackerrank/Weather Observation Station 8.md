# Problem interpretation
첫 번째와 마지막 문자가 모두 `모음(a, e, i, o, u)` 인 `STATION` 의 도시 이름 목록을 쿼리한다. 결과에는 중복된 항목이 포함될 수 없다.
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
`STATION` 테이블의 `city` 컬럼 값들 중 시작 문자와 마지막 문자가 모음인 값들을 결과 테이블에 담아 반환하면 된다.
- 정규표현식을 사용해 이를 만족하는 `city` 컬럼 값들을 조회하였다.
- 조회한 결과에 중복된 값이 있을 수 있으므로 `DISTINCT` 를 사용해 중복을 제거하였다.
<br/><br/><br/>

# Solution
```mysql
SELECT DISTINCT city
FROM station
WHERE city REGEXP('^[a|e|i|o|u][a-zA-z\\s]*[a|e|i|o|u]$')
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 8](https://www.hackerrank.com/challenges/weather-observation-station-8/problem?isFullScreen=true)