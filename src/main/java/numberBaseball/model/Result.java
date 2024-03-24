package numberBaseball.model;

public class Result {
    private boolean correct;
    private int strikes;
    private int balls;

    public void init() {
        this.correct = false;
        this.strikes = 0;
        this.balls = 0;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void checkValue(int computerIndex, int computerValue, int userIndex, int userValue) {
        if (computerValue == userValue) {
            if (computerIndex == userIndex) {
                strikes += 1;
            }

            if (computerIndex != userIndex) {
                balls += 1;
            }

            if (strikes == 3) {
                correct = true;
            }
        }
    }
}
