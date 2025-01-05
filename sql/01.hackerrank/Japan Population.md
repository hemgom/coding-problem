# Problem interpretation
`CITY` 에 있는 모든 일본 도시의 인구 합계를 쿼리한다. 일본의 국가 코드는 `JPN` 이다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `ID` : 도시ID
    - `NAME` : 도시이름
    - `COUNTRYCODE` : 국가코드
    - `DISTRICT` : 지역, 구
    - `POPULATION` : 인구수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`CITY` 테이블에서 `countrycode` 값이 `JPN` 인 레코드들의 `population` 값의 합계를 구해 결과 테이블에 담아 반환하면 된다.
<br/><br/><br/>

# Solution
```mysql
SELECT SUM(population)
FROM city
WHERE countrycode = 'JPN'
```
<br/><br/>

## Link
- [hackerrank - Japan Population](https://www.hackerrank.com/challenges/japan-population/problem?isFullScreen=true)