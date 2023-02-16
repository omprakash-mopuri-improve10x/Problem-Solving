package com.omprakash.problemsolving.strechedword;

import java.util.Locale;

public class StrechedWordControllerImpl implements StrechedWordController {
    @Override
    public String strechedWord(String word) throws Exception{
        String newWord = String.valueOf(word.charAt(0));
        for (int i = 0; i < word.length() - 1; i++) {
            char c = word.toLowerCase().charAt(i);
            if (c != word.toLowerCase().charAt(i + 1)) {
                newWord += word.charAt(i + 1);
            }
        }
        return newWord;
    }
}
