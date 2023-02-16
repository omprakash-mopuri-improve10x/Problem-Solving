package com.omprakash.problemsolving.convhrsminsintosecs;

public class ConvHoursAndMinutesIntoSecondsControllerImpl implements ConvHoursAndMinutesIntoSecondsController{

    @Override
    public int getSeconds(String hours, String minutes) throws NumberFormatException{
        int hoursInt = Integer.parseInt(hours);
        int minutesInt = Integer.parseInt(minutes);
        int seconds = hoursInt * 3600 + minutesInt * 60;
        return seconds;
    }
}
