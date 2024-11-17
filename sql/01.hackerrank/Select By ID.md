# Problem interpretation
`ID` 가 `1661` 인 `CITY` 테이블의 레코드를 쿼리한다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `id` : 도시 ID
    - `name` : 도시 이름
    - `countrycode` : 나라 코드
    - `district` : 구역 or 지역
    - `population` : 도시 인구 수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`CITY` 테이블에서 `id` 값이 `1661` 인 행을 결과 테이블에 담아 반환했다.
<br/><br/><br/>

# Solution
```mysql
SELECT * FROM city
WHERE id = 1661
```
<br/><br/>

## Link
- [hackerrank - Select By ID](https://www.hackerrank.com/challenges/select-by-id/problem?isFullScreen=true)