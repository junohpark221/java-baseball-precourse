package numberBaseball.validator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReplayOptionValidatorTest {
    private ReplayOptionValidator replayOptionValidator = new ReplayOptionValidator();

    @Test
    void validateLengthTest() {
        assertThat(replayOptionValidator.validateLength("")).isFalse();
        assertThat(replayOptionValidator.validateLength("1")).isTrue();
        assertThat(replayOptionValidator.validateLength("12")).isFalse();
    }

    @Test
    void validateValueTest() {
        assertThat(replayOptionValidator.validateValue("a")).isFalse();
        assertThat(replayOptionValidator.validateValue("3")).isFalse();
        assertThat(replayOptionValidator.validateValue("1")).isTrue();
        assertThat(replayOptionValidator.validateValue("2")).isTrue();
    }
}
