package com.omprakash.problemsolving.reversestring;

public class ReverseStringControllerImpl implements ReverseStringController {
    @Override
    public String revString(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return rev;
    }
}
