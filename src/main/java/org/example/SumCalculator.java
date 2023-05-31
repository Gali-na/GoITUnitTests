package org.example;

public class SumCalculator {
    public int sum(int number) throws IllegalAccessException {
        if (number <= 0) {
            throw new IllegalAccessException("this method does not work with a range of " +
                    "values less than or equal to zero");

        }
        if (number > 1000_300) {
            throw new IllegalAccessException("this method does not work with values" +
                    "greater than 1_000_300");
        }
        int sumResult = 0;
        while (number > 0) {
            sumResult = sumResult + number;
            --number;
        }
        return sumResult;
    }
}
