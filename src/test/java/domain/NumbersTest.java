package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumbersTest {
    @Test
    void fromValidInputParsesNumbers() {
        Numbers numbers = Numbers.from("123");

        assertThat(numbers.size()).isEqualTo(3);
        assertThat(numbers.get(0)).isEqualTo(1);
        assertThat(numbers.get(1)).isEqualTo(2);
        assertThat(numbers.get(2)).isEqualTo(3);
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(9)).isFalse();
    }

    @Test
    void fromWrongLengthThrowsException() {
        assertThatThrownBy(() -> Numbers.from("12"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 3자여야 합니다.");
    }

    @Test
    void fromDuplicateDigitsThrowsException() {
        assertThatThrownBy(() -> Numbers.from("112"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 중복된 숫자는 사용할 수 없습니다.");
    }

    @Test
    void fromNonDigitThrowsException() {
        assertThatThrownBy(() -> Numbers.from("12a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 숫자만 입력해야 합니다.");
    }

    @Test
    void fromContainsZeroThrowsException() {
        assertThatThrownBy(() -> Numbers.from("120"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 0은 사용할 수 없습니다.");
    }
}
