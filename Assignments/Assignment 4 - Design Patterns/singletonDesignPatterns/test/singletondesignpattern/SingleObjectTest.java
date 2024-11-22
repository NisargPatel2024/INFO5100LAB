package singletondesignpattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class contains tests for the SingleObject class to ensure the Singleton Design Pattern works correctly.
 */
public class SingleObjectTest {

    /**
     * Test to verify that only one instance of SingleObject is created.
     */
    @Test
    public void testSingletonInstance() {
        // Get two instances of SingleObject
        SingleObject instance1 = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();

        // Assert that both instances are the same (Singleton property)
        assertEquals("Both instances should be the same.", instance1, instance2);
    }

    /**
     * Test to verify the functionality of the showMessage method.
     * This test checks if the method runs without errors, since it's hard to capture System.out output directly.
     */
    @Test
    public void testShowMessage() {
        SingleObject instance = SingleObject.getInstance();

        // Since showMessage prints to the console, we cannot capture it directly in a unit test.
        // Therefore, we will simply ensure that no exceptions are thrown when calling showMessage.
        try {
            instance.showMessage();
        } catch (Exception e) {
            fail("showMessage() should not throw any exceptions.");
        }
    }
}
