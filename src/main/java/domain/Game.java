package domain;

public class Game {
    private final Numbers answer;
    private JudgeCount lastCount;

    public Game(Numbers answer) {
        this.answer = answer;
    }

    public JudgeCount play(String guessInput) {
        JudgeCount count = answer.judge(Numbers.from(guessInput));
        lastCount = count;
        return count;
    }

    public boolean isOver() {
        return lastCount != null && lastCount.isThreeStrikes();
    }
}
