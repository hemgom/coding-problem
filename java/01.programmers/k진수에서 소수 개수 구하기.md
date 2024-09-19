# 문제 분석
양의 정수 `n` 과 `k` 가 주어질 때, `n` 을 `k 진수` 로 표현한 값의 `소수(PrimeNumber)' 개수를 구하는 문제이다. 여기서 말하는 `소수` 가 될 수 있는 값은 아래와 같다.
- 소수가 될 수 있는 값을 `P` 라고 할 때, `P` 는 `0` 을 포함하고 있지 않다.
- 즉, `0` 으로 구분된 `0` 이 아닌 숫자로 이루어진 부분이 `P` 가 될 수 있다. `k 진수` 로 표현한 값의 타입이 문자열이면 `P` 는 앞서 말한 조건을 만족하는 `부분 문자열` 이 되는 것이다.
<br/><br/>

나의 경우 `n` 을 `k 진수` 로 표현한 문자열로 변환하였고, 문자 `0` 을 기준으로 `부분 문자열` 을 구분했다. 구분한 부분 문자열을 `10진수` 로 봤을 때 해당 값이 `소수(약수로 자신과 1만을 갖는 수)` 인지 확인 후 `result` 를 `1` 씩 증가시켜 문제를 해결했다. 해결에 사용된 메서드는 아래와 같다.
- `makeKBaseNumber(int, int)` : `n` 을 `k 진수` 로 표현한 문자열로 변환을 수행
- `isPrimeNumber(String)` : 구분한 `부분 문자열` 이 `소수` 인지 검증을 수행
    - 소수 검증에는 제곱근을 활용하였다. `Math.sqrt()` 메서드를 활용 `num(부분 문자열)` 의 `제곱근(정수 부분)` 을 사용했다.
<br/><br/>

## Constraints
- `1 <= n <= 1,000,000`
- `3 <= k <= 10`
<br/><br/><br/>

# 풀이
```java
import java.util.*;

class Solution {
    public int solution(int n, int k) {
        String kBaseNumber = makeKBaseNumber(n, k);
        System.out.println(kBaseNumber);
        StringBuilder sb = new StringBuilder();
        int result = 0;
        
        for (int i = 0; i < kBaseNumber.length(); i++) {
            char num = kBaseNumber.charAt(i);
            
            if (num == '0') {
                if (sb.length() == 0) continue;
                if (isPrimeNumber(sb.toString())) result++;
                sb.setLength(0);
            } else {
                sb.append(num);
            }
        }
        
        if (sb.length() != 0) {
            if (isPrimeNumber(sb.toString())) result++;
        }
        
        return result;
    }
    
    public boolean isPrimeNumber(String num) {
        if (num.equals("1")) return false;
        
        long number = Long.parseLong(num);
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    public String makeKBaseNumber(int number, int k) {
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            if (number < k) break;
            
            sb.insert(0, number % k);
            number = number / k;
        }
        sb.insert(0, number);
        
        return sb.toString();
    }
}
```
<br/><br/>

## 참조 문서
- [programmers - k진수에서 소수 개수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/92335)