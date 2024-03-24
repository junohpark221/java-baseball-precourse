package numberBaseball.validator;

import java.util.HashSet;
import java.util.Set;

public class UserInputValidator {
    public boolean validateUserInput(String userInput) {
        if (!validateLength(userInput)) {
            return false;
        }

        if (!validateValue(userInput)) {
            return false;
        }

        return true;
    }

    public boolean validateLength(String userInput) {
        if (userInput.length() != 3) {
            return false;
        }

        return true;
    }

    public boolean validateValue(String userInput) {
        if (!checkNonInteger(userInput)) {
            return false;
        }

        if (!checkEachValue(userInput)) {
            return false;
        }

        return true;
    }

    private boolean checkNonInteger(String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    private boolean checkEachValue(String userInput) {
        final Set<Character> valueSet = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            if (userInput.charAt(i) == '0') {
                return false;
            }
            valueSet.add(userInput.charAt(i));
        }

        if (valueSet.size() != 3) {
            return false;
        }

        return true;
    }
}
