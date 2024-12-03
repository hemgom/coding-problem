# Problem interpretation
`Employee` 테이블에서 월급이 `2000달러` 이상이고 직원으로 근무한 기간이 `10개월` 미만인 직원의 이름 목록을 조회하는 쿼리를 작성한다.
- `employee_id` 를 기준으로 오름차순으로 결과를 정렬한다.
<br/><br/>

## Constraints
- `Employee` 테이블의 레코드는 `직원 정보` 를 나타낸다.
    - `employee_id` : 직원 ID
    - `name` : 직원 이름
    - `months` : 근속 개월
    - `salary` : 월 급여
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
`Employee` 테이블의 `salary >= 2000` 이고 `months < 10` 인 레코드의 `name` 컬럼 값을 결과 테이블에 담아 반환하면 된다. 단, 정렬의 경우 `employee_id` 기준 `오름차순` 정렬해야 한다.
<br/><br/><br/>

# Solution
```mysql
SELECT name
FROM employee
WHERE salary >= 2000 AND months < 10
ORDER BY employee_id
```
<br/><br/>

## Link
- [hackerrank - Employee Salaries](https://www.hackerrank.com/challenges/salary-of-employees/problem?isFullScreen=true)