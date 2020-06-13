package by.sanko.validator;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumericValidatorTest {
    private NumericValidator numericValidator;

    @BeforeTest
    public void setUp(){
        numericValidator = new NumericValidator();
    }

    @Test
    public void testIsNaturalPositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = numericValidator.isNatural(1);

        assertEquals(actual,excepted);
    }

    @Test
    public void testIsNaturalNegative(){
        boolean actual = false;
        boolean excepted = false;
        actual = numericValidator.isNatural(-1);

        assertEquals(actual,excepted);
    }


    @Test
    public void testIsEvenPositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = numericValidator.isEven(2);

        assertEquals(actual,excepted);
    }

    @Test
    public void testIsEvenNegative(){
        boolean actual = false;
        boolean excepted = false;
        actual = numericValidator.isEven(1);

        assertEquals(actual,excepted);
    }


    @Test
    public void testIsFunctionDefinedPositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = numericValidator.isFunctionDefined(0);

        assertEquals(actual,excepted);
    }

    @Test
    public void testIsFunctionDefinedNegative(){
        boolean actual = false;
        boolean excepted = false;
        double temp = Math.pow(6, 1.0 / 3);
        actual = numericValidator.isFunctionDefined(temp);

        assertEquals(actual,excepted);
    }

    @Test
    public void testIsFirstPerfectPositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = numericValidator.isFirstPerfect(6);

        assertEquals(actual,excepted);
    }

    @Test
    public void testIsFirstPerfectNegative(){
        boolean actual = false;
        boolean excepted = false;
        actual = numericValidator.isFirstPerfect(0);

        assertEquals(actual,excepted);
    }

    @Test
    public void testIsLineCorrectPositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = numericValidator.isLineCorrect(4.5,6,0.1);

        assertEquals(actual,excepted);
    }

    @Test
    public void testIsLineCorrectNegative(){
        boolean actual = false;
        boolean excepted = false;
        actual = numericValidator.isLineCorrect(4.5,2,0.1);

        assertEquals(actual,excepted);
    }

    @Test
    public void testIsLineCorrectNegativeOne(){
        boolean actual = false;
        boolean excepted = false;
        actual = numericValidator.isLineCorrect(4.5,6,2);

        assertEquals(actual,excepted);
    }

}
