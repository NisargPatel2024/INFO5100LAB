/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorydesignpatterns;

/**
 * Main class demonstrating the Factory Design Pattern.
 * @author nisarg
 */
public class FactoryDesignPatterns {

    /**
     * Main method to demonstrate the use of the Factory Design Pattern.
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // Call draw method of Circle
        shape1.draw();

        // Get an object of Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        // Call draw method of Rectangle
        shape2.draw();

        // Get an object of Square and call its draw method
        Shape shape3 = shapeFactory.getShape("SQUARE");
        // Call draw method of Square
        shape3.draw();
    }
}
