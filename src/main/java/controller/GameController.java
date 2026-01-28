package controller;

import domain.ComputerNumber;
import service.ComputerNumberService;
import view.OutputView;

public class GameController {
    private final OutputView outputView = new OutputView();

    private final ComputerNumberService computerNumberService =
            new ComputerNumberService();

    public void run() {
        outputView.printStartMessage();

        ComputerNumber answer = computerNumberService.create();

//        System.out.println(answer.getNumbers());
    }
}
