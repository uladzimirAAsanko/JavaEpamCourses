package by.sanko.service;

import by.sanko.exception.WrongInputException;
import by.sanko.validator.NumericValidator;

import java.util.HashMap;

public class NumericServices {
    private final int DECIMAL_DIVISOR = 10;
    private final int EVEN_DIVIDER = 2;

    public int calculateLastDigitOfSquare(int number){
        int lastDigit = number % DECIMAL_DIVISOR;
        return  (int)Math.pow(lastDigit,2) % DECIMAL_DIVISOR;
    }

    public boolean twoOrMoreNumbersIsEven(int[] numbers){
        if(numbers.length != 4){
            return false;
        }

        int count = 0;
        for(int i = 0; i < 4; i++){
            if(numbers[i] % EVEN_DIVIDER == 0){
                count++;
            }
            if(count >= 2){
                return true;
            }
        }

        return false;
    }

    public boolean isPerfect(int number) throws WrongInputException {
        NumericValidator validator = new NumericValidator();
        if(!validator.isNatural(number)){
            throw new WrongInputException("Number isnt Integer");
        }
        if(!validator.isEven(number)){
            return false;
        }

        if(validator.isFirstPerfect(number)){
            return true;
        }

        int sumOfOrder = 0;
        int orderElement = 1;

        while(sumOfOrder < number){
            sumOfOrder += Math.pow(orderElement,3);
            orderElement += 2;
        }
        return number == sumOfOrder;
    }

    public double solveFunction(double number) throws WrongInputException {
        NumericValidator validator = new NumericValidator();
        if(!validator.isFunctionDefined(number)){
            throw new WrongInputException("Incorrect Input");
        }

        if(number >= 3){
            return -1 * Math.pow(number,2) + 3 * number + 9;
        }else{
            return 1 / (Math.pow(number,3) - 6);
        }
    }

    public HashMap calculateFunctionValues(double leftSide, double rightSide, double step) throws WrongInputException {
        NumericValidator validator = new NumericValidator();
        if(!validator.isLineCorrect(leftSide,rightSide,step)){
            throw new WrongInputException("Incorrect Input");
        }

        HashMap<Double, Double> map = new HashMap<>();
        double x = leftSide;
        double current = Math.tan(x);
        while(x < rightSide){
            map.put(x,current);
            x += step;
        }
        return  map;
    }
}
