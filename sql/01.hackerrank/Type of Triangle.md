# Problem interpretation
삼각형 테이블의 세 변 길이를 사용해 각 레코드의 유형을 식별하는 쿼리를 작성한다. 테이블의 각 레코드에 대해 어떤 삼각형인지를 출력한다.
- `Equilateral` : 변의 길이가 같은 삼각형(= 정삼각형)
- `Isosceles` : 이등변은 변의 길이가 같은 삼각형(= 이등변 삼각형)
- `Scalene` : 길이가 다른 변을 가진 삼각형(= 일반 삼각형)
- `Not A Triangle` : 주어진 A, B, C 의 값이 삼각형을 형성하지 않는다.
<br/><br/>

## Constraints
- `TRIANGLES` 테이블의 레코드는 `세 변의 길이 정보` 를 나타낸다.
    - `A` : `A` 변의 길이
    - `B` : `B` 변의 길이
    - `C` : `C` 변의 길이
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`TRIANGLES` 테이블의 레코드 정보(= 세 변의 길이)를 통해 어떤 삼각형인지 파악후 해당 정보를 결과 테이블에 담아 반환해야 하는 문제이다.
- 각 레코드의 정보를 토대로 삼각형인지 파악하고 삼각형이라면 어떤 삼각형인지 아니라면 아니다라는 정보를 반환해야 한다.
- 삼각형의 조건은 모든 변을 기준으로 `두 변의 길이가 나머지 한 변의 길이보다 커야` 한다.
    - 그렇기에 `3가지` 의 경우 중 하나라도 위의 경우를 만족하지 못한다면 삼각형이 되지 못한다.
    - 이 때 `Not A Triangle` 값을 갖는다.
- `정삼각형` 은 모든 변의 길이가 같은 삼각형을 말한다.
    - `a = b = c` 를 만족한다면 `Equilarteral` 값을 갖는다.
- `(일반) 삼각형` 은 `이등변삼각형, 정삼각형` 이 아닌 삼각형을 말한다. 즉, 모든 변의 길이가 달라야 한다.
    - `a, b, c` 의 길이가 서로 모두 다르면 `Scalene` 값을 갖는다.
- `이등변삼각형` 은 세 변중 두 변의 길이가 같은 삼각형을 말한다.
    - 가장 조건문을 작성하기 복잡해 위 세 경우(삼각형 아님, 정삼각형, 일반 삼각형)가 아닐 경우 `Isosceles` 값을 갖도록 하였다.
    - 즉, 위 세 경우를 제외한 나머지 경우 `이등변 삼각형` 으로 보았다.
<br/><br/><br/>

# Solution
```mysql
SELECT CASE WHEN a+b <= c OR b+c <= a OR c+a <= b THEN 'Not A Triangle'
            WHEN a = b AND b = c THEN 'Equilateral'
            WHEN a != b AND b != c AND c != a THEN 'Scalene'
            ELSE 'Isosceles' END AS triangle_type
FROM triangles
```
<br/><br/>

## Link
- [hackerrank - Advanced Select](https://www.hackerrank.com/challenges/what-type-of-triangle/problem?isFullScreen=true)