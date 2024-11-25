# Problem interpretation
`STATION` 에서 `모음(ex. a, e, i, o, u)` 으로 시작하는 도시 이름 목록을 쿼리한다.
- 결과에는 중복된 항목이 포함될 수 없다.
<br/><br/>

## Constraints
- `STATION` 테이블의 레코드는 `역 정보` 를 나타낸다.
    - `id` : 역 ID
    - `city` : 도시 이름
    - `state` : 주 이름
    - `lat_n` : 북위
    - `long_w` : 서경
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`city` 컬럼 값의 첫 글자가 `a, e, i, o, u` 중 하나인 값들을 결과 테이블에 담아 반환한다.
- 단, 현재 `city` 컬럼 값은 첫 글자가 모두 대문자이므로 `A, E, I, O, U` 중 하나로 생각하였다.
- `LIKE` 함수를 사용할 경우 다수의 조건에 대해 전부 나열하는 방식을 사용해야 한다.
- 그래서 `REGEXP` 함수를 사용해 `정규표현식` 을 만족하는 `city` 컬럼 값을 찾도록 하였다.
<br/><br/><br/>

# Solution
```mysql
SELECT city
FROM station
WHERE city REGEXP('^[A|E|I|O|U][a-zA-z]*')
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 6](https://www.hackerrank.com/challenges/weather-observation-station-6/problem?isFullScreen=true)