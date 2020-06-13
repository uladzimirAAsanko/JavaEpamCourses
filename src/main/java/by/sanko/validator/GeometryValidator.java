package by.sanko.validator;

import by.sanko.entity.Point;

public class GeometryValidator {
    public boolean ifItPositive(double number){
        return number > 0;
    }

    public boolean validatePoint(Point point){
        if(point == null){
            return false;
        }
        if(point.getxCoordinate() < 0 || point.getyCoordinate() < 0){
            return false;
        }
        return true;
    }
}
