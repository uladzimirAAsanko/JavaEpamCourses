package by.sanko.parser;

import by.sanko.entity.Point;
import by.sanko.service.TimeServices;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PointParseTest {
    private PointParser pointParser;

    @BeforeTest
    public void setUp(){
        pointParser = new PointParser();
    }

    @Test
    public void parseTestNull(){
        String input = "";
        Point actual = new Point();
        Point excepted = null;
        actual = pointParser.parse(input);
        assertEquals(actual,excepted);
    }

    @Test
    public void parseTestNot3Arguments(){
        String input = "dsa 1 2 1";
        Point actual = new Point();
        Point excepted = null;
        actual = pointParser.parse(input);
        assertEquals(actual,excepted);
    }

    @Test
    public void parseTestPositive(){
        String input = "a 0 1";
        Point actual = new Point();
        Point excepted = new Point("a", 0 ,1);
        actual = pointParser.parse(input);
        assertEquals(actual,excepted);
    }
}
