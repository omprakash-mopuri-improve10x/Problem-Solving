package com.omprakash.problemsolving.findthebomb;

public class FindTheBombControllerImpl implements FIndTheBombController {
    @Override
    public String findTheBomb(String text) {
        String result = "";
        String textInLowerCase = text.toLowerCase();
        if (textInLowerCase.contains("bomb")) {
            result = "DUCK!";
        } else {
            result = "Relax, there's no bomb.";
        }
        return result;
    }
}

