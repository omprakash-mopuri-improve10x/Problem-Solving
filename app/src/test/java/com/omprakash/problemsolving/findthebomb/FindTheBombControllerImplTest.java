package com.omprakash.problemsolving.findthebomb;

import junit.framework.TestCase;

public class FindTheBombControllerImplTest extends TestCase {

    public void testFindTheBomb() {
        String expectedOutput = "DUCK!";
        String actualOutput = new FindTheBombControllerImpl().findTheBomb("There is a bomb.");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testFindTheBomb1() {
        String expectedOutput = "DUCK!";
        String actualOutput = new FindTheBombControllerImpl().findTheBomb("Hey, did you think there is a BOMB?");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testFindTheBomb2() {
        String expectedOutput = "Relax, there's no bomb.";
        String actualOutput = new FindTheBombControllerImpl().findTheBomb("This goes boom!!!");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testFindTheBomb3() {
        String expectedOutput = "";
        String actualOutput = new FindTheBombControllerImpl().findTheBomb(null);
        assertEquals(expectedOutput, actualOutput);
    }
}