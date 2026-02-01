package service;

import domain.Numbers;

public class GameService {
    private final RandomNumberGenerator randomNumberGenerator;
    private Numbers answer;

    public GameService(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void startNewGame() {
        answer = randomNumberGenerator.numberGenerate();
    }
}
