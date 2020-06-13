package by.sanko.entity;

import java.util.Objects;

public class Circle {
    private double radius;
    private double squareOfCircle;
    private double lengthOfRound;

    public Circle(double radius) {
        this.radius = radius;
        squareOfCircle = Math.pow(radius, 2) * Math.PI;
        lengthOfRound = Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquareOfCircle() {
        return squareOfCircle;
    }

    public double getLengthOfRound() {
        return lengthOfRound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Double.compare(circle.squareOfCircle, squareOfCircle) == 0 &&
                Double.compare(circle.lengthOfRound, lengthOfRound) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, squareOfCircle, lengthOfRound);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", squareOfCircle=" + squareOfCircle +
                ", lengthOfRound=" + lengthOfRound +
                '}';
    }
}
