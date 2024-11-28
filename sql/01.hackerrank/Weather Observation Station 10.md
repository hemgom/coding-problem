# Problem interpretation
`모음(a, i, e, o, u)` 으로 끝나지 않는 `STATION` 의 도시 이름 목록을 쿼리한다. 결과에는 중복이 포함될 수 없다.
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
`정규표현식` 을 활용해 `city` 컬럼 값 중 모음으로 끝나지 않는 값들만을 결과 테이블에 담아 반환하였다.
- 결과 테이블에 중복을 포함하지 않으므로 `DISTINCT` 를 사용해 중복을 제거 해주었다.
<br/><br/><br/>

# Solution
```mysql
SELECT DISTINCT city
FROM station
WHERE city REGEXP('[^a|i|o|u|e]$')
```
<br/><br/>

## Link
- [hackerrank - Weather Observation Station 10](https://www.hackerrank.com/challenges/weather-observation-station-10/problem?isFullScreen=true)