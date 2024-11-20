# Problem interpretation
`STATION` 테이블에서 아래의 두 값을 쿼리한다.
- `LAT_N` 의 모든 값의 합계는 소수점 이하 자릿수로 반올림된다.
- `LONG_W` 의 모든 값의 합계는 소수점 이하 자릿수로 반올림된다.
<br/>

결과 형식은 아래의 양식을 따른다.
```
lat lon
```
- `lat` : `LAT_N` 의 모든 값 합계
- `lon` : `LONG_W` 의 모든 값 합계
- 두 결과 모두 소수점 이하 2자리로 반올림 되어야 한다.
<br/><br/>

## Constraints
- `STATION` 테이블의 레코드는 `역 정보` 를 나타낸다.
    - `id` : 역 ID
    - `city` : 도시 이름
    - `state` : 주 이름
    - `LAT_N` : 북위
    - `LONG_W` : 서경
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
문제에서 원하는 것은 `STATION` 테이블에 있는 모든 행의 `lat_n, long_w` 의 합산 결과를 `lat, lon` 컬럼에 지정해 결과 테이블로 반환하는 것이다.
- `lat` 은 `LAT_N` 컬럼의 모든 값을 합산한 결과를, `lon` 은 `LONG_W` 컬럼의 모든 값을 합산한 결과를 갖는다.
- 이 때 합산 결과는 소수점 3번째 자리에서 반올림해 2번째 자리까지 표기해야 한다.
<br/><br/><br/>

# Solution
```mysql
SELECT ROUND(SUM(lat_n), 2) AS lat, ROUND(SUM(long_w), 2) AS lon
FROM station
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 2](https://www.hackerrank.com/challenges/weather-observation-station-2/problem?isFullScreen=true)