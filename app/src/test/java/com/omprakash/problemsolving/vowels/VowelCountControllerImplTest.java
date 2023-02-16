package com.omprakash.problemsolving.vowels;

import junit.framework.TestCase;

import org.junit.Assert;

public class VowelCountControllerImplTest extends TestCase {

    public void testVowelCount() throws Exception {
        int expectedOutput = 5;
        int actualOutput = new VowelCountControllerImpl().getVowelCount("Celebration");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testVowelCount1() throws Exception {
        int expectedOutput = 1;
        int actualOutput = new VowelCountControllerImpl().getVowelCount("Palm");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testVowelCount2() throws Exception {
        int expectedOutput = 5;
        int actualOutput = new VowelCountControllerImpl().getVowelCount("AEIOU");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testVowelCount3() throws Exception {
        int expectedOutput = 0;
        int actualOutput = new VowelCountControllerImpl().getVowelCount("");
        assertEquals(expectedOutput, actualOutput);
    }
}