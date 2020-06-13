package by.sanko.entity;

import java.util.Objects;

public class Square {
    private double side = 0;
    private double diagonal = 0;
    private double square = 0;

    public Square(double square) {
        this.square = square;
        side = Math.pow(square, 0.5);
        diagonal = Math.pow(2, 0.5) * side;
    }

    public Square(double diagonal, boolean bigger){
        this.diagonal = diagonal;
        side = diagonal / Math.pow(2 , 0.5);
        square = Math.pow(side, 2);
    }

    public double getSide() {
        return side;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square1 = (Square) o;
        return Double.compare(square1.side, side) == 0 &&
                Double.compare(square1.diagonal, diagonal) == 0 &&
                Double.compare(square1.square, square) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, diagonal, square);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", diagonal=" + diagonal +
                ", square=" + square +
                '}';
    }
}
