package by.sanko.validator;

public class TimeValidator {
    private static final int SECONDS_IN_DAY = 86400;
    public boolean validateYear(int year){
        return year > 1969;
    }

    public boolean validateMonth(int month){
        return month >= 0 && month < 12;
    }

    public boolean isCorrectSeconds(int totalSeconds){
        return totalSeconds <= SECONDS_IN_DAY && totalSeconds > 0;
    }
}
