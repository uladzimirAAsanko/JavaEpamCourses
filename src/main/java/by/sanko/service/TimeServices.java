package by.sanko.service;

import by.sanko.enums.Months;
import by.sanko.exception.WrongInputException;
import by.sanko.validator.TimeValidator;

public class TimeServices {
    static final int fourHundreed = 400;
    static final int four = 4;
    static final int hundreed = 100;
    static final int SECONDS_IN_HOUR = 3600;
    static final int SECONDS_IN_MINUTE = 60;

    public int calculateDays(int year, int month) throws WrongInputException {
        TimeValidator validator = new TimeValidator();
        if(!validator.validateMonth(month)){
            throw new WrongInputException("Incorrect month");
        }
        if(!validator.validateYear(year)){
            throw new WrongInputException("Incorrect year");
        }

        Months currMonth = Months.values()[month -1];

        if(currMonth == Months.FEBRUARY){
            if(isYearBissextile(year)){
                return currMonth.getNumberOfDays() + 1;
            }
        }
        return currMonth.getNumberOfDays();
    }

    private boolean isYearBissextile(int year){
        if(year % fourHundreed == 0){
            return true;
        }
        if(year % hundreed == 0){
            return false;
        }
        return year % four == 0;
    }

    public String calculateHoursMinutesAndSeconds(int totalSec) throws WrongInputException {
        TimeValidator validator = new TimeValidator();
        if(!validator.isCorrectSeconds(totalSec)){
            throw new WrongInputException("Too much input seconds");
        }

        int hours = totalSec / SECONDS_IN_HOUR;
        int tempSec = totalSec % SECONDS_IN_HOUR;
        int minute = tempSec / SECONDS_IN_MINUTE;
        int seconds = tempSec % SECONDS_IN_MINUTE;

        StringBuilder builder = new StringBuilder();
        builder.append("Now is ");
        builder.append(hours);
        builder.append(" hours ");
        builder.append(minute);
        builder.append(" minutes ");
        builder.append(seconds);
        builder.append("seconds.");
        return builder.toString();
    }
}
