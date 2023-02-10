package com.omprakash.problemsolving.threeprogrammers;

import com.omprakash.problemsolving.threeprogrammers.ThreeProgrammersController;

public class ThreeProgrammersImpl implements ThreeProgrammersController {

    @Override
    public int getDiffMaxAndMin(String p1, String p2, String p3) {
        int p1Salary = Integer.parseInt(p1);
        int p2Salary = Integer.parseInt(p2);
        int p3Salary = Integer.parseInt(p3);
        int maxAmount = findMax(p1Salary, p2Salary, p3Salary);
        int minAmount = findMin(p1Salary, p2Salary, p3Salary);
        return maxAmount - minAmount;
    }

    @Override
    public int findMin(int p1, int p2, int p3) {
        if (p1 < p2 && p1 < p3) {
            return p1;
        } else if (p2 < p3) {
            return p2;
        } else {
            return p3;
        }
    }

    @Override
    public int findMax(int p1, int p2, int p3) {
        if (p1 > p2 && p1 > p3) {
            return p1;
        } else if (p2 > p3) {
            return p2;
        } else {
            return p3;
        }
    }
}
