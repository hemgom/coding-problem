# 929. Unique Email Addresses
이메일은 `@` 기호로 구분된 `localName`과 `domainName`으로 구성된다.  
이메일에는 `.` 또는 `+`가 하나 이상 포함될 수가 있다.
- `.` : 해당 기호가 있을 경우 해당 기호를 제외한 이메일 주소에 메일이 전송된다.
  - ex) `test.email@leetcode.com` -> `testemail@leetcode.com`
- `+` : 해당 기호가 있을 경우 해당 기호 이후의 주소를 제외한 이메일 주소에 메일이 전송된다.
  - ex) `test+email@leetcode.com` -> `test@leetcode.com`  
- 단, 해당 기호에 대한 연산은 `localName`만 해당되며, `domainName`은 영향을 받지 않는다.

이메일 주소가 저장된 문자열 배열이 주어질 때, 서로 다른 이메일 주소의 갯수를 반환한다.
### 입력제한
- 1 <= `emails.length` <= 100
- 1 <= `emails[i].length` <= 100
- `emails[i]`는 `영소문자`와 `.`, `+`, `@`으로 구성될 수 있다.
- 각 `emails[i]`는 반드시 하나의 `@`를 가진다.
- 모든 이메일은 반드시 `localName`과 `domainName`을 가진다.
- `localName`은 `+` 기호로 시작되지 않는다.
- `domainName`은 `.com` 접미사로 끝난다.
### 풀이핵심
- 말이 복잡하지만 이메일 주소를 받아서 `localName`에 해당하는 부분만 연산을 하면된다.
- 연산 후에는 이메일 주소들의 중복을 제거해 이메일 주소의 갯수를 반환하면 된다.
### 문제풀이
1. 주어진 문자열 배열에서 요소를 읽어와 문제에 제시된 연산을 진행한다.
   1. 이메일 주소를 `@` 기호를 기준으로 `localName` `@` `domainName`으로 구분해준다.
   2. `localName`에 `+`가 있다면 `+`이후의 문자열을 제거한다.
   3. `localName`에 `.`이 있다면 모든 `.`을 제거한다.
   4. `localName`+`@`+`domainName` : 문자열을 더해 필터링된 이메일을 만들어준다.
2. `(1)`에서 필터링한 이메일 주소를 `HashSet<String> result`에 저장한다.
   - `HashSet`은 중복을 허용하지 않는다.
3. 주어진 문자열 배열의 요소 수 만큼 `(1) - (2)`과정을 반복한 후 `result`의 요소 개수를 반환한다.
### 문제출처
- [leetcode](https://leetcode.com/problems/unique-email-addresses/)
### 태그
`HashSet` `contains()` `replaceAll()` `substring()`