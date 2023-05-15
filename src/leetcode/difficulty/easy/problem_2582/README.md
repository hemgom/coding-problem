# 2582.Pass the Pillow
사람은 n명으로 첫 번째 사람부터 n번째 사람이 한 줄로 줄을 선다.  
베개는 첫 번째 사람이 가진채로 시작한다. 매초마다 다음 사람에게 베개를 전달한다.  
방향을 유지하며 다음 사람에게 전달하다가 끝 사람에게 베개가 도달하면 방향이 바뀌어 전달된다.  
입력 값으로 **사람의 수(n)** 와 **제한시간(time)** 이 주어진다.  
입력된 시간 후에 베개를 들고 있는 사람이 몇 번 째인지를 반환한다.  
### 입력제한
- 2 <= n <= 1000
- 1 <= time <= 1000
### 문제풀이
1. n명이 있을 경우 방향이 바뀌기까지 필요한 시간은 **n-1** 초다. 즉, n-1 초마다 베개의 이동방향이 바뀐다.
2. 주어진 시간(time)을 n-1 로 나누었을 때 몫은 변경된 방향의 횟수, 나머지는 이동시간이 된다.
   - (2)의 몫을 2로 나누었을 때 나머지가 0 이면 나머지 이동시간의 이동 방향은 정방향(1 -> n)이다.
   - (2)의 몫을 2로 나우었을 때 나머지가 1 이면 나머지 이동시간의 이동 방향은 역방량(n -> 1)이다.
3. 남은 이동시간을 이동 후 해당 값을 반환한다.
   - 정방향인 경우 : 1 + 남은시간 = 현재 베개를 가진 사람의 순서
   - 역방향인 경우 : n - 남은시간 = 현재 베개를 가진 사람의 순서
### 문제출처
- [leetcode](https://leetcode.com/problems/pass-the-pillow/)