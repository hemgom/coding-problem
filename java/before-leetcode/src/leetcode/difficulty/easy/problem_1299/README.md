# 1299. Replace Elements with Greatest Element on Right Side
배열 `arr`이 주어질 때, 아래와 같은 연산을 진행한다.  
- 요소 `arr[i]`를 인덱스가 `i`보다 큰 요소들 중 가장 큰 요소 값으로 바꾼다.  
- 마지막 요소는 `-1`로 바꾼다.  

연산된 배열을 반환한다.
### 입력제한
- 1 <= `arr.length` <= 10⁴
- 1 <= `arr[i]` <= 10<sup>5</sup>
### 풀이핵심
- 선택한 요소보다 큰 인덱스를 가진 요소들 중 가장 큰 요소로 선택한 요소를 바꿔준다.
- 마지막 요소보다 큰 인덱스를 가지는 요소가 없으므로 고정적으로 `-1`로 바꾼다.
### 문제풀이
1. `arr`의 길이가 `1`보다 크다면 아래의 과정을 진행한다.
   - 선택한 인덱스 보다 큰 인덱스를 가지는 요소들 중 큰 값을 구해 선택한 인덱스의 요소를 바꾼다. 
   - 인덱스 `0`부터 `arr.length-2`까지 반복한다.
2. `arr`의 마지막 요소 값을 `-1`로 바꾼다.
3. 바뀐 `arr`를 반환한다. 
### 문제출처
- [leetcode](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/)
### 태그
`조건문` `반복문`