package service;

import domain.Numbers;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    public Numbers numberGenerate() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shuffle(numbers);
        return Numbers.from("" + numbers[0] + numbers[1] + numbers[2]);
    }

    private void shuffle(int[] numbers) {
        for (int currentIndex = numbers.length - 1; currentIndex > 0; currentIndex--) {
            int swapIndex = ThreadLocalRandom.current().nextInt(currentIndex + 1);
            swap(numbers, currentIndex, swapIndex);
        }
    }

    private void swap(int[] numbers, int firstIndex, int secondIndex) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }
}
