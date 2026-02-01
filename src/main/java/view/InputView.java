package view;

import util.InputValidator;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class InputView {
    private static final String GUESS_PROMPT = "숫자를 입력해주세요 : ";
    private static final String RESTART_PROMPT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private static final Scanner scanner = new Scanner(System.in);

    public String readGuess() {
        return readUntilValid(GUESS_PROMPT, System.out::print, InputValidator::guessError);
    }

    public int readRestartCommand() {
        String input = readUntilValid(RESTART_PROMPT, System.out::println, InputValidator::restartError);
        return Integer.parseInt(input);
    }

    private String readUntilValid(String prompt, Consumer<String> printer, Function<String, String> validator) {
        while (true) {
            printer.accept(prompt);
            String input = scanner.nextLine().trim();
            String error = validator.apply(input);

            if (error == null) {
                return input;
            }
            System.out.println(error);
        }
    }
}
