package numberBaseball.validator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserInputValidatorTest {
    private UserInputValidator userInputValidator = new UserInputValidator();

    @Test
    void validateLengthTest(){
        assertThat(userInputValidator.validateLength("12")).isFalse();
        assertThat(userInputValidator.validateLength("123")).isTrue();
        assertThat(userInputValidator.validateLength("1234")).isFalse();
    }

    @Test
    void validateValueTest() {
        assertThat(userInputValidator.validateValue("abc")).isFalse();
        assertThat(userInputValidator.validateValue("1a3")).isFalse();
        assertThat(userInputValidator.validateValue("000")).isFalse();
        assertThat(userInputValidator.validateValue("111")).isFalse();
        assertThat(userInputValidator.validateValue("123")).isTrue();
    }
}