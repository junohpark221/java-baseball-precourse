package numberBaseball.model;

import java.util.ArrayList;
import java.util.List;

public class UserPlayer {
    private final List<Integer> numbers;

    public UserPlayer(String userInput) {
        this.numbers = convertToList(userInput);
    }

    public List<Integer> convertToList(String userInput) {
        List<Integer> userNumbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            userNumbers.add(Integer.parseInt(String.valueOf(userInput.charAt(i))));
        }

        return userNumbers;
    }
}
