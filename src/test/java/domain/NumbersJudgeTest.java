package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersJudgeTest {
    @Test
    void judgeAllStrikes() {
        Numbers answer = Numbers.from("123");
        Numbers guess = Numbers.from("123");

        assertThat(answer.judge(guess).isThreeStrikes()).isTrue();
        assertThat(answer.judge(guess).ball()).isEqualTo(0);
        assertThat(answer.judge(guess).strike()).isEqualTo(3);
    }

    @Test
    void judgeBallAndStrike() {
        Numbers answer = Numbers.from("123");
        Numbers guess = Numbers.from("132");

        assertThat(answer.judge(guess).ball()).isEqualTo(2);
        assertThat(answer.judge(guess).strike()).isEqualTo(1);
    }

    @Test
    void judgeNothing() {
        Numbers answer = Numbers.from("123");
        Numbers guess = Numbers.from("456");

        assertThat(answer.judge(guess).ball()).isEqualTo(0);
        assertThat(answer.judge(guess).strike()).isEqualTo(0);
    }
}
