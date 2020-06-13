package by.sanko.validator;

public class NumericValidator {

    private final int FUNCTION_ZERO_DIVIDER = 6;
    private final int EVEN_DIVIDER = 2;
    private final int FIRST_PERFECT = 6;

    public boolean isNatural(int number){
        return number > 0;
    }

    public boolean isFunctionDefined(double number){
        return Math.pow(number, 3) != FUNCTION_ZERO_DIVIDER;
    }

    public boolean isEven(int number){
        return number % EVEN_DIVIDER == 0;
    }

    public boolean isFirstPerfect (int number){
        return number == FIRST_PERFECT;
    }

    public boolean isLineCorrect(double leftSide, double rightSide, double step){
        if(leftSide < rightSide && rightSide - leftSide > step){
            return true;
        }
        return false;
    }
}
