package service;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    public String numberGenerate() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shuffle(numbers);
        return "" + numbers[0] + numbers[1] + numbers[2];
    }

    private void shuffle(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = ThreadLocalRandom.current().nextInt(i + 1);
            swap(arr, i, j);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
