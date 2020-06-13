package by.sanko.service;

import by.sanko.entity.Circle;
import by.sanko.entity.Point;
import by.sanko.entity.Square;
import by.sanko.exception.WrongInputException;
import by.sanko.validator.GeometryValidator;

public class GeometryService {

    public String calculateSquareDifferences(double square) throws WrongInputException {
        GeometryValidator validator = new GeometryValidator();
        if(!validator.ifItPositive(square)){
            throw new WrongInputException("Square cannot be not positive");
        }
        Square bigSquare = new Square(square);
        double radius = bigSquare.getSide() / 2;
        Circle circle = new Circle(radius);
        double diagonalOfSmallSquare = circle.getRadius() * 2;
        Square smallSquare = new Square(diagonalOfSmallSquare);
        double difference =  bigSquare.getSquare() / smallSquare.getSquare();
        StringBuilder builder = new StringBuilder();
        builder.append("Square of small square ");
        builder.append(smallSquare.getSquare());
        builder.append(" , the difference between squares is ");
        builder.append(difference);
        return builder.toString();
    }

    public Point closerPoint(Point firstPoint, Point secondPoint) throws WrongInputException {
        GeometryValidator validator = new GeometryValidator();
        if(!validator.validatePoint(firstPoint)){
            throw new WrongInputException("First point isn't correct");
        }
        if(!validator.validatePoint(secondPoint)){
            throw new WrongInputException("Second point isn't correct");
        }

        double firstDistance = firstPoint.calculateDistanceToStart();
        double secondDistance = secondPoint.calculateDistanceToStart();

        if(firstDistance <= secondDistance){
            return firstPoint;
        }
        return secondPoint;
    }

    public double calculateLengthOfRound(double radius) throws WrongInputException {
        GeometryValidator validator = new GeometryValidator();
        if(!validator.ifItPositive(radius)){
            throw new WrongInputException("Radius cannot be not positive");
        }
        Circle circle = new Circle(radius);
        return circle.getLengthOfRound();
    }

    public double calculateSquareOfCircle(double radius) throws WrongInputException {
        GeometryValidator validator = new GeometryValidator();
        if(!validator.ifItPositive(radius)){
            throw new WrongInputException("Radius cannot be not positive");
        }
        Circle circle = new Circle(radius);
        return circle.getSquareOfCircle();
    }


}
