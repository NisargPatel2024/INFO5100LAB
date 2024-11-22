package facadedesignpattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nisarg
 * @version 1.0.1
 */
public class ShapeMakerTest {

    public ShapeMakerTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test case for Circle.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Circle::draw()";
        String result = instance.drawCircle();

        // Positive test case
        assertEquals(expResult, result);

        // Negative test case
        assertNotEquals("Not Circle", result);
        assertNotEquals("Rectangle", result);
    }

    /**
     * Test of drawRectangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Rectangle::draw()";
        String result = instance.drawRectangle();

        // Positive test case
        assertEquals(expResult, result);

        // Negative test case
        assertNotEquals("Not Rectangle", result);
        assertNotEquals("Square", result);
    }

    /**
     * Test of drawSquare method, of class ShapeMaker.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Square::draw()";
        String result = instance.drawSquare();

        // Positive test case
        assertEquals(expResult, result);

        // Negative test case
        assertNotEquals("Not Square", result);
        assertNotEquals("Rectangle", result);
    }
}
