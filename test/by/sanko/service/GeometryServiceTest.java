package by.sanko.service;

import by.sanko.entity.Point;
import by.sanko.exception.WrongInputException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class GeometryServiceTest {
    private  GeometryService geometryService;
    @BeforeTest
    public void setUp(){
        geometryService = new GeometryService();
    }

    @Test
    public void testCalculateSquareDifferencesIncorrectInput(){
        String  actual = "";
        try{
            actual = geometryService.calculateSquareDifferences(-1);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        String excepted = "";
        assertEquals(actual,excepted);
    }


    @Test
    public void testCalculateSquareDifferencesPositive(){
        String  actual = "";
        try{
            actual = geometryService.calculateSquareDifferences(16);
        }catch (WrongInputException e){
            e.printStackTrace();
        }
        double square = 4;
        String excepted = "Square of small square " + square + " , the difference between squares is "+4.0;
        assertEquals(actual,excepted);
    }

    @Test
    public void testCloserPointIncorrectFirstPoint(){
        Point firstPoint = new Point("A",-10,20);
        Point secondPoint = new Point("B",110,20);
        Point actual = new Point();

        try{
            actual = geometryService.closerPoint(firstPoint,secondPoint);
        }catch (WrongInputException e) {
            e.printStackTrace();
        }
        Point excepted = firstPoint;
        assertEquals(actual,excepted);
    }
    @Test
    public void testCloserPointIncorrectSecondPoint(){
        Point firstPoint = new Point("A",10,20);
        Point secondPoint = new Point("B",-110,20);
        Point actual = new Point();

        try{
            actual = geometryService.closerPoint(firstPoint,secondPoint);
        }catch (WrongInputException e) {
            e.printStackTrace();
        }
        Point excepted = firstPoint;
        assertEquals(actual,excepted);
    }

    @Test
    public void testCloserPointPositiveFirstPoint(){
        Point firstPoint = new Point("A",10,20);
        Point secondPoint = new Point("B",110,20);
        Point actual = new Point();

        try{
            actual = geometryService.closerPoint(firstPoint,secondPoint);
        }catch (WrongInputException e) {
            e.printStackTrace();
        }
        Point excepted = firstPoint;
        assertEquals(actual,excepted);
    }

    @Test
    public void testCloserPointPositiveSecondPoint(){
        Point firstPoint = new Point("A",2110,20);
        Point secondPoint = new Point("B",110,20);
        Point actual = new Point();

        try{
            actual = geometryService.closerPoint(firstPoint,secondPoint);
        }catch (WrongInputException e) {
            e.printStackTrace();
        }
        Point excepted = secondPoint;
        assertEquals(actual,excepted);
    }

    @Test
    public void testCalculateLengthOfRoundIncorrectInput(){
        double actual = 0;
        try{
            actual = geometryService.calculateLengthOfRound(-1);
        }catch (WrongInputException e) {
            e.printStackTrace();
        }
        double excepted = 0;
        assertEquals(actual,excepted);
    }

    @Test
    public void testCalculateLengthOfRoundPositive(){
        double actual = 0;
        try{
            actual = geometryService.calculateLengthOfRound(2 / Math.PI);
        }catch (WrongInputException e) {
            e.printStackTrace();
        }
        double excepted = 4;
        assertEquals(actual,excepted);
    }

    @Test
    public void testCalculateSquareOfCircleIncorrectInput(){
        double actual = 0;
        try{
            actual = geometryService.calculateLengthOfRound(-1);
        }catch (WrongInputException e) {
            e.printStackTrace();
        }
        double excepted = 0;
        assertEquals(actual,excepted);
    }

    @Test
    public void testCalculateSquareOfCirclePositive(){
        double actual = 0;
        try{
            actual = geometryService.calculateSquareOfCircle(2);
        }catch (WrongInputException e) {
            e.printStackTrace();
        }
        double excepted = 4 * Math.PI;
        assertEquals(actual,excepted);
    }

}
