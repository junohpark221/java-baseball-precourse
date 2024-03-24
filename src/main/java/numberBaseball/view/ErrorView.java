package numberBaseball.view;

public class ErrorView {
    private final String LENGTH_ERROR = "[ERROR] 입력하신 값의 길이가 잘못되었습니다.";
    private final String VALUE_ERROR = "[ERROR] 입력하신 값이 잘못되었습니다.";

    public void printInputLengthError() {
        System.out.println(LENGTH_ERROR);
    }

    public void printInputValueError() {
        System.out.println(VALUE_ERROR);
    }
}
