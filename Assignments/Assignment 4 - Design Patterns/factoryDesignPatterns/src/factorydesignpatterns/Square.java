/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpatterns;

/**
 * Square is a concrete class which implements the shape interface.
 * @author nisarg
 * @version 1.1
 */

public class Square implements Shape {

    /**
     * The draw() method for the Square class returns the String
     * "Square::draw()".
     * @author nisarg
     * @version 1.1
     */
    
    @Override
    public String draw() {
        System.out.println("Indside Square::draw() method");
        return "Square";
    }

}
