# Problem interpretation
`CITY` 테이블에 존재하는 모든 `일본` 도시의 모든 `속성(attribute)` 를 쿼리한다.
- 일본의 `countrycode` 는 `JPN` 이다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `id` : 도시 ID
    - `name` : 도시 이름
    - `countrycode` : 나라 코드
    - district` : 구역
    - `population` : 도시 인구 수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
문제에서 원하는 것은 `CITY` 테이블의 행들 중 `countrycode` 컬럼 값이 `'JPN'` 인 행들을 결과 테이블에 담아 반환하는 것이다.
<br/><br/><br/>

# Solution
```mysql
SELECT * FROM city
WHERE countrycode = 'JPN'
```
<br/><br/>

## Link
- [hackerrank - Japanese Cities Attributes](https://www.hackerrank.com/challenges/japanese-cities-attributes/problem?isFullScreen=true)