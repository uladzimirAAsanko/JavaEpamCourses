package by.sanko.validator;

import by.sanko.entity.Point;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GeometryValidatorTest {
    private GeometryValidator geometryValidator;

    @BeforeTest
    public void setUp(){
        geometryValidator = new GeometryValidator();
    }

    @Test
    public void testIfItPositivePositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = geometryValidator.ifItPositive(1);

        assertEquals(actual,excepted);
    }

    @Test
    public void testIfItPositiveNegative(){
        boolean actual = false;
        boolean excepted = false;
        actual = geometryValidator.ifItPositive(-1);

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidatePointNegativeNullCheck(){
        boolean actual = false;
        boolean excepted = false;
        actual = geometryValidator.validatePoint(null);

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidatePointNegative(){
        boolean actual = false;
        boolean excepted = false;
        actual = geometryValidator.validatePoint(new Point("dsa", -1, 1));

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidatePointNegativeOne(){
        boolean actual = false;
        boolean excepted = false;
        actual = geometryValidator.validatePoint(new Point("dsa", 1, -1));

        assertEquals(actual,excepted);
    }

    @Test
    public void testValidatePointPositive(){
        boolean actual = false;
        boolean excepted = true;
        actual = geometryValidator.validatePoint(new Point("dsa", 1, 1));

        assertEquals(actual,excepted);
    }
}
