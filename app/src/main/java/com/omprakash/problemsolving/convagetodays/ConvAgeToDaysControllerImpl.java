package com.omprakash.problemsolving.convagetodays;

public class ConvAgeToDaysControllerImpl implements ConvAgeToDaysController{
    @Override
    public int getDays(String age) throws Exception{
        int ageInt = Integer.parseInt(age);
        int days = ageInt * 365;
        return days;
    }
}
