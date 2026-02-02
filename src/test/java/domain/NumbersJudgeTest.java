package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersJudgeTest {
    @Test
    void judgeAllStrikes() {
        Numbers answer = Numbers.from("123");
        Numbers guess = Numbers.from("123");

        assertThat(answer.judge(guess).isThreeStrikes()).isTrue();
        assertThat(answer.judge(guess).toMessage()).isEqualTo("3스트라이크");
    }

    @Test
    void judgeBallAndStrike() {
        Numbers answer = Numbers.from("123");
        Numbers guess = Numbers.from("132");

        assertThat(answer.judge(guess).toMessage()).isEqualTo("2볼 1스트라이크");
    }

    @Test
    void judgeNothing() {
        Numbers answer = Numbers.from("123");
        Numbers guess = Numbers.from("456");

        assertThat(answer.judge(guess).toMessage()).isEqualTo("낫싱");
    }
}
