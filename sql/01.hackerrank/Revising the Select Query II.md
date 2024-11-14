# Problem interpretation
CITY 테이블에서 인구가 `120,000` 보다 큰 모든 `미국` 도시에 대해 `name` 컬럼을 쿼리한다.
- 미국의 `countrycode` 는 `USA` 이다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `id` : 테이블의 기본 키(고유) 역할, 도시 ID
    - `name` : 도시 이름
    - `countrycode` : 나라 코드
    - `district` : 지역 or 구역 이름
    - `population` : 도시 인구수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
문제에서 요구하는 것은 인구 수가 `12만` 보다 많으면서 소속 나라가 `USA` 인 도시의 이름을 결과 테이블에 담아 반환하는 것이다.
<br/><br/><br/>

# Solution
```mysql
SELECT name
FROM city
WHERE population > 120000 AND countrycode = 'USA'
```
<br/><br/>

## Link
- [hackerrank - Revising the Select Query II](https://www.hackerrank.com/challenges/revising-the-select-query-2/problem?isFullScreen=true)