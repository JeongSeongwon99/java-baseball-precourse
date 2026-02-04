package domain;

import util.Validator;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private static final int LENGTH = 3;
    private final List<Number> numbers;

    private Numbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    public static Numbers from(String input) {
        String error = Validator.guessError(input);
        if (error != null) {
            throw new IllegalArgumentException(error);
        }
        return new Numbers(parse(input));
    }

    private static List<Number> parse(String input) {
        List<Number> parsedNumbers = new ArrayList<>(LENGTH);
        for (char digitChar : input.toCharArray()) {
            parsedNumbers.add(Number.fromChar(digitChar));
        }
        return parsedNumbers;
    }

    public int get(int index) {
        return numbers.get(index).value();
    }

    public boolean contains(int number) {
        for (Number numberItem : numbers) {
            if (numberItem.same(number)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return numbers.size();
    }

    public JudgeCount judge(Numbers guess) {
        int ball = 0;
        int strike = 0;
        for (int index = 0; index < size(); index++) {
            int guessDigit = guess.get(index);
            if (guessDigit == get(index)) {
                strike++;
                continue;
            }
            if (contains(guessDigit)) {
                ball++;
            }
        }
        return new JudgeCount(ball, strike);
    }
}
