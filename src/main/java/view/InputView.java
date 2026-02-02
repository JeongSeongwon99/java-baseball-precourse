package view;

import util.Validator;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class InputView {
    private static final String GUESS_PROMPT = "숫자를 입력해주세요 : ";
    private static final String RESTART_PROMPT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private static final Scanner scanner = new Scanner(System.in);

    public String readGuess() {
        System.out.print(GUESS_PROMPT);
        return scanner.nextLine().trim();
    }

    public int readRestartCommand() {
        String input = readUntilValid(System.out::println, Validator::restartError);
        return Integer.parseInt(input);
    }

    private String readUntilValid(Consumer<String> printer, Function<String, String> validator) {
        while (true) {
            printer.accept(InputView.RESTART_PROMPT);
            String input = scanner.nextLine().trim();
            String error = validator.apply(input);

            if (error == null) {
                return input;
            }
            System.out.println(error);
        }
    }
}
