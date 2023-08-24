# 589. N-ary Tree Preorder Traversal
`n-ary`트리의 `root`가 주어지면, 노드의 사전 순회 순서를 반환한다.  
`Nary-Tree`의 입력 직렬화는 레벨 순서 순열로 표현된다. 각 자식 그룹은 `null`값으로 구분된다.
### 입력제한
- 트리 안의 노드 개수는 `[0, 10⁴]`범위를 가진다.
- 0 <= `Node.val` <= 10⁴
- `n-ary`트리의 높이는 `1000`이하이다.
### 풀이핵심
- `사전 순회`라는건 결국 왼쪽 노드부터 쭉 훑고 오른쪽 노드까지 모든 노드를 탐색하는 것
### 문제풀이
1. 멤버 `List<Integer> result`를 생성한다. 노드의 `val`을 순차적으로 저장한다.
2. 만약 `root`가 `null`일 경우 `result`를 반환한다.
3. `(2)`와 반대의 경우 `addVal()`를 호출한다.
    - `addVal()` : 매개변수인 노드의 `val`값을 `result`에 저장한다.
      - 또한 `root.children`의 모든 노드를 매개변수로하여 `addVal()`을 호출한다.
4. `(3)`의 과정이 끝나면 `result`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/n-ary-tree-preorder-traversal/)
### 태그
`재귀 호출` `다시 한 번 풀어볼 문제`