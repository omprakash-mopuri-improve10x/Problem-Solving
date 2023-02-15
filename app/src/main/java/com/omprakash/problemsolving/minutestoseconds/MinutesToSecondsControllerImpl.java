package com.omprakash.problemsolving.minutestoseconds;

import com.omprakash.problemsolving.InvalidInputException;

public class MinutesToSecondsControllerImpl implements MinutesToSecondsController {
    @Override
    public int getSeconds(String minutes) throws Exception {
        int mins = Integer.parseInt(minutes);
        int seconds = mins * 60;
        return seconds;
    }
}
