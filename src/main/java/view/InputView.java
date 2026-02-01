package view;

import util.InputValidator;

import java.util.Scanner;

public class InputView {
    private static final String GUESS_PROMPT = "숫자를 입력해주세요 : ";
    private static final String RESTART_PROMPT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final Scanner scanner = new Scanner(System.in);

    public String readGuess() {
        while (true) {
            System.out.print(GUESS_PROMPT);
            String input = scanner.nextLine().trim();
            String error = InputValidator.guessError(input);
            if (error == null) {
                return input;
            }
            System.out.println(error);
        }
    }

    public int readRestartCommand() {
        while (true) {
            System.out.println(RESTART_PROMPT);
            String input = scanner.nextLine().trim();
            String error = InputValidator.restartError(input);
            if (error == null) {
                return Integer.parseInt(input);
            }
            System.out.println(error);
        }
    }


}
