package controller;

import view.OutputView;

public class GameController {
    private final OutputView outputView = new OutputView();

    public void run() {
        outputView.printStartMessage();
    }
}
