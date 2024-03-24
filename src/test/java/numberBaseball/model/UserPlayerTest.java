package numberBaseball.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UserPlayerTest {
    @Test
    void createUserInputTest() {
        UserPlayer userPlayer = new UserPlayer("123");

        List<Integer> listNum = new ArrayList<>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(3);

        assertThat(userPlayer.convertToList("123")).isEqualTo(listNum);
    }

    @Test
    void checkResultTest() {
        UserPlayer userPlayer = new UserPlayer("123");

        List<Integer> computerNum1 = new ArrayList<>();
        computerNum1.add(3);
        computerNum1.add(2);
        computerNum1.add(1);
        Result result1 = userPlayer.getResult(computerNum1);

        assertThat(result1.getStrikes()).isEqualTo(1);
        assertThat(result1.getBalls()).isEqualTo(2);
        assertThat(result1.isCorrect()).isFalse();


        List<Integer> computerNum2 = new ArrayList<>();
        computerNum2.add(1);
        computerNum2.add(2);
        computerNum2.add(3);
        Result result2 = userPlayer.getResult(computerNum2);

        assertThat(result2.getStrikes()).isEqualTo(3);
        assertThat(result2.getBalls()).isEqualTo(0);
        assertThat(result2.isCorrect()).isTrue();
    }
}
