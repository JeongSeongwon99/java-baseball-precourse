package domain;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private final List<Integer> numbers;

    private Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Numbers from(String input) {
        return new Numbers(parse(input));
    }

    private static List<Integer> parse(String input) {
        List<Integer> nums = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) nums.add(input.charAt(i) - '0');
        return nums;
    }

    public int get(int index) {
        return numbers.get(index);
    }

    public boolean contains(int number) {
        return numbers.contains(number);
    }
}