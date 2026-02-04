package util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidatorTest {
    @Test
    void guessErrorWrongLength() {
        assertThat(Validator.guessError("12")).isEqualTo("[ERROR] 3자여야 합니다.");
    }

    @Test
    void guessErrorDuplicateDigits() {
        assertThat(Validator.guessError("112")).isEqualTo("[ERROR] 중복된 숫자는 사용할 수 없습니다.");
    }

    @Test
    void guessErrorNonDigit() {
        assertThat(Validator.guessError("12a")).isEqualTo("[ERROR] 숫자만 입력해야 합니다.");
    }

    @Test
    void numberErrorValidDigitReturnsNull() {
        assertThat(Validator.numberError('7')).isNull();
    }

    @Test
    void restartErrorValidInputsReturnNull() {
        assertThat(Validator.restartError("1")).isNull();
        assertThat(Validator.restartError("2")).isNull();
    }

    @Test
    void restartErrorInvalidInputReturnsMessage() {
        assertThat(Validator.restartError("3"))
                .isEqualTo("[ERROR] 재시작은 1, 종료는 2만 입력 가능합니다.");
    }
}
