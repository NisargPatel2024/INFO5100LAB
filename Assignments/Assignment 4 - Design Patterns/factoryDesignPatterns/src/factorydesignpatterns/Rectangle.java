/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpatterns;

/**
 * Rectangle is a concrete class which implements the shape interface.
 *
 * @author nisarg
 * @version 1.1
 */
public class Rectangle implements Shape {
    /**
     * The draw() method for the Rectangle class returns the String "Rectangle::draw()".
     * @author nisarg
     * @version 1.1
     */
    @Override
    public String draw() {
        System.out.println("Inside Rectangle::draw() method.");
        return "Rectangle";
    }
}
