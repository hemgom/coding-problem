# 1460. Make Two Arrays Equal by Reversing Subarrays
길이가 같은 정수열 배열 `target`과 `arr`가 주어진다.  
각 배열의 요소는 하위 배열을 선택해 요소를 반전시킬 수 있고 여러 번 반복 가능하다.  
`arr`를 `target`과 같게 만들 수 있다면 `true`를 반환, 없다면 `false`를 반환한다.
### 입력제한
- `target.length` == `arr.length`
- 1 <= `target.length` <= 1000
- 1 <= `target[i]` <= 1000
- 1 <= `arr[i]` <= 1000
### 풀이핵심
- 말이 복잡하나 결국 `target`과 `arr`가 서로 같은 요소 종류와 각각의 개수가 모두 같아야 한다는 말이다.
- 즉 그냥 두 배열의 모든 요소를 오름차순으로 정렬한 후 두 배열에 다른 부분이 없는지 확인한다.
### 문제풀이
1. `target`과 `arr`의 요소를 오름차순으로 정렬한다.
2. `target`의 길이만큼 아래의 연산을 반복한다.
   - `target[i]`와 `arr[i]`가 서로 다르다면 `false`를 반환
3. `(2)`의 과정을 마쳤다면 `true`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/)
### 태그
`배열 정렬` `Arrays.sort()` `배열(요소) 비교`