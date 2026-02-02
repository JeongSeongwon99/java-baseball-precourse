package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JudgeCountTest {
    @Test
    void toMessageNothing() {
        JudgeCount count = new JudgeCount(0, 0);

        assertThat(count.toMessage()).isEqualTo("낫싱");
    }

    @Test
    void toMessageBallOnly() {
        JudgeCount count = new JudgeCount(2, 0);

        assertThat(count.toMessage()).isEqualTo("2볼");
    }

    @Test
    void toMessageStrikeOnly() {
        JudgeCount count = new JudgeCount(0, 1);

        assertThat(count.toMessage()).isEqualTo("1스트라이크");
    }

    @Test
    void toMessageBallAndStrike() {
        JudgeCount count = new JudgeCount(1, 2);

        assertThat(count.toMessage()).isEqualTo("1볼 2스트라이크");
    }

    @Test
    void isThreeStrikesTrueWhenThreeStrikes() {
        JudgeCount count = new JudgeCount(0, 3);

        assertThat(count.isThreeStrikes()).isTrue();
    }
}
