# 2032. Two Out of Three
세 개의 정수형 배열 `nums1`, `nums2`, `nums3`이 주어진다.  
세 개의 배열을 비교해 적어도 두 개의 배열에 속한 요소들을 포함한 배열을 반환한다.

결과 배열의 요소들의 순서는 임의의 순서로 반환해도 무방하다.
### 입력제한
- 1 <= `nums1.length`, `nums2.length`, `nums3.length` <= 100
- 1 <= `nums1[i]`, `nums2[j]`, `nums3[k]` <= 100
### 풀이핵심
- 배열을 2개씩 비교해 공통 요소들을 뽑아내고 중복된 요소들을 제거한다.
### 문제풀이
1. `intersection()`메서드를 통해 두 배열의 공통 요소 배열을 반환
   - 적어도 2개의 배열에 속한 요소들이 목표이므로 3번 진행한다.
   - `nums1 & nums2`, `nums1 & nums3`, `nums2 & nums3`
   - 정수형배열을 입력받아 컬렉션(List)타입을 반환하므로 타입변환이 필요하다.
     - 입력값의 타입이 정수형 배열이므로 `IntStream`타입에서 `Stream<Integer>`로 변환필요
     - `boxed()`를 통해 변환을 해준다.
     - `collect(Collectors.toList())`를 사용해 `List<Integer>`를 반환한다.
2. `twoOutOfThree()`메서드를 통해 공통요소들을 합치고 중복을 제거
   - (1) 과정의 결과(List)를 `concat()`메서드로 합친다.
   - 중복된 요소의 값이 필요 없으므로 `distinct()`메서드로 중복을 제거한다.
   - 결과를 `collect(Collectors.toList())`를 통해 `List<Integer>`타입으로 반환
### 문제출처
- [leetcode](https://leetcode.com/problems/two-out-of-three/)
### 태그
`스트림` `다시 풀어봐야 할 문제`