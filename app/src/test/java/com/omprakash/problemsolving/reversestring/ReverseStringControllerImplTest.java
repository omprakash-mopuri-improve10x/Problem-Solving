package com.omprakash.problemsolving.reversestring;

import junit.framework.TestCase;

public class ReverseStringControllerImplTest extends TestCase {

    public void testRevString() {
        String expectedOutput = "olleH";
        String actualOutput = new ReverseStringControllerImpl().revString("Hello");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testRevString1() {
        String expectedOutput = "";
        String actualOutput = new ReverseStringControllerImpl().revString("");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testRevString2() {
        String expectedOutput = "dlroW olleH";
        String actualOutput = new ReverseStringControllerImpl().revString("Hello World");
        assertEquals(expectedOutput, actualOutput);
    }
}