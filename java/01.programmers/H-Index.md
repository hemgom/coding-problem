# 문제 분석
[H-Index](https://en.wikipedia.org/wiki/H-index) 를 구하는 문제로 `H-Index` 에 대한 정의는 아래와 같다.
- 과학자가 논문 `n` 개를 발표했을 때, 다른 논문에 인용된 횟수를 `c` 라고 하고, 인덱스를 `i` 라고 하자.
- 모든 `c` 에 대해 `i` 보다 크거나 같은 경우의 수가 `i` 와 같거나 크다면 `i` 는 `h` 라 할 수 있다.
- 그리고 구해진 모든 `h` 들 중 가장 큰 `h` 가 `H-index` 가 된다.
<br/><br/>

문제가 너무 설명 없이 특정 문자로 설명을 대체하려 했기에 해석하는데 어려움이 있어 비교적 상세하게 분석을 적게 되었다. 아래는 정리한 내용을 좀 더 보기 쉽게 나열 한 것이다.
- `citation_count = n`
- `citations[i] = c`
- `i` 는 `citations` 의 가장 큰 요소 이하이거나 `0` 이상 범위의 자연수('0' 포함)이다.
- `h` 는 조건을 만족하는 `H-Index` 가 될 수 있는 값
<br/><br/>

## Constraints
- 과학자가 발표한 논문의 수는 `1` 이상 `1,000` 이하이다.
- 논문별 인용된 횟수는 `0` 이상 `10,000` 이하이다.
<br/><br/><br/>

# 풀이
```java
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int cl = citations.length, hIndex = 0;
        
        for (int i = citations[cl-1]; i >= 0; i--) {
            int useCitation = findBigElements(citations, i);
            if (useCitation >= i) {
                hIndex = i;
                break;
            }
        }
        
        return hIndex;
    }
    
    public int findBigElements(int[] sortArr, int num) {
        int result = 0;
        for (int i = sortArr.length-1; i >= 0; i--) {
            if (sortArr[i] < num) break;
            result++;
        }
        return result;
    }
}
```
<br/><br/>

## 참조 문서
- [programmers - H-Index](https://school.programmers.co.kr/learn/courses/30/lessons/42747)