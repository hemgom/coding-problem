package leetcode.difficulty.easy.problem_929;

import java.util.HashSet;
import java.util.Set;

public class Solution_929 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> result = new HashSet<>();

        for (String email : emails) {
            result.add(filterEmail(email));
        }

        return result.size();
    }

    public String filterEmail(String email) {
        int separatorIndex = email.indexOf("@");
        String localName = email.substring(0, separatorIndex);
        String domainName = email.substring(separatorIndex+1);

        if (localName.contains("+")) {
            int plusSignIndex = localName.indexOf("+");
            localName = localName.substring(0, plusSignIndex);
        }

        if (localName.contains(".")) {
            localName = localName.replaceAll("\\.", "");
        }

        return localName + "@" + domainName;
    }
}
