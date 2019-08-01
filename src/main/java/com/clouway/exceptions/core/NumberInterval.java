package com.clouway.exceptions.core;

public class NumberInterval {
    public static void main(String[] args) throws OutOfIntervalException {
        int intervalStart = 20;
        int intervalEnd = 100;
        int numberToCompare = 44;

        checkInterval(intervalStart, intervalEnd, numberToCompare);
    }

    public static void checkInterval(int intervalStart, int intervalEnd, int number) throws OutOfIntervalException {
        if (number >= intervalStart && number <= intervalEnd) {
            System.out.println("number " + number + " is in the interval of " + intervalStart + " and " + intervalEnd);
        } else {
            throw new OutOfIntervalException("The number is not in the interval!");
        }
    }
}
