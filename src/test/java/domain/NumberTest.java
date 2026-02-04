package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumberTest {
    @Test
    void fromCharValidDigitCreatesNumber() {
        Number number = Number.fromChar('7');

        assertThat(number.value()).isEqualTo(7);
        assertThat(number.same(7)).isTrue();
        assertThat(number.same(5)).isFalse();
    }

    @Test
    void fromCharNonDigitThrowsException() {
        assertThatThrownBy(() -> Number.fromChar('a'))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 숫자만 입력해야 합니다.");
    }

    @Test
    void fromCharZeroThrowsException() {
        assertThatThrownBy(() -> Number.fromChar('0'))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 0은 사용할 수 없습니다.");
    }
}
