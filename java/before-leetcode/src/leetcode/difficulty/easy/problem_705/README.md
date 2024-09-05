# 705. Design HashSet
기본 제공 `Hash table 라이브러리`를 사용하지 않고 `HashSet`을 설계한다.  
`Solution_705` 클래스를 구현한다.  
- `void add(key)` : `key`를 `HashSet`에 추가
- `boolean contains(key)` : `key`가 `HashSet`에 존재하는지 확인
- `void remove(key)` : `key`를 `HashSet`에서 삭제, 만약 존재하지 않는다면 아무것도 하지 않음
### 입력제한
- 0 <= `key` <= 10<sup>6</sup>
- `add` `remove` `contains`를 위해 최대 `10⁴`의 호출이 이루어진다.
### 풀이핵심
- 3개의 메서드를 호출하면 주어진 목적에 맞게 수행될 수 있게 구현한다.
### 문제풀이
1. boolean 배열 `keys`를 명시
2. 클래스를 객체화시 길이 `1000001`을 같는 boolean 배열을 생성
3. `add` 메서드 사용 시 `key`를 인덱스로 하여 해당 위치에 `true` 저장
4. `remove` 메서드 사용 시 `key`를 인덱스로 하여 해당 위치에 `false` 저장
5. `contains` 메서드 사용 시 `key`를 인덱스로 하여 해당 위치의 요소를 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/design-hashset/)
### 태그
`뭔가 만들다만 문제`