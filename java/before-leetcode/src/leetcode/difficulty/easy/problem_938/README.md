# 938. Range Sum of BST
이진 검색 트리의 `TreeNode root`와 두개의 정수 `low` `high`가 주어질 때  
`low <= val <= high`에 해당하는 모든 노드의 `val`값을 더해 반환한다.
### 입력제한
- 트리의 노드 수는 `[1, 2 * 10⁴]`범위이다.
- 1 <= `Node.val` <= 10<sup>5</sup>
- 1 <= `low` <= `high` <= 10<sup>5</sup>
- 모든 `Node.val`은 중복이 없다.(유니크)
### 풀이핵심
- 이진 트리의 경우 부모 노드의 값보다 작은 값이 좌측 하위 노드에 큰 값이 우측 하위 노드에 저장된다.
- 만약 부모 노드의 `val` 값으로 불필요한 재귀를 막는다.
### 문제풀이
1. 만약 `root`가 `null`이라면 `-1`을 반환한다.
   - 어차피 최종적으로 `count`가 반환되므로 재귀를 끝내기 위해 `-1`을 반환한다.
2. `val`에 노드의 값을 저장한다.
   - 만약 `low <= val <= high`에 부합한다면 `value`에 `val`을 더해 저장한다.
3. `val > low`인 경우 왼쪽 하위노드에 대해 `rangeSumBST()`를 호출한다.
4. `val < high`인 경우 오른쪽 하위노드에 대해 `rangeSumBST()`를 호출한다.
5. 모든 `재귀호출`을 마쳤다면 `value`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/range-sum-of-bst/)
### 태그
`재귀호출` `이진 탐색 트리` `노드 값 비교`