package numberBaseball.controller;

import numberBaseball.model.ComputerPlayer;
import numberBaseball.model.Result;
import numberBaseball.model.UserPlayer;
import numberBaseball.validator.ReplayOptionValidator;
import numberBaseball.validator.UserInputValidator;
import numberBaseball.view.GameView;

import java.util.Scanner;

public class GameController {
    private final GameView gameView;
    private final UserInputValidator userInputValidator;
    private final ReplayOptionValidator replayOptionValidator;
    private final Scanner scanner = new Scanner(System.in);

    private boolean replay = false;

    public GameController() {
        this.gameView = new GameView();
        this.userInputValidator = new UserInputValidator();
        this.replayOptionValidator = new ReplayOptionValidator();
    }

    public void startGame() {
        do {
            playGame();
            checkReplayGame();
        } while(replay);
    }

    public void playGame() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        boolean correct;

        do {
            UserPlayer userPlayer = createUserPlayer();
            Result result = userPlayer.getResult(computerPlayer.getNumbers());
            gameView.printResult(result);
            correct = result.isCorrect();
        } while (!correct);
    }

    public UserPlayer createUserPlayer() {
        String userInput;
        boolean validUserInput;

        do {
            gameView.printRequestingUserNumber();
            userInput = scanner.nextLine();
            validUserInput = userInputValidator.validateUserInput(userInput);
        } while(!validUserInput);

        return new UserPlayer(userInput);
    }

    public void checkReplayGame() {
        boolean validOption;
        String replayOption;

        do {
            gameView.printReplayingOption();
            replayOption = scanner.nextLine();
            validOption = replayOptionValidator.validateReplayOption(replayOption);
        } while (!validOption);

        updateReplay(replayOption);
    }

    public void updateReplay(String replayOption) {
        if (replayOption.equals("1")) {
            replay = true;
        }

        if (replayOption.equals("2")) {
            replay = false;
        }
    }
}
