package view;

import java.util.Scanner;

public class InputView {
    private static final String GUESS_PROMPT = "숫자를 입력해주세요 : ";
    private static final String RESTART_PROMPT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private static final Scanner scanner = new Scanner(System.in);

    public String readGuess() {
        System.out.print(GUESS_PROMPT);
        return scanner.nextLine().trim();
    }

    public String readRestartCommand() {
        System.out.println(RESTART_PROMPT);
        return scanner.nextLine().trim();
    }
}
