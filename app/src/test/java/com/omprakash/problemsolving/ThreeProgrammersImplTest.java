package com.omprakash.problemsolving;

import com.omprakash.problemsolving.threeprogrammers.ThreeProgrammersImpl;

import junit.framework.TestCase;

public class ThreeProgrammersImplTest extends TestCase {

    public void testGetDiffMaxAndMin() throws InvalidInputException {
        int expectedOutput = 5;
        int actualOutput = new ThreeProgrammersImpl().getDiffMaxAndMin("1", "6", "3");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testGetDiffMaxAndMin1() throws InvalidInputException {
        int expectedOutput = 22;
        int actualOutput = new ThreeProgrammersImpl().getDiffMaxAndMin("5", "16", "27");
        assertEquals(expectedOutput, actualOutput);
    }
}