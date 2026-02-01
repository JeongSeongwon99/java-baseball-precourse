package domain;

public class JudgeCount {
    private final int ball;
    private final int strike;

    public JudgeCount(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public boolean isThreeStrikes() {
        return strike == 3;
    }

    public String toMessage() {
        if (ball == 0 && strike == 0) return "낫싱";
        StringBuilder sb = new StringBuilder();
        appendBall(sb);
        appendStrike(sb);
        return sb.toString().trim();
    }

    private void appendBall(StringBuilder sb) {
        if (ball == 0) return;
        sb.append(ball).append("볼 ");
    }

    private void appendStrike(StringBuilder sb) {
        if (strike == 0) return;
        sb.append(strike).append("스트라이크");
    }
}
