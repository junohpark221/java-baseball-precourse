package numberBaseball.validator;

import numberBaseball.view.ErrorView;

import java.util.HashSet;
import java.util.Set;

public class UserInputValidator {
    private final ErrorView errorView;

    public UserInputValidator() {
        this.errorView = new ErrorView();
    }

    public boolean validateUserInput(String userInput) {
        if (!validateLength(userInput)) {
            errorView.printInputLengthError();
            return false;
        }

        if (!validateValue(userInput)) {
            errorView.printInputValueError();
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
