package controller;

import domain.Numbers;
import view.InputView;
import view.OutputView;

public class GameController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();



    public void run() {
        outputView.printStartMessage();

        String guess = inputView.readGuess();

//        System.out.println(answer.numbers());
//        System.out.println(guess);
    }
}
