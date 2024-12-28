# Problem interpretation
`CITY` 테이블에서 `100,000` 보다 인구수가 많은 도시의 수를 쿼리한다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `id` : 도시 ID
    - `name` : 도시명
    - `countrycode` : 국가코드
    - `district` : 도시가 속한 주 이름
    - `popluation` : 인구수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`population` 의 값이 `100,000` 보다 큰 레코드의 개수를 구해 결과 테이블에 담아 반환하면 된다.
<br/><br/><br/>

# Solution
```mysql
SELECT COUNT(*)
FROM city
WHERE population > 100000
```
<br/><br/>

## Link
- [hackerrank - Revising Aggregations-The Count Function](https://www.hackerrank.com/challenges/revising-aggregations-the-count-function/problem?isFullScreen=true)