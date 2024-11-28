# Problem interpretation
모음으로 시작하지 않는 `STATION` 의 도시 이름 목록을 쿼리한다. 결과에 중복이 포함될 수 없다.
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
`city` 의 컬럼 값중 `모음(A, I, O, U, E)` 으로 시작하지 않는 값들을 결과 테이블에 담아 반환하면 된다.
- 전체 `city` 목록에는 중복이 존재할 수 있으므로 `DISTINCT` 로 중복을 제거한다.
- `city` 의 값들은 첫 글자가 대문자로 작성되어 있기에 `영대문자 모음` 을 정규식표현에 사용하였다.
<br/><br/><br/>

# Solution
```mysql
SELECT DISTINCT city
FROM station
WHERE city REGEXP('^[^AIOUE]')
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 9](https://www.hackerrank.com/challenges/weather-observation-station-9/problem?isFullScreen=true)