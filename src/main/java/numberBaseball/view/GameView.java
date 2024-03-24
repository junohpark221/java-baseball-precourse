package numberBaseball.view;

import numberBaseball.model.Result;

public class GameView {
    private final String USER_NUMBER_INPUT_TEXT = "숫자를 입력해주세요 : ";
    private final String NOTHING = "낫싱";
    private final String STRIKE = "스트라이크 ";
    private final String BALL = "볼";
    private final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";

    public void printRequestingUserNumber() {
        System.out.println(USER_NUMBER_INPUT_TEXT);
    }

    public void printResult(Result result) {
        int strikes = result.getStrikes();
        int balls = result.getBalls();
        boolean correct = result.isCorrect();

        printCount(strikes, balls);
        printCorrect(correct);
    }

    private void printCount(int strikes, int balls) {
        String countResult = "";

        if (strikes == 0 && balls == 0) {
            countResult += NOTHING;
        }

        if (strikes != 0) {
            countResult += strikes + STRIKE;
        }

        if (balls != 0) {
            countResult += balls + BALL;
        }

        System.out.println(countResult);
    }

    private void printCorrect(boolean correct) {
        if (correct) {
            System.out.println(END_MESSAGE);
        }
    }
}
