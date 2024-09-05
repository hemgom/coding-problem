# 2236. Root Equals Sum of Children
정확하게 `루트 노드` `좌측 하위 노드` `우측 하위 노드` 3개의 노드로 구성된 이진 트리의 루트가 주어진다.  
두 자식 노드 값의 합과 루트 노드 값이 같다면 `true`를 반환하고 그렇지 않다면 `false`를 반환한다.
### 입력제한
- -100 <= `Node.val` <= 100
- 트리는 `루트 노드` `왼쪽 자식 노드` `오른쪽 자식 노드`로 구성된다.
### 풀이핵심
- 단순하게 자식노드 값의 합과 루트노드 값을 비교해 결과를 반환한다.
### 문제풀이
1. `sumChildNode`에 `root`의 자식노드 값(`root.left.val & root.right.val`)의 합을 저장한다.
2. 루트노드의 값(`root.val`)과 `sumChildNode`를 비교한다.
    - 둘이 같다면 `true`를 반환
    - 다르다면 `false`를 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/root-equals-sum-of-children/)
### 태그
`노드 값 비교`