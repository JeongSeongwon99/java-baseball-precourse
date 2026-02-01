package controller;

import domain.ComputerNumber;
import service.ComputerNumberService;
import view.InputView;
import view.OutputView;

public class GameController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    private final ComputerNumberService computerNumberService =
            new ComputerNumberService();

    public void run() {
        outputView.printStartMessage();

        ComputerNumber answer = computerNumberService.create();

        String guess = inputView.readGuess();

//        System.out.println(answer.numbers());
//        System.out.println(guess);
    }
}
