package com.omprakash.problemsolving.strechedword;

import junit.framework.TestCase;

public class StrechedWordControllerImplTest extends TestCase {

    public void testStrechedWord() throws Exception {
        String expectedOutput = "poem";
        String actualOutput = new StrechedWordControllerImpl().strechedWord("ppooeemm");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testStrechedWord1() throws Exception {
        String expectedOutput = "PoEm";
        String actualOutput = new StrechedWordControllerImpl().strechedWord("PpooEeemm");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testStrechedWord2() throws Exception {
        String expectedOutput = "";
        String actualOutput = new StrechedWordControllerImpl().strechedWord("");
        assertEquals(expectedOutput, actualOutput);
    }

    public void testStrechedWord3() throws Exception {
        String expectedOutput = "Omprakash";
        String actualOutput = new StrechedWordControllerImpl().strechedWord("Omprakash");
        assertEquals(expectedOutput, actualOutput);
    }
}