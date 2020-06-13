package by.sanko.entity;

import java.util.Objects;

public class Point {
    private String name;
    private double xCoordinate;
    private double yCoordinate;

    public Point(){}
    public Point(String name, double xCoordinate, double yCoordinate) {
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistanceToStart(){
        return Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.xCoordinate, xCoordinate) == 0 &&
                Double.compare(point.yCoordinate, yCoordinate) == 0 &&
                Objects.equals(name, point.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, xCoordinate, yCoordinate);
    }

    @Override
    public String toString() {
        return "Point{" +
                "name='" + name + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
