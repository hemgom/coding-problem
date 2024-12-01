# Problem interpretation
`모음(a, i, e, o, u)` 으로 시작하지 않고 모음으로 끝나지 않는 `STATION` 의 도시 이름 목록을 쿼리한다.
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
첫 글자와 마지막 글자가 `모음` 이 아닌 `city` 값들을 결과 테이블에 담아 반환한다. 이 때, 중복은 제거해야 한다.
<br/><br/><br/>

# Solution
```mysql
SELECT DISTINCT city
FROM station
WHERE city REGEXP('^[^A|I|E|O|U][a-z\\s]*[^a|i|e|o|u]$')
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 12](https://www.hackerrank.com/challenges/weather-observation-station-12/problem?isFullScreen=true)