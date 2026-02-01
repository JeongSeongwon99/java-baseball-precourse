package service;

import domain.JudgeCount;
import domain.Numbers;

public class GameService {
    private final RandomNumberGenerator randomNumberGenerator;
    private final JudgeService judgeService;

    private Numbers answer;
    private JudgeCount lastCount;

    public GameService(RandomNumberGenerator randomNumberGenerator, JudgeService judgeService) {
        this.randomNumberGenerator = randomNumberGenerator;
        this.judgeService = judgeService;
    }

    public void startNewGame() {
        answer = randomNumberGenerator.numberGenerate();
        lastCount = null;
    }

    public JudgeCount play(String guessInput) {
        JudgeCount count = judgeService.judge(answer, Numbers.from(guessInput));
        lastCount = count;
        return count;
    }

    public boolean isGameOver() {
        if (lastCount == null) return false;
        return lastCount.isThreeStrikes();
    }
}
