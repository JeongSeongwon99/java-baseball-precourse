package service;

import domain.Numbers;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JudgeServiceTest {
    private final JudgeService judgeService = new JudgeService();

    @Test
    void judgeAllStrikes() {
        Numbers answer = Numbers.from("123");
        Numbers guess = Numbers.from("123");

        assertThat(judgeService.judge(answer, guess).isThreeStrikes()).isTrue();
        assertThat(judgeService.judge(answer, guess).toMessage()).isEqualTo("3스트라이크");
    }

    @Test
    void judgeBallAndStrike() {
        Numbers answer = Numbers.from("123");
        Numbers guess = Numbers.from("132");

        assertThat(judgeService.judge(answer, guess).toMessage()).isEqualTo("2볼 1스트라이크");
    }

    @Test
    void judgeNothing() {
        Numbers answer = Numbers.from("123");
        Numbers guess = Numbers.from("456");

        assertThat(judgeService.judge(answer, guess).toMessage()).isEqualTo("낫싱");
    }
}
