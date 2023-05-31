# 2331. Evaluate Boolean Binary Tree
아래 내용과 같은 속성을 가진 이진트리 `root`가 주어진다. 

`leaf-node`는 `0` 또는 `1` 값을 갖는다.  
`0`은 `false`를 `1`은 `true`를 나타낸다.  

`leaf-node`를 제외한 노드는 `2` 또는 `3` 값을 갖는다.  
`2`는 `Boolean OR`을 `3`은 `Boolean AND`를 나타낸다.

노드가 `leaf-node`면 평가는 노드의 값이다.  
그렇지 않다면 노드의 두 자식을 평가하고 그 값의 `Boolean`연산을 함께 적용한다.  
루트 노드를 평가한 `Boolean` 결과를 반환한다.

`leaf-node`는 자식이 `0개`인 노드이다.
### 입력제한
- 트리의 노드 수의 범위 [1,1000]
- 0 <= Node.val <= 3
- 모든 노드에는 0개 또는 2개의 자식이 있다.
- `leaf-node`의 값은 `0` 또는 `1` 이다.
- `leaf-node`가 아닌 노드의 값은 `2` 또는 `3` 이다.
### 풀이핵심
노드를 읽어오고 입력된 값에 따라 조건문을 수행한다.  
`재귀함수` 와 `조건연산자`를 활용해 `boolean`형 값을 반환한다. 
### 문제풀이
- `root` 노드의 첫 번째 노드를 읽는다.
  1. `root`의 `val` 값이 `0` 또는 `1`일 경우 `leaf-node`이다.
     - `leaf-node`는 `val` 값을 평가해 바로 반환한다.
     - `0`은 `false`, `1`은 `true`이다.
  2. `root`의 `val` 값이 `2`일 경우, 하위 노드의 주소를 사용해 해당 노드를 평가한다.
     - 자식노드의 평가는 `재귀함수`를 활용해 `evaluateTree(root.left)`를 호출한다.
     - 자식노드를 평가한 두 값을 `Boolean OR`를 적용해 평가한다.
     - `Boolean OR` : 두 피연사자가 모두 거짓일 경우에만 `false` 하나라도 참이라면 `true`를 반환
  3. `root`의 `val` 값이 `3`일 경우, 하위 노드의 주소를 사용해 해당 노드를 평가한다.
     - 자식노드의 평가는 `재귀함수`를 활용해 `evaluateTree(root.left)`를 호출한다.
     - 자식노드를 평가한 두 값을 `Boolean AND`를 적용해 평가한다.
     - `Boolean AND` : 두 피연사자가 모두 참일 경우에만 `true` 하나라도 거짓이라면 `false`를 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/evaluate-boolean-binary-tree/)
### 태그
`이진 트리` `boolean` `재귀함수`