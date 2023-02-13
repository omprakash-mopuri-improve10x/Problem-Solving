package com.omprakash.problemsolving.minutestoseconds;

public class MinutesToSecondsControllerImpl implements MinutesToSecondsController{
    @Override
    public int getSeconds(String minutes) {
        try {
            int mins = Integer.parseInt(minutes);
            int seconds = mins * 60;
            return seconds;
        } catch (Exception ex) {
            return -1;
        }
    }
}
