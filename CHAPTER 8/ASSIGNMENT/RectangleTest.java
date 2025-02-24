/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_8.Assignment;

/**
 *
 * @author user
 */
public class RectangleTest {
    public static void main(String[] args) {
        // Create a rectangle object using the default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 - Length: " + rect1.getLength() + ", Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        // Create a rectangle object using the parameterized constructor
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        System.out.println("\nRectangle 2 - Length: " + rect2.getLength() + ", Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());

        // Test setting new values
        rect2.setLength(10.0);
        rect2.setWidth(4.0);
        System.out.println("\nUpdated Rectangle 2 - Length: " + rect2.getLength() + ", Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());

        // Uncommenting the following lines will throw an exception
        // rect2.setLength(25.0); // This will throw an IllegalArgumentException
        // rect2.setWidth(-1.0);  // This will also throw an IllegalArgumentException
    }
}

