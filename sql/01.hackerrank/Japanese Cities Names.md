# Problem interpretation
`CITY` 테이블에 있는 모든 일본 도시의 이름을 쿼리한다.
- 일본의 국가 코드는 `JPN` 이다.
<br/><br/>

## Constraints
- `CITY` 테이블의 레코드는 `도시 정보` 를 나타낸다.
    - `id` : 도시 ID
    - `name` : 도시 이름
    - `countrycode` : 국가 코드
    - `district` : 구역 or 지구
    - `population` : 도시 인구 수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`countrycode` 가 `'JPN'` 인 레코드의 `name` 컬럼 값을 결과 테이블에 담아 반환하면 된다.
<br/><br/><br/>

# Solution
```mysql
SELECT name
FROM city
WHERE countrycode = 'JPN'
```
<br/><br/>

## Link
- [hackerrank - Japanese Cities Names](https://www.hackerrank.com/challenges/japanese-cities-name/problem?isFullScreen=true)