package com.omprakash.problemsolving.vowels;

public class VowelCountControllerImpl implements VowelCountController {
    @Override
    public int getVowelCount(String text) throws Exception {
        String textInLowerCase = text.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < textInLowerCase.length(); i++) {
            char c = textInLowerCase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
