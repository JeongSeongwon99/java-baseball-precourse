package service;

import domain.Game;
import domain.JudgeCount;
import domain.Numbers;

public class GameService {
    private final RandomNumberGenerator randomNumberGenerator;
    private final JudgeService judgeService;

    private Game currentGame;

    public GameService(RandomNumberGenerator randomNumberGenerator, JudgeService judgeService) {
        this.randomNumberGenerator = randomNumberGenerator;
        this.judgeService = judgeService;
    }

    public void startNewGame() {
        Numbers answer = randomNumberGenerator.numberGenerate();
        currentGame = new Game(answer, judgeService);
    }

    public JudgeCount play(String guessInput) {
        return currentGame.play(guessInput);
    }

    public boolean isGameOver() {
        return currentGame.isOver();
    }
}
