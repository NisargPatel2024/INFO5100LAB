package facadedesignpattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Circle is a concrete class which implements the shape interface.
 * @author nisarg
 * @version 1.1
 */

public class Circle implements Shape{
    /**
     * The draw() method for the Circle class returns the String
     * "Circle::draw()".
     * @return String
     * @author nisarg
     * @version 1.1
     */
    @Override
    public String draw() {
        System.out.println("Circle::draw()");
        return "Circle::draw()";
    }
    
}
