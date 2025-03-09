
package Chapter_10.Assignment;


public class Cube extends ThreeDimensionalShape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side; // Surface area of a cube
    }

    @Override
    public double getVolume() {
        return side * side * side; // Volume of a cube
    }

    @Override
    public String getDescription() {
        return "Cube with side: " + side;
    }
}