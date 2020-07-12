package code.smell.excessive_indentation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class User {
    public boolean validateUserName(String userName) {
        boolean isValid = false;
        int minUserNameLength = 6;
        if (userName.length() >= minUserNameLength) {
            int maxUserNameLength = 25;
            if (userName.length() <= maxUserNameLength) {
                boolean isAlphaOrNumber = isAlphaAndNumber(userName);
                if (isAlphaOrNumber) {
                    if (!containsDirtyWords(userName)) {
                        isValid = isUniqueUserName(userName);
                    }
                }
            }
        }

        return isValid;
    }

    private boolean isUniqueUserName(String userName) {
        Set<String> existsNames = new HashSet<>();
        existsNames.addAll(Arrays.asList("JackLi", "JackWang", "JackZhang"));

        return ! existsNames.contains(userName);
    }

    private boolean containsDirtyWords(String userName) {
        return userName.contains("fuck");
    }

    private boolean isAlphaAndNumber(String userName) {
        for (char c : userName.toCharArray()) {
            if (! ((c >= 'a' && c <= 'z') ||
                    (c >= 'A' && c <= 'Z') ||
                    (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        return true;
    }
}
