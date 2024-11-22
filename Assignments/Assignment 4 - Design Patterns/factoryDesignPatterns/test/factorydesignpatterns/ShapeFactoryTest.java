/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package factorydesignpatterns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test class for testing the ShapeFactory implementation.
 * @author nisarg
 */
public class ShapeFactoryTest {
    
    /**
     * Default constructor for ShapeFactoryTest.
     */
    public ShapeFactoryTest() {
    }
    
    /**
     * Set up resources before any test methods are executed.
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     * Clean up resources after all test methods have been executed.
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Set up resources before each test method is executed.
     */
    @Before
    public void setUp() {
    }
    
    /**
     * Clean up resources after each test method is executed.
     */
    @After
    public void tearDown() {
    }

    /**
     * Test case for the getShape method with an empty shape type.
     * Verifies that the method returns null for invalid input.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        String shapeType = "";
        ShapeFactory instance = new ShapeFactory();
        Shape expResult = null;
        Shape result = instance.getShape(shapeType);
        assertEquals(expResult, result);
    }
    
    /**
     * Test case for the getShape method with the "CIRCLE" shape type.
     * Verifies that the method returns a valid Circle object.
     */
    @Test
    public void testGetShapeCircle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("CIRCLE");
        assertNotNull("Shape should not be null for CIRCLE", shape);
        assertEquals("Expected Circle instance", Circle.class, shape.getClass());
        assertEquals("Circle", shape.draw());
    }
    
    /**
     * Test case for the getShape method with the "RECTANGLE" shape type.
     * Verifies that the method returns a valid Rectangle object.
     */
    @Test
    public void testGetShapeRectangle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("RECTANGLE");
        assertNotNull("Shape should not be null for RECTANGLE", shape);
        assertEquals("Expected Rectangle instance", Rectangle.class, shape.getClass());
        assertEquals("Rectangle", shape.draw());
    }
    
    /**
     * Test case for the getShape method with the "SQUARE" shape type.
     * Verifies that the method returns a valid Square object.
     */
    @Test
    public void testGetShapeSquare() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("SQUARE");
        assertNotNull("Shape should not be null for SQUARE", shape);
        assertEquals("Expected Square instance", Square.class, shape.getClass());
        assertEquals("Square", shape.draw());
    }
}
