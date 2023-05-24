# 108. Convert Sorted Array to Binary Search Tree
오름차순으로 정렬된 배열 `nums`가 주어진다.  
`nums`에 저장된 값을 이진트리 형식으로 저장하려고 한다.  
단, 모든 노드의 하위 트리 깊이가 같아야 한다. 
### 입력제한
- 1 <= prices.length <= 10⁴
- -10⁴ <= nums[i] <= 10⁴
- `nums`는 무조건 오름차순 정렬 상태로 주어진다.
### 문제풀이
- 핵심은 `단말 노드`들의 `깊이` 값은 모두 같아야 한다는 것이다.
- 이를 위해서 반복적으로 일정 범위의 중간 값을 활용해 이를 충족해준다.
1. 주어진 배열에 저장된 값들 중 중간 크기의 값을 구한다.
2. (1) 값을 `root node`로 사용한다.
   - (1) 의 인덱스보다 적은 인덱스의 값들은 `root node`의 `left node`에 저장한다.
   - (1) 의 인덱스보다 큰 인덱스의 값들은 `root node`의 `right node`에 저장한다.
3. 저장하는 반복 과정을 `재귀함수`를 활용해 구현한다.
   - `재귀함수` : 함수가 직접적이든 간접적이든 자신을 호출하는 프로세스
### 문제출처
- [leetcode](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)
### 태그
`다시 풀어봐야 할 문제` `재귀함수` `이진트리`