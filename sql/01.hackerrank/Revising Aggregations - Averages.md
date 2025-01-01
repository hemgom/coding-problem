# Problem interpretation
`District` 가 `California` 인 도시의 `평균 인구` 를 쿼리한다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `ID` : 도시 ID
    - `NAME` : 도시명
    - `COUNTRYCODE` : 국가코드
    - `DISTRICT` : 지역구
    - `POPULATION` : 도시인구
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`CITY` 테이블에서 `district` 값이 `California` 인 레코드들의 `population` 평균을 구하염 된다.
<br/><br/><br/>

# Solution
```mysql
SELECT AVG(population)
FROM city
WHERE district = 'California'
```
<br/><br/>

## Link
- [hackerrank - Revising Aggregations - Averages](https://www.hackerrank.com/challenges/revising-aggregations-the-average-function/problem?isFullScreen=true)