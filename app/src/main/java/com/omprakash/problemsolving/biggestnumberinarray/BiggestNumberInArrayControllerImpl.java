package com.omprakash.problemsolving.biggestnumberinarray;

public class BiggestNumberInArrayControllerImpl implements BiggestNumberInArrayController {
    @Override
    public int getMax(int[] numbers) {
        try {
            int max = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            return max;
        } catch (Exception ex) {
            return -1;
        }
    }
}
