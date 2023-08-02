# 1137. N-th Tribonacci Number
`트리보나치 수열`에서 T<sub>n</sub>은 아래와 같이 정의된다.  
`n >= 0`일 때, T<sub>0</sub> = 0, T<sub>1</sub> = 1, T<sub>2</sub> = 1 그리고 T<sub>n+3</sub> = T<sub>n</sub> + T<sub>n+1</sub> + T<sub>n+3</sub>이다.  
정수 `n`이 주어질 때, T<sub>n</sub>의 값을 반환한다.
### 입력제한
- 0 <= `n` <= 37
- 반환 값은 32비트 정수, 즉 answer <= 2<sup>31 -1</sup> 에 맞도록 보장된다.
### 풀이핵심
- `n >= 3`부터는 T<sub>n+3</sub> = T<sub>n</sub> + T<sub>n+1</sub> + T<sub>n+3</sub>를 이용해야한다.
- 결국 `3`부터 `n`까지 순차적으로 T<sub>n</sub>을 구해야한다.
### 문제풀이
1. 일단 이미 정해진 값은 바로 값을 반환 해준다.
   - T<sub>0</sub> = 0, T<sub>1</sub> = 1, T<sub>2</sub> = 1 의 경우
2. `n >= 3` 경우에는 반복문을 통해 순차적으로 `int tN`을 구해준다.
   - `tN = tA + tB + tC`이라고 할 때 반복문 수행마다 저장된 값을 옮겨준다.
   - `tB -> tA` `tC -> tB` `tN -> tC`로 저장 값을 옮긴다.
   - 해당 반복문은 `3 <= i <= n` 동안 진행한다.
3. `(1)`의 과정을 건너뛰고 `(2)`의 과정을 진행했다면 `tN`을 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/n-th-tribonacci-number/)
### 태그
`트리보나치 수열`