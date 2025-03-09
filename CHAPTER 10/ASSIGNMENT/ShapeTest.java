
package Chapter_10.Assignment;


public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new Cube(3),
            new Sphere(2)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.getDescription());
            
            if (shape instanceof TwoDimensionalShape twoDShape) {
                System.out.printf("Area: %.2f%n", twoDShape.getArea());
            }
            
            if (shape instanceof ThreeDimensionalShape threeDShape) {
                System.out.printf("Area: %.2f, Volume: %.2f%n", threeDShape.getArea(), threeDShape.getVolume());
            }
        }
    }
}