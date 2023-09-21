# 599. Minimum Index Sum of Two Lists
두 개의 문자열 배열 `list1` `list2`가 주어진다.  
최소 인덱스 합을 가진 `공통 문자열`(들)을 구해 반환한다.  
- `공통 문자열`은 각 배열에서 공통적으로 나타나는 문자열을 말함
- 최소 인덱스 합을 가진 공통 문자열
  - 문자열이 `list1[i]`와 `list2[j]`에 나타날 때, `i + j`의 최소값인 문자열을 말함  

인덱스 합이 최소인 `모든 공통 문자열`을 반환한다. (단, 순서는 상관 없음)
### 입력제한
- 1 <= `list1.length, list2.length` <= 1000
- 1 <= `list1[i].length(), list2[j].length()` <= 30
- `list1[i]`과 `list2[j]`는 `' '`와 `영소문자`로 구성될 수 있다.
- 각 문자열 배열에 대해 `list1[i]`, `list2[j]`는 `고유한 문자열(중복이 없음)`이다.
- `list1`과 `list2` 사이에 적어도 하나의 `공통 문자열`을 보장한다.
### 풀이핵심
- 같은 문자열을 찾아 각 배열에서의 인덱스의 합을 구한다.
  - 인덱스의 합들 중 최소를 구해 해당 값을 가진 문자열들을 모아 문자열 배열 형태로 반환한다.
### 문제풀이
1. `list2`를 `List`로 변환해 `listTwo`에 저장
2. `list1`의 모든 요소에 대해 아래의 연산을 반복
   - `listTwo`에서 `list1`의 `l1`과 같은 문자열의 인덱스를 `l2Index`에 저장
     - `l2Index`가 `-1`일 경우 같은 문자열이 없기 때문이므로 `l1Index`만 `1` 증가시킨 후 다음 반복을 진행
     - 그 외의 경우
       - `l1Index, l2Index, l1`을 파라미터로 `commonIndexSum`을 호출한다.
3. `(2)`의 과정을 마쳤다면 `result`를 문자열 배열로 형 변환해 반환한다.  

__commonIndexSum(int l1Index, int l2Index, String s)__
1. `indexSum`에 `l1Index + l2Index`를 저장
2. `indexSum`이 `minIndexSum`을 비교해 다음을 수행
   1. `indexSum`이 `minIndexSum`보다 작을 경우
      - `result`의 요소를 초기화(비우기)
      - `result`에 `s`를 추가
      - `minIndexSum`을 `indexSum`으로 갱신
   2. `indexSum`과 `minIndexSum`이 같을 경우
      - `result`에 `s`를 추가
   3. 그 외의 아무것도 수행하지 않음
### 문제출처
- [leetcode](https://leetcode.com/problems/minimum-index-sum-of-two-lists/)
### 태그
`다시 한 번 풀어 볼 문제` `문자열 인덱스` `ArrayList`