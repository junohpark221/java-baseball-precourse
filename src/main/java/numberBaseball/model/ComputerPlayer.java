package numberBaseball.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ComputerPlayer {
    private final List<Integer> numbers;

    public ComputerPlayer() {
        this.numbers = setNumbers();
    }

    private List<Integer> setNumbers() {
        final Set<Integer> numbersSet = new LinkedHashSet<>();

        while (numbersSet.size() < 3) {
            numbersSet.add((int)(Math.random() * 9) + 1);
        }

        return new ArrayList<>(numbersSet);
    }

    public List<Integer> getNumbers() {
        return this.numbers;
    }
}
