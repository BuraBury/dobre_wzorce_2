package zadanie9;

public class Circle {
    private final Point2D center;
    private final Point2D point;


    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    double getRadius() {
        return Math.sqrt(Math.pow(center.getX() - center.getY(), 2) + Math.pow(point.getX() - point.getY(), 2));
    }

    double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    double getArea() {
        return Math.PI * getRadius() * getRadius();
    }


}
