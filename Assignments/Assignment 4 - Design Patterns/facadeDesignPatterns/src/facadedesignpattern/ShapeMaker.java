/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;

/**
 * The ShapeMaker is a concrete class with represents the Facade Design Pattern.
 * @author nisarg
 * @version 1.1
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    /**
     * The ShapeMaker constructor creates objects of Circle, Rectangle and Square objects.
     * @author nisarg
     * @version 1.0
     */
    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    /**
     * The drawCircle() return the draw() method from the Circle object.
     * @return String
     * @author nisarg
     * @version 1.1
     */
    public String drawCircle(){
        return circle.draw();
    }
    
    /**
     * The drawRectangle() return the draw() method from the Rectangle object.
     * @return String
     * @author nisarg
     * @version 1.1
     */
    public String drawRectangle(){
        return rectangle.draw();
    }
    
    /**
     * The drawSquare() return the draw() method from the Square object.
     * @return String
     * @author nisarg
     * @version 1.1
     */
    public String drawSquare(){
        return square.draw();
    }
}
