# Problem interpretation
`CITY` 테이블의 모든 도시에 대한 평균 인구를 가장 가까운 정수로 반올림해 쿼리한다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `ID` : 도시 ID
    - `NAME` : 도시 이름
    - `COUNTRYCODE` : 국가 코드
    - `DISTRICT` : 지역, 구
    - `POPULATION` : 인구 수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`CITY` 테이블의 모든 레코드를 대상으로 `population` 컬럼의 평균을 구해 이를 소수점 `1의 자리` 에서 반올림한 정수 값을 결과 테이블에 담아 반환한다.
<br/><br/><br/>

# Solution
```mysql
SELECT ROUND(AVG(population), 0)
FROM city
```
<br/><br/>

## Link
- [hackerrank - Average Population](https://www.hackerrank.com/challenges/average-population/problem?isFullScreen=true)