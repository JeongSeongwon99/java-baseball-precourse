package service;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    static String makeAnswer() {
        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = d.length - 1; i > 0; i--) {
            int j = ThreadLocalRandom.current().nextInt(i + 1);
            int tmp = d[i];
            d[i] = d[j];
            d[j] = tmp;
        }

        return "" + d[0] + d[1] + d[2];
    }
}
