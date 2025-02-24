
package chapter_9.Assignment;


public class ShapeTest {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        Square square = new Square(p1, p2, p3, p4);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}