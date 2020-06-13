package by.sanko.service;

import by.sanko.exception.WrongInputException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TimeServicesTest {
    private TimeServices timeServices;

    @BeforeTest
    public void setUp(){
        timeServices = new TimeServices();
    }

    @Test
    public void testCalculateDaysIncorrectYear(){
        int year = -100;
        int month = 10;

        int actual = 29;
        int excepted = 29;
        try {
            actual = timeServices.calculateDays(year, month);
        }catch (WrongInputException e){
            e.printStackTrace();
        }

        assertEquals(actual,excepted);
    }

    @Test
    public void testCalculateDaysIncorrectMonth(){
        int year = 1969;
        int month = -100;

        int actual = 29;
        int excepted = 29;
        try {
            actual = timeServices.calculateDays(year, month);
        }catch (WrongInputException e){
            e.printStackTrace();
        }

        assertEquals(actual,excepted);
    }

    @Test
    public void testCalculateDaysIncorrectMonth13(){
        int year = 1969;
        int month = 12;

        int actual = 29;
        int excepted = 29;
        try {
            actual = timeServices.calculateDays(year, month);
        }catch (WrongInputException e){
            e.printStackTrace();
        }

        assertEquals(actual,excepted);
    }

    @Test
    public void testCalculateDaysPositive(){
        int year = 2020;
        int month = 3;

        int actual = 29;
        int excepted = 31;
        try {
            actual = timeServices.calculateDays(year, month);
        }catch (WrongInputException e){
            e.printStackTrace();
        }

        assertEquals(actual,excepted);
    }


    @Test
    public void testCalculateHoursMinutesAndSecondsIncorrectInput(){
        int seconds = -1;

        String actual = "";
        String excepted = "";

        try {
            actual = timeServices.calculateHoursMinutesAndSeconds(seconds);
        }catch (WrongInputException e){
            e.printStackTrace();
        }

        assertEquals(actual,excepted);
    }

    @Test
    public void testCalculateHoursMinutesAndSecondsIncorrectInputOne(){
        int seconds = 86402;

        String actual = "";
        String excepted = "";

        try {
            actual = timeServices.calculateHoursMinutesAndSeconds(seconds);
        }catch (WrongInputException e){
            e.printStackTrace();
        }

        assertEquals(actual,excepted);
    }


    @Test
    public void testCalculateHoursMinutesAndSecondsPositive(){
        int seconds = 26478;

        String actual = "";
        String excepted = "";

        try {
            actual = timeServices.calculateHoursMinutesAndSeconds(seconds);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        excepted = "Now is " + 7 + " hours " + 21 + " minutes " +18 + "seconds.";

        assertEquals(actual,excepted);
    }

}
