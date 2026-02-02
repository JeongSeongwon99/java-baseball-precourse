package controller;

import domain.JudgeCount;
import service.GameService;
import view.InputView;
import view.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final GameService gameService;

    public GameController(InputView inputView, OutputView outputView, GameService gameService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.gameService = gameService;
    }

    public void run() {
        outputView.printStartMessage();
        while (true) {
            playGame();
            if (shouldStop()) {
                return;
            }
        }
    }

    private void playGame() {
        gameService.startNewGame();
        playUntilWin();
    }

    private void playUntilWin() {
        while (!gameService.isGameOver()) {
            JudgeCount count = gameService.play(inputView.readGuess());
            outputView.printResult(count);
        }
        outputView.printGameEndMessage();
    }

    private boolean shouldStop() {
        return inputView.readRestartCommand() == 2;
    }
}
