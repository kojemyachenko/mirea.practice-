package exercise_5.factory;

import exercise_5.Circle;

public class CircleFactory extends AbstractFactory {

    @Override
    public Circle createCircle(double radius) {
        return new Circle(radius);
    }
}
