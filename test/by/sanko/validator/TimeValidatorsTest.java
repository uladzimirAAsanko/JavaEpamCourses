package by.sanko.validator;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TimeValidatorsTest {
    private TimeValidator timeValidator;
    @BeforeTest
    public void setUp(){
        timeValidator = new TimeValidator();
    }

    @Test
    public void testValidateYearPositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = timeValidator.validateYear(1971);

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidateYearNegative(){
        boolean actual = false;
        boolean excepted = false;
        actual = timeValidator.validateYear(0);

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidateMonthNegative(){
        boolean actual = false;
        boolean excepted = false;
        actual = timeValidator.validateMonth(-1);

        assertEquals(actual,excepted);
    }


    @Test
    public void testValidateMonthNegativeOne(){
        boolean actual = false;
        boolean excepted = false;
        actual = timeValidator.validateMonth(12);

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidateMonthPositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = timeValidator.validateMonth(6);

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidateSecondsNegative(){
        boolean actual = false;
        boolean excepted = false;
        actual = timeValidator.isCorrectSeconds(-1);

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidateSecondsNegativeOne(){
        boolean actual = false;
        boolean excepted = false;
        actual = timeValidator.isCorrectSeconds(86401);

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidateSecondsPositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = timeValidator.isCorrectSeconds(35);

        assertEquals(actual,excepted);
    }
}
