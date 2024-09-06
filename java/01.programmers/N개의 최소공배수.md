# 문제 분석
`N` 개의 요소를 가진 정수형 배열 `arr` 가 주어질 때, 모든 요소들의 공배수들 중 가장 작은 `최소공배수` 를 찾아 반환하는 문제이다.
<br/><br/>

나의 경우 `arr` 요소들 중 가장 큰 요소의 배수를 구해 `arr` 의 모든 요소로 나누었을 때 나머지가 `0`, 즉 나누어진다면 연산을 중지하고 해당 배수를 반환하는 방식으로 문제를 해결했다.
<br/><br/>

## Constraints
- `arr` 가 가질 수 있는 길이의 범위는 `1 <= arr.length <= 15` 이다.
- `arr` 의 요소 `arr[i]` 는 `100` 이하의 자연수이다.
<br/><br/><br/>

# 풀이
```java
import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int maxValue = arr[arr.length-1];
        int multipleNum = 1;
        int result = 0;
        while (true) {
            int corret = 0;
            result = maxValue * multipleNum;
            
            for (int num : arr) {
                if (result % num != 0) break;
                corret++;
            }
            
            if (corret == arr.length) break;
            multipleNum++;
        }
        
        return result;
    }
}
```
<br/><br/>

## 참조 문서
- [programmers - N개의 최소공배수](https://school.programmers.co.kr/learn/courses/30/lessons/12953)