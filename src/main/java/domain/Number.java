package domain;

import util.Validator;

public class Number {
    private final int value;

    private Number(int value) {
        this.value = value;
    }

    public static Number fromChar(char c) {
        String error = Validator.numberError(c);
        if (error != null) throw new IllegalArgumentException(error);
        return new Number(c - '0');
    }

    public int value() {
        return value;
    }

    public boolean same(int other) {
        return value == other;
    }
}
