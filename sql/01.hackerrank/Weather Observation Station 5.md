# Problem interpretation
`STATION` 테이블에서 가장 짧은 도시 이름과 가장 긴 도시 이름을 쿼리한다.
- 가장 작거나 큰 도시가 두 개 이상 있는 경우 알파벳 순으로 나열할 때 가장 먼저 오는 도시를 선택한다.
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
`STATION` 테이블의 `city` 컬럼의 값에서 길이가 가장 작은 값과 가장 긴 값을 구하는 문제이다.
- 단, 가장 작거나 큰 값을 갖는 데이터가 여럿일 경우 사전순(알파벳순)으로 빠른 데이터를 반환한다.
<br/>

나의 경우 각 `city` 의 `길이(=length)` 에 대한 정보를 추가한 `city` 임시 테이블과 `city` 테이블의 `length` 의 최소/최대 값 정보를 갖는 `length_min_max` 임시 테이블을 생성했다.
- 이후 `city` 임시 테이블의 `lenght` 별로 우선순위(오름차순, 알파벳순)를 매긴 정보를 추가해 `city_priority` 임시 테이블을 생성했다.
- 결과 테이블에는 `city_priority` 임시 테이블의 `priority = 1` 을 만족하고 `length` 가 `length_min_max` 임시 테이블의 `min_length` 또는 `max_length` 를 만족하는 행의 `city, length` 정보를 담아 반환하였다.
<br/><br/><br/>

# Solution
```mysql
WITH
city AS (
    SELECT city, LENGTH(city) length
    FROM station
),
length_min_max AS (
    SELECT MIN(length) min_length, MAX(length) max_length
    FROM city
),
city_priority AS (
    SELECT *,
           RANK() OVER(PARTITION BY length ORDER BY city) priority
    FROM city
)

SELECT city, length
FROM city_priority
WHERE priority = 1 AND (length = (SELECT min_length FROM length_min_max) OR length = (SELECT max_length FROM length_min_max))
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 5](https://www.hackerrank.com/challenges/weather-observation-station-5/problem?isFullScreen=true)