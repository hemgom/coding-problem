# Problem interpretation
`STUDENTS` 에서 `75점` 보다 높은 점수를 받은 학생의 이름을 쿼리한다.
- 각 이름의 마지막 세 글자를 기준으로 출력 순서를 정한다.
- 두 명 이상의 학생이 모두 마지막 세 글자로 끝나는 이름이 같은 경우(ex. Bobby, Robby 등), ID 를 기준으로 오름차순 정렬한다.
<br/><br/>

## Constraints
- `STUDENTS` 테이블의 레코드는 `학생 점수 정보` 를 나타낸다.
    - `id` : 학생 ID
    - `name` : 학생 이름
    - `marks` : 점수
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
문제에서 원하는 것은 `makrs > 75` 인 학생들을 결과 테이블에 담아 반환하는 것이다.
- 단, 결과 테이블 반환전에 학생의 `name` 의 뒤 세 글자를 기준으로 오름차순 정렬해야 한다.
- 만약 뒤 세 글자가 같은 경우 `id` 를 기준으로 오름차순 정렬한다.
<br/><br/><br/>

# Solution
```mysql
SELECT name
FROM students
WHERE marks > 75
ORDER BY RIGHT(name, 3), id
```
<br/><br/>

## Link
- [hackerrank - Higher Than 75 Marks](https://www.hackerrank.com/challenges/more-than-75-marks/problem?isFullScreen=true)