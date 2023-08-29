# 1974. Minimum Time to Type Word Using Special Typewriter
자판으로 영어 소문자 `'a'`부터 `'z'`를 가지는 원형 타자기가 있다.  
타자기는 `포인터`로 자판을 가리키고 있으며 포인터가 원하는 문자 자판을 가리켜야 입력이 가능하다.  
포인터는 최초에는 문자 `'a'`를 가리키고 있다.  

![ex_typewriter](https://assets.leetcode.com/uploads/2021/07/31/chart.jpg)  

매초마다 아래의 작업 중 하나를 수행할 수 있다.  
1. 포인터를 시계 방향 또는 반시계 방향으로 한 글자 `이동`한다.
2. 포인터가 현재 가리키는 문자를 `입력`한다.  

문자열 `word`가 주어질 때, 입력에 걸리는 `최소 시간`을 반환한다.
### 입력제한
- 1 <= `word.length()` <= 100
- `word`는 `영소문자`로 구성된다.
### 풀이핵심
- `원하는 문자로 포인터를 옮기는 시간 + 입력시간(1초)`가 문자하나를 입력하는데 걸리는 시간이다.
- 입력시간은 고정이니 `포인터를 옮기는 시간`을 최소로하는데 집중한다.
  - `시계방향`으로 옮기는데 걸리는 시간과 `반시계방향`일 때의 시간을 비교해 더 빠른 시간을 사용한다.
### 문제풀이
1. 문자를 `int`타입에 저장하면 아스키코드 값이 저장된다.
    - `pointer` : 현재 자판기가 가리키는 문자
    - `target` : `pointer`가 이동할 문자
    - `time` : `word`를 입력하는데 걸리는 총 시간
    - `forward` : 시계방향(정방향)으로 `pointer`를 `target`으로 옮길 때 걸리는 시간
2. `word`의 길이 만큼 아래의 연산을 반복한다.
   - `target`에 `word`의 문자를 저장한다.
   - `target`과 `pointer`의 값이 같다면 `time`에 입력시간(1초)만 더해 저장한다.
     - 저장 후 바로 다음 반복으로 넘어간다.
   - `target`과 `pointer`의 값이 다를 경우
     - `forward`에 `target - pointer`를 저장한다.
       - `forward(시계) = target - pointer` `반시계 = 26(자판의 갯수) - forward`
     - `시계 방향`과 `반시계 방향` 중 더 적게 걸린 시간에 `1(입력시간)`을 더한 값을 `time`에 더해 저장한다.
     - `pointer`가 이동했으므로 `target`의 값을 저장한다.
3. `(2)`의 반복 과정이 끝났다면 `time`을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/)
### 태그
`ASCII 코드`