# 944. Delete Columns to Make Sorted
길이가 모두 같은 문자열 `n`개를 요소로하는 문자열 배열 `strs`가 주어진다.  
문자열을 각 행에 하나씩 배열해 격자를 만들 수 있다.  
- 예를 들어 `strs = ["abc", "bce", "cae"]`는 아래와 같이 배열할 수 있다.
```markdown
| abc
| bce
| cae
```

배열 후 각 열(세로)의 순서가 `사전순`이 아니라면 해당 열을 삭제하려고 한다.  
- 예시의 열은 `0` `1`열은 사전순이지만 `2`열은 그렇지 않다.
- 결국 `1`개의 열을 삭제해야 한다.

최종으로 `삭제해야 할 열의 개수`를 반환한다.
### 입력제한
- `n == strs.length`
- 1 <= `n` <= 100
- 1 <= `strs[i].length()` <= 1000
- `strs[i]`는 `영소문자`로만 구성된다.
### 풀이핵심
- `strs`의 요소들을 세로로 배치한 후 각 열의 문자들이 `사전순`인지를 확인한다.
### 문제풀이
1. `removeRow`에 삭제할 열의 인덱스를 저장한다. (`HashSet`이므로 중복은 없다)
2. `strs`의 첫 번째 문자열의 문자들을 `letters`에 저장한다.
3. 이후 남은 `strs`의 요소의 개수만큼 아래의 연산을 반복한다.
   - `i`번째 문자열 요소의 문자들을 `nextLetters`에 저장한다.
   - `checkLetters`를 호출해 `nextLetters`의 모든 요소가 `letters`보다 큰지 확인한다.
     - `checkLetters` : 큰 요소가 있다면 문자 배열에 해당 요소를 저장해 반환한다.
       - 없다면 해당 요소의 인덱스를 `removeRow`에 저장한다.
4. `(3)`의 과정을 마쳤다면 `removeRow`의 크기를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/delete-columns-to-make-sorted/)
### 태그
`문자 순서 확인` `사전순서` `HashSet`