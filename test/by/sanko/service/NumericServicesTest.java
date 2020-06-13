package by.sanko.service;

import by.sanko.exception.WrongInputException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.*;
public class NumericServicesTest {
    private  NumericServices numericServices;
    @BeforeTest
    public void setUp(){
        numericServices = new NumericServices();
    }
    @Test()
    public void testCalculateLastDigitOfSquarePositive(){
        int actual = numericServices.calculateLastDigitOfSquare(25);
        int expected = 5;
        assertEquals(actual,expected);
    }


    @Test()
    public void testTwoEvenPositive(){
        int[] tmp;
        tmp = new int[]{1, 2, 3, 4};
        boolean actual = numericServices.twoOrMoreNumbersIsEven(tmp);
        boolean excepted = true;
        assertEquals(actual,excepted);
    }

    @Test()
    public void testTwoEvenNegative(){
        int[] tmp;
        tmp = new int[]{1, 2, 3, 4,5};
        boolean actual = numericServices.twoOrMoreNumbersIsEven(tmp);
        boolean excepted = false;
        assertEquals(actual,excepted);
    }

    @Test()
    public void testTwoEvenNegative1(){
        int[] tmp;
        tmp = new int[]{1, 2, 3, 5};
        boolean actual = numericServices.twoOrMoreNumbersIsEven(tmp);
        boolean excepted = false;
        assertEquals(actual,excepted);
    }

    @Test()
    public void testIsPerfectPositive(){
        boolean actual = false;
        try{
            actual = numericServices.isPerfect(6);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        boolean excepted = true;
        assertEquals(actual,excepted);
    }
    @Test()
    public void testIsPerfectIncorrectData(){
        boolean actual = false;
        try{
            actual = numericServices.isPerfect(-1);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        boolean excepted = false;
        assertEquals(actual,excepted);
    }

    @Test()
    public void testIsPerfectNegative(){
        boolean actual = false;
        try{
            actual = numericServices.isPerfect(5);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        boolean excepted = false;
        assertEquals(actual,excepted);
    }

    @Test()
    public void testIsPerfectTrueNotFirst(){
        boolean actual = false;
        try{
            actual = numericServices.isPerfect(496);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        boolean excepted = true;
        assertEquals(actual,excepted);
    }

    @Test()
    public void testSolveFunctionIncorrectData(){
        double actual = 0;
        try{
            actual = numericServices.solveFunction(Math.pow(6,0.33333333333333333333334));
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        double excepted = 0;
        assertEquals(actual,excepted);
    }

    @Test()
    public void testSolveFunctionPositive(){
        double actual = 0;
        try{
            actual = numericServices.solveFunction(0);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        double excepted = (double)-1/6;
        assertEquals(actual,excepted);
    }

    @Test()
    public void testSolveFunctionPositiveAnother(){
        double actual = 0;
        try{
            actual = numericServices.solveFunction(5);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        double excepted = -1;
        assertEquals(actual,excepted);
    }

    @Test()
    public void testCalculateFunctionValueIncorrectInput(){
        HashMap actual = new HashMap();
        try{
            actual = numericServices.calculateFunctionValues(5,-6,0.1);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        HashMap excepted = new HashMap();
        assertEquals(actual,excepted);
    }

    @Test()
    public void testCalculateFunctionValuePositive(){
        HashMap actual = new HashMap();
        try{
            actual = numericServices.calculateFunctionValues(4.5,8.0,0.5);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        HashMap excepted = new HashMap();
        double x = 4.5;
        double current = Math.tan(x);
        while(x < 8){
            excepted.put(x,current);
            x += 0.5;
        }
        assertEquals(actual,excepted);
    }
}
