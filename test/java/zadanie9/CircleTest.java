package zadanie9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void radiusCalculation() {
       Circle circle = new Circle(new Point2D(0, 0), new Point2D(1, 0));
        Assertions.assertEquals(1.0, circle.getRadius());
    }
    @Test
    void radiusAreaCalculation() {
        Circle circle = new Circle(new Point2D(0, 0), new Point2D(1, 0));
        Assertions.assertEquals(Math.PI, circle.getArea());
    }
}