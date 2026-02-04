package view;

import domain.JudgeCount;

public class OutputView {
    private static final String START_MESSAGE = "숫자 야구 게임 시작";
    private static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";

    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public void printResult(JudgeCount count) {
        System.out.println(formatResult(count));
    }

    public void printGameEndMessage() {
        System.out.println(END_MESSAGE);
    }

    public void printError(String message) {
        System.out.println(message);
    }

    private String formatResult(JudgeCount count) {
        int ball = count.ball();
        int strike = count.strike();
        if (ball == 0 && strike == 0) return "낫싱";

        StringBuilder sb = new StringBuilder();
        if (strike > 0) {
            sb.append(strike).append("스트라이크 ");
        }
        if (ball > 0) {
            sb.append(ball).append("볼");
        }
        return sb.toString().trim();
    }
}
