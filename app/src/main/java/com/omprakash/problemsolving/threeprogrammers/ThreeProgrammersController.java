package com.omprakash.problemsolving.threeprogrammers;

import com.omprakash.problemsolving.InvalidInputException;

public interface ThreeProgrammersController {
    int getDiffMaxAndMin(String p1, String p2, String p3) throws InvalidInputException;
    int findMin(int p1, int p2, int p3);
    int findMax(int p1, int p2, int p3);
}
