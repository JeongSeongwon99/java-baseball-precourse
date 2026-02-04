package service;

import domain.Game;
import domain.JudgeCount;
import domain.Numbers;

public class GameService {
    private final RandomNumberGenerator randomNumberGenerator;
    private Game currentGame;

    public GameService(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void startNewGame() {
        Numbers answer = randomNumberGenerator.numberGenerate();
        currentGame = new Game(answer);
    }

    public JudgeCount play(String guessInput) {
        return currentGame.play(guessInput);
    }

    public boolean isGameOver() {
        return currentGame.isOver();
    }
}
