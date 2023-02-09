package com.omprakash.problemsolving;

public class ThreeProgrammersImpl implements ThreeProgrammersController{

    @Override
    public int getDiffMaxAndMin(String p1, String p2, String p3) {
        int maxAmount = findMax(p1, p2, p3);
        int minAmount = findMin(p1, p2, p3);
        return maxAmount - minAmount;
    }

    @Override
    public int findMin(String p1, String p2, String p3) {
        int p1Salary = Integer.parseInt(p1);
        int p2Salary = Integer.parseInt(p2);
        int p3Salary = Integer.parseInt(p3);
        if (p1Salary < p2Salary && p2Salary < p3Salary) {
            return p1Salary;
        } else if (p2Salary < p3Salary) {
            return p2Salary;
        } else {
            return p3Salary;
        }
    }

    @Override
    public int findMax(String p1, String p2, String p3) {
        int p1Salary = Integer.parseInt(p1);
        int p2Salary = Integer.parseInt(p2);
        int p3Salary = Integer.parseInt(p3);
        if (p1Salary > p2Salary && p2Salary > p3Salary) {
            return p1Salary;
        } else if (p2Salary > p3Salary) {
            return p2Salary;
        } else {
            return p3Salary;
        }
    }
}
