
package Chapter_10.Assignment;



public class Circle extends TwoDimensionalShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle with radius: " + radius;
    }
}