# Problem interpretation
`Employee` 테이블에서 직원 이름 목록(즉, 이름 속성)을 알파벳 순서로 인쇄하는 쿼리를 작성한다.
<br/><br/>

## Constraints
- `Employee` 테이블의 레코드는 `직원 정보` 를 나타낸다.
    - `employee_id` : 직원 ID
    - `name` : 직원 이름
    - `months` : 근속 개월
    - `salary` : 월급
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
결과 테이블에 `name` 컬럼을 담아 반환한다. 이 때, 정렬을 `name` 컬럼을 기준 오름차순 정렬하면 된다.
<br/><br/><br/>

# Solution
```mysql
SELECT name
FROM employee
ORDER BY name
```
<br/><br/>

## Link
- [hackerrank - Employee Names](https://www.hackerrank.com/challenges/name-of-employees/problem?isFullScreen=true)