package project_euler;

import java.util.stream.IntStream;

class Problem1 {

    private Problem1() {
    }

    /**
     * Returns the sum of multiples of 3 and 5 from 0 to n
     */
    static int multiplesOf3And5(int n) {
        int response = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                response += i;
            }
        }
        return response;
    }

    /**
     * Returns the sum of multiples of 3 and 5 from 0 to n
     * Implementation uses stream instead of a for loop.
     */
    static int multipleOf3And4_streams(int n) {
        return IntStream.range(0, n)
                .filter(value -> value % 3 == 0 || value % 5 == 0)
                .sum();
    }
}
