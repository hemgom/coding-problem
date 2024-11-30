# Problem interpretation
`모음(a, e, i, o, u)` 로 시작하지 않거나 모음으로 끝나지 않는 `STATION` 의 도시 이름 목록을 쿼리한다.
- 결과에 중복이 포함될 수 없다.
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
문제에 주어진 조건을 만족하는 도시 이름들을 결과 테이블에 담아 반환하면 된다.
- 즉, 모음으로 시작하고 끝나는 도시이름을 제외한 데이터를 결과 테이블에 담아 반환하라는 말이다.
<br/><br/><br/>

# Solution
```mysql
SELECT DISTINCT city
FROM station
WHERE city REGEXP('^[^A|E|I|O|U]') OR city REGEXP('[^a|e|i|o|u]$')
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 11](https://www.hackerrank.com/challenges/weather-observation-station-11/problem?isFullScreen=true)