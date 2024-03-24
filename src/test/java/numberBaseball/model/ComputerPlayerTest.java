package numberBaseball.model;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerPlayerTest {
    @Test
    void makeComputerPlayerTest() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        List<Integer> numbers = computerPlayer.getNumbers();

        Set<Integer> numberSet = new HashSet<>(numbers);
        int uniqueNumbers = numberSet.size();

        assertThat(numbers.size()).isEqualTo(3);
        assertThat(uniqueNumbers).isEqualTo(3);
    }
}
