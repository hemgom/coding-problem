# Problem interpretation
CITY 테이블의 모든 행(=레코드) 에 대한 모든 열(=컬럼)을 쿼리한다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `id` : 테이블의 기본 키(고유) 역할, 도시 ID
    - `name` : 도시 이름
    - `countrycode` : 국가 코드
    - `district` : 구역 or 지역
    - `population` : 도시 인구 수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`CITY` 테이블의 레코드가 가진 모든 컬럼을 조회하는 쿼리를 작성하면 된다.
<br/><br/><br/>

# Solution
```mysql
SELECT * FROM city
```
<br/><br/>

## Link
- [hackerrank - Select All](https://www.hackerrank.com/challenges/select-all-sql/problem?isFullScreen=true)