# Problem interpretation
`CITY` 테이블에서 `구(District)` 가 `캘리포니아(California)` 인 모든 도시의 총 인구를 쿼리한다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `id` : 도시 ID
    - `name` : 도시명
    - `countrycode` : 국가코드
    - `district` : 구, 주
    - `population` : 인구수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`CITY` 테이블의 `district` 컬럼 값이 `California` 인 모든 레코드의 `population` 을 합산해 결과 테이블에 담아 반환한다.
<br/><br/><br/>

# Solution
```mysql
SELECT SUM(population) AS total_sum
FROM city
WHERE district = 'California'
```
<br/><br/>

## Link
- [hackerrank - Revising Aggregations-The Sum Function](https://www.hackerrank.com/challenges/revising-aggregations-sum/problem?isFullScreen=true)