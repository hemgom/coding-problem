# 303. Range Sum Query - Immutable
정수형 배열이 주어지면 다음의 기능을 수행하도록 한다.

- NumArray 클래스
   - 매개변수 `nums`를 입력 받아 객체를 초기화 한다.
- int sumRange(int left, int right)
   - `nums`의 일정 범위의 인덱스를 가지는 요소들의 합을 구하는 메서드
   - `left`를 시작 값으로 `right`를 포함하는 범위

※ 문제에 정의 된 클래스명은 `NumArray`이지만 풀이코드의 클래스 명은 `Solution_303`으로 한다.
### 입력제한
- 1 <= s.length <= 10⁴
- -10ⁿ <= nums[i] <= 10ⁿ (n = 5)
- 0 <= left <= right < nums.length
- `sumRange` 메서드는 총 10⁴ 만큼 호출 가능하다.
### 풀이핵심
- 매개변수 `nums`를 가진 생성자를 통해 초기화를 한다.
- 배열의 일정 범위 요소들의 합을 구하는 메서드를 작성한다.
### 문제풀이
- 멤버 변수 `int[] nums`를 선언한 후 매개변수가 있는 생성자를 통해 객체를 초기화한다.
- `sumRange(int left, int right)`를 통해 특정 범위의 배열 요소의 합을 구한다.
   - 배열의 인덱스가 `i`라고 했을 때 범위는 `left <= i <= right`이다.
   - 반복문을 통해 배열 요소들의 합을 `result` 변수에 더해 저장하고 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/range-sum-query-immutable/)
### 태그
`생성자 초기화`