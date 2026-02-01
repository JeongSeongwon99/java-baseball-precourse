package view;

import domain.JudgeCount;

public class OutputView {
    private static final String START_MESSAGE = "숫자 야구 게임 시작";
    private static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";

    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public void printResult(JudgeCount count) {
        System.out.println(count.toMessage());
    }

    public void printGameEndMessage() {
        System.out.println(END_MESSAGE);
    }
}
