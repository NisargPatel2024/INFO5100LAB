package singletondesignpattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This class demonstrates the Singleton Design Pattern.
 * @author nisarg
 */
class SingleObject {

    /**
     * A private static instance of the class. This is the single instance
     * that will be shared globally.
     */
    private static SingleObject instance = new SingleObject();

    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private SingleObject() {}

    /**
     * Provides access to the single instance of the {@code SingleObject} class.
     * 
     * @return the single instance of {@code SingleObject}.
     */
    public static SingleObject getInstance() {
        return instance;
    }

    /**
     * Displays a message to the console.
     */
    public void showMessage() {
        System.out.println("Hello World!");
    }
}

/**
 * Singleton Design Pattern by accessing and using the {@code SingleObject} class.
 * 
 * @author nisarg
 */
public class SingletonPatternDemo {

    /**
     * The main method serves as the entry point for the program.
     * 
     * @param args command-line arguments passed to the program (not used).
     */
    public static void main(String[] args) {
        // Get the single instance of SingleObject
        SingleObject object = SingleObject.getInstance();

        // Call the showMessage method
        object.showMessage();
    }
}
