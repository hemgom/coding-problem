# Problem interpretation
다음 두 결과 집합을 생성한다.
1. 알파벳순으로 정렬된 `OCCUPATIONS` 의 모든 이름 목록을 쿼리하고, 바로 뒤에 각 직업의 첫 글자를 괄호로 묶어 표시합니다.
    - 예를 들어 `AnActorName(A), ADoctorName(D), AProfessorName(P), ASingerName(S)` 입니다.
2. 직업에서 각 직업의 발생 횟수를 쿼리한다. 발생 횟수를 `오름차순` 으로 정렬하고 다음 형식으로 출력한다.
    - `There are a total of [occupation_count] [occupation]s.`
    - `[occupation_count]` : `OCCUPATIONS` 에서 해당 직업의 발생 횟수
    - `[occupation]` : 소문자로 된 직업 이름
    - 두 개 이상의 직종에 동일한 `[occupation_count]` 가 있는 경우 알파벳 순으로 정렬해야 한다.
- `Note` : 테이블에는 각 직업 유형에 대해 최소 두 개 이상의 항목이 있다.
<br/><br/>

## Constraints
- `OCCUPATIONS` 테이블의 레코드는 `특정 인원의 이름과 직업 이름 정보` 를 나타낸다.
    - `Name` : 이름
    - `Occupation` : 직업 이름
<br/><br/>

## Category
`Database`
<br/><br/><br/>

# Description
문제에서 원하는 것은 `OCCUPATIONS` 의 정보를 통해 각 인원의 `이름(직업 첫 글자)` 정보와 `모든 직업별 인원수 정보` 를 갖는 정보를 담은 결과 테이블이다.
- 우선적으로 `이름(직업 첫 글자)` 정보를 출력해야 하며 해당 정보는 `이름` 을 기준으로 `오름차순` 정렬되어야 한다.
- 그 다음엔 `직업별 인원수 정보` 를 출력해야 하며 `인원수, 직업이름` 순으로 `오름차순` 정렬되어야 한다.
<br/>

문제 해결을 위해 아래의 임시 테이블을 사용했다.
- `name_and_letter` : `이름(직업 이름 첫 글자)` 정보를 갖는 임시 테이블
- `occupation_count` : `직업별 인원 수` 정보를 갖는 임시 테이블
- `results` : `결과 테이블에 출력할 문자열 정보` 를 갖는 임시 테이블, 문제에서 주어진 양식에 맞게 출력하기 위해 사용
<br/>

이후 `name_and_letter` 와 `results` 임시 테이블을 `UNION ALL` 을 사용해 합쳐 결과 테이블을 반환하였다.
- 이 때 문제의 요구사항을 만족하기 위해 두 임시 테이블을 `오름차순` 으로 정렬하였다.
<br/><br/><br/>

# Solution
```mysql
WITH
name_and_letter AS (
    SELECT CONCAT(name, '(', SUBSTRING(occupation, 1, 1), ')') AS value
    FROM occupations
),
occupation_count AS (
    SELECT CONCAT(LOWER(occupation), 's') AS occupation,
           COUNT(occupation) AS count
    FROM occupations
    GROUP BY occupation
),
results AS (
    SELECT CONCAT('There are a total of ', count, ' ', occupation, '.') AS result
    FROM occupation_count
    
)

SELECT * FROM name_and_letter
UNION ALL
SELECT * FROM results
ORDER BY 1
```
<br/><br/>

## Link
- [hackerrank - The PADS](https://www.hackerrank.com/challenges/the-pads/problem?isFullScreen=true)