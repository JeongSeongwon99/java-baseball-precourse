package domain;

import service.JudgeService;

public class Game {
    private final Numbers answer;
    private final JudgeService judgeService;
    private JudgeCount lastCount;

    public Game(Numbers answer, JudgeService judgeService) {
        this.answer = answer;
        this.judgeService = judgeService;
    }

    public JudgeCount play(String guessInput) {
        JudgeCount count = judgeService.judge(answer, Numbers.from(guessInput));
        lastCount = count;
        return count;
    }

    public boolean isOver() {
        return lastCount != null && lastCount.isThreeStrikes();
    }
}
