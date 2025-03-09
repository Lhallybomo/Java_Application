
package Chapter_10.Assignment;


public class Sphere extends ThreeDimensionalShape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius; // Surface area of a sphere
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius; // Volume of a sphere
    }

    @Override
    public String getDescription() {
        return "Sphere with radius: " + radius;
    }
}