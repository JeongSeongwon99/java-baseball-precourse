package domain;

public record JudgeCount(int ball, int strike) {

    public boolean isThreeStrikes() {
        return strike == 3;
    }
}
