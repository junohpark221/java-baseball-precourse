package numberBaseball.controller;

import numberBaseball.model.ComputerPlayer;
import numberBaseball.model.UserPlayer;
import numberBaseball.validator.UserInputValidator;
import numberBaseball.view.GameView;

import java.util.Scanner;

public class GameController {
    private final GameView gameView;
    private final UserInputValidator userInputValidator;
    private final Scanner scanner = new Scanner(System.in);

    private boolean replay = false;

    public GameController() {
        this.gameView = new GameView();
        this.userInputValidator = new UserInputValidator();
    }

    public void startGame() {
        playGame();
    }

    public void playGame() {
        ComputerPlayer computerPlayer = new ComputerPlayer();

        UserPlayer userPlayer = createUserPlayer();
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
}
