package numberBaseball.validator;

import numberBaseball.view.ErrorView;

public class ReplayOptionValidator {
    private final ErrorView errorView;

    public ReplayOptionValidator() {
        this.errorView = new ErrorView();
    }

    public boolean validateReplayOption(String replayOption) {
        if (!validateLength(replayOption)) {
            errorView.printInputLengthError();
            return false;
        }

        if (!validateValue(replayOption)) {
            errorView.printInputValueError();
            return false;
        }

        return true;
    }

    public boolean validateLength(String replayOption) {
        if (replayOption.length() != 1) {
            return false;
        }

        return true;
    }

    public boolean validateValue(String replayOption) {
        try {
            Integer.parseInt(replayOption);
        } catch (NumberFormatException e) {
            return false;
        }

        if (replayOption.equals("1") || replayOption.equals("2")) {
            return true;
        }

        return false;
    }
}
