package code.smell.excessive_indentation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class User {
    public boolean validateUserName(String userName) {
        int minUserNameLength = 6;
        if (userName.length() < minUserNameLength) {
            return false;
        }
        int maxUserNameLength = 25;
        if (userName.length() > maxUserNameLength) {
            return false;
        }
        if (!isAlphaAndNumber(userName)) {
            return false;
        }
        if (containsDirtyWords(userName)) {
            return false;
        }

        return isUniqueUserName(userName);
    }

    private boolean isUniqueUserName(String userName) {
        Set<String> existsNames = new HashSet<>(Arrays.asList("JackLi", "JackWang", "JackZhang"));

        return ! existsNames.contains(userName);
    }

    private boolean containsDirtyWords(String userName) {
        return userName.contains("fuck");
    }

    private boolean isAlphaAndNumber(String userName) {
        for (char c : userName.toCharArray()) {
            if (isNotAlphaAndNumberChar(c)) {
                return false;
            }
        }

        return true;
    }

    private boolean isNotAlphaAndNumberChar(char c) {
        return (c < 'a' || c > 'z') &&
                (c < 'A' || c > 'Z') &&
                (c < '0' || c > '9');
    }
}
