/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadedesignpattern;

/**
 * Demonstrates the Facade Design Pattern.
 * @author nisarg
 * @version 1.1
 */
public class FacadeDesignPattern {

    /**
     * The main method serves as the program entry point.
     * @param args the command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
    
}
