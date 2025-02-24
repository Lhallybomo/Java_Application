
package chapter_9.Assignment;


abstract class Quadrilateral {
   private final Point[] vertices = new Point[4];
    
    public Quadrilateral(Point v1, Point v2, Point v3, Point v4) {
        vertices[0] = v1;
        vertices[1] = v2;
        vertices[2] = v3;
        vertices[3] = v4;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

