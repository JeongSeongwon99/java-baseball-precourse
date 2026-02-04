package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JudgeCountTest {
    @Test
    void exposesBallAndStrike() {
        JudgeCount count = new JudgeCount(1, 2);

        assertThat(count.ball()).isEqualTo(1);
        assertThat(count.strike()).isEqualTo(2);
    }

    @Test
    void isThreeStrikesTrueWhenThreeStrikes() {
        JudgeCount count = new JudgeCount(0, 3);

        assertThat(count.isThreeStrikes()).isTrue();
    }
}
