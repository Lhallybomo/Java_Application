
package Chapter_10.Assignment;


public class Square extends TwoDimensionalShape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getDescription() {
        return "Square with side: " + side;
    }
}