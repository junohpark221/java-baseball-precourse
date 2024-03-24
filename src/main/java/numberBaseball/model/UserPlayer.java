package numberBaseball.model;

import java.util.ArrayList;
import java.util.List;

public class UserPlayer {
    private final Result result;
    private final List<Integer> numbers;

    public UserPlayer(String userInput) {
        this.result = new Result();
        this.numbers = convertToList(userInput);
    }

    public List<Integer> convertToList(String userInput) {
        List<Integer> userNumbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            userNumbers.add(Integer.parseInt(String.valueOf(userInput.charAt(i))));
        }

        return userNumbers;
    }

    public Result getResult(List<Integer> computerNumbers) {
        result.init();

        for (int userIndex = 0; userIndex < 3; userIndex++) {
            for (int computerIndex = 0; computerIndex < 3; computerIndex++) {
                result.checkValue(computerIndex, computerNumbers.get(computerIndex), userIndex, numbers.get(userIndex));
            }
        }

        return result;
    }
}
