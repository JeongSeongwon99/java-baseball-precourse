package service;

import domain.JudgeCount;
import domain.Numbers;

public class JudgeService {
    public JudgeCount judge(Numbers answer, Numbers guess) {
        int ball = 0;
        int strike = 0;
        for (int i = 0; i < answer.size(); i++) {
            int g = guess.get(i);
            if (g == answer.get(i)) {
                strike++;
                continue;
            }
            if (answer.contains(g)) {
                ball++;
            }
        }
        return new JudgeCount(ball, strike);
    }
}
