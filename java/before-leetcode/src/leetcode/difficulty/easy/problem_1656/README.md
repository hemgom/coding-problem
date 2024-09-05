# 1656. Design an Ordered Stream
임의의 순서로 입력되는 n(idKey, value) 쌍의 스트림이 있다.  
이 때, `idKey`는 `1에서 n 사이의 정수`, `value`는 문자열이다.  
같은 `id`를 가지는 두 쌍은 존재하지 않는다.

값을 삽입 할 때마다 `List`를 반환하며 `id`가 증가하는 순서대로 `value`를 반환하는 스트림을 설계한다.  
모든 `List`를 연결하면 정렬된 `전체 List`가 만들어져야 한다.

`OrderedStream` 클래스 구현 : 
   - `OrderedStream(int n)` : `n`개의 값을 저장할 수 있는 스트림을 구축
   - `String[] insert(int idKey, String value)`
     - 스트림에 `idKey, value` 한 쌍을 삽입한다.
     - 현재 삽입된 `idKey`와 `ptr`을 비교해 가능한 가장 큰 청크를 반환한다.


- Example image  
<img width="90%" src="https://assets.leetcode.com/uploads/2020/11/10/q1.gif"/>

### 입력제한
- 1 <= `n` <= 1000
- 1 <= `id` <= `n`
- `value.length() == 5`
- `value`는 오직 영소문자로 구성된다.
- `insert`의 각 호출 시 고유한 `id`를 가진다.
- 삽입을 위해서는 정확하게 `n`번의 호출이 수행된다.
### 풀이핵심
- 문제가 복잡하다 설명도 애매하고 예시 이미지를 보고 이해해서 해당 이미지를 첨부했다.
- 문제를 요약하면 아래와 같다.
  1. `n`개의 `value`를 저장하는 배열이 필요하다.
  2. 배열의 인덱스가 곧 `idKey`가 된다. `idKey`는 랜덤하게 주어진다. 
  3. 배열에는 포인터 `ptr`이 있고 포인터가 가리키는 위치에 `value`가 있어야 해당 값을 반환할 수 있다.
  4. 만약 다음 위치에도 `value`가 있다면 연속적으로 다음 값을 `List`에 저장해 반환하도록한다.
### 문제풀이
1. `String[] arr`를 선언하고 `ptr`을 생성해 `1`로 초기화한다.
   - `OrderedStream(int n)` 생성자를 만들어 저장공간 `n+1`의 `arr`를 생성한다.
   - `n+1`을 저장공간으로 하는 이유는 `index == idKey`로 사용 할 텐데 `idKey`가 `1`부터 시작하기 때문이다.
2. 반환할 목록을 저장할 `List<String> result`를 선언 및 생성한다.
3. 배열 `arr[idKey]`에 `value`를 저장한다.  
4. 만약 입력 받은 `idKey`와 `ptr`이 같지 않다면 `result`를 반환한다. 
5. `(4)`의 반대의 경우 아래와 같은 수행을 빈 `arr[i]`를 찾을 때까지 반복한다.
   - 입력 받은 `idKey(= arr index)` 부터 `value`가 저장된 다른 `arr[i]`까지 `result`에 요소를 저장한다.
   - 반복문이 종료됬다면 `result`를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/design-an-ordered-stream/)
### 태그
`생성자` `ArrayList` 