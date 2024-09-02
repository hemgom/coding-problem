# 문제 분석
숫자문자, 공백 또는 영대소문자로 구성된 문자열 `s` 가 주어질 때 문자열에 포함된 모든 단어를 `JadenCase` 로 변환한 문자열을 반환해야 한다.
- `JadenCase` 는 단어의 첫 글자가 대문자 나머지 글자들은 소문자인 형태를 말한다. 첫 글자가 숫자문자라면 그대로 유지한다.
- 단어 의 첫 글자에는 `숫자 문자` 또는 `영대소문자` 가 올 수 있고, 나머지 모든 글자는 `영대소문자` 로 구성될 수 있다.
- `s` 에 등장하는 공백문자는 연속적으로 등장 할 수 있다.
<br/><br/>

결론을 말하면 문자열 `s` 에서 공백인 부분은 그대로 두고 `단어` 에 해당하는 부분만 `JadenCase` 에 맞춰 변경한 결과 문자열을 구하면 되는 것이다.
<br/><br/>

나의 경우 아래의 메서드를 생성하고 사용해 문제를 해결했다.
- `makeList()` : 문자열 `s` 의 공백, 단어 문자열들을 담은 리스트 생성하는 메서드
- `toUpper()` : 문자를 문자열로 변환 후 영대문자로 변환해 반환하는 메서드
- `toLower()` : 문자열의 문자들을 모두 영소문자로 변환해 반환하는 메서드
<br/><br/>

## Constraints
- `s` 는 길이 `1` 이상 `200` 이하의 길이를 갖는다.
- `s` 는 숫자, 공백문자, 영대소문자로 구성될 수 있다.
- `s` 의 단어는 첫 글자에 숫자 문자를 가질 수 있으며 나머지 부분은 영대소문자로만 구성된다.
- `s` 에 공백 문자는 연속적으로 등장할 수 있다.
<br/><br/><br/>

# 풀이
```java
import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> sParts = makeList(s);
        System.out.println(sParts);
        StringBuffer result = new StringBuffer();
        for (String parts : sParts) {
            if (parts.equals(" ")) {
                result.append(parts);
                continue;
            }

            char fl = parts.charAt(0);
            String front = "";
            if (fl >= 'a' && fl <= 'z') {
                front = toUpper(fl);
            } else {
                front = Character.toString(fl);
            }

            result.append(front);
            if (parts.length() > 1) {
                String remain = parts.substring(1);
                result.append(toLower(remain));
            }
        }
        return result.toString();
    }
    
    public String toUpper(char firstLetter) {
        String letter = Character.toString(firstLetter);
        return letter.toUpperCase();
    }
    
    public String toLower(String subString) {
        return subString.toLowerCase();
    }
    
    public List<String> makeList(String s) {
        StringBuffer sb = new StringBuffer();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == ' ') {
                if (sb.length() != 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
                words.add(" ");
            } else {
                sb.append(letter);
            }
        }
        if (sb.length() != 0) words.add(sb.toString());
        return words;
    }
}
```
<br/><br/>

## 참조 문서
- [programmers - JadenCase 문자열 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12951#)