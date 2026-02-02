package domain;

import util.Validator;

public class Number {
    private final int value;

    private Number(int value) {
        this.value = value;
    }

    public static Number fromChar(char digitChar) {
        String error = Validator.numberError(digitChar);
        if (error != null) throw new IllegalArgumentException(error);
        return new Number(digitChar - '0');
    }

    public int value() {
        return value;
    }

    public boolean same(int other) {
        return value == other;
    }
}
