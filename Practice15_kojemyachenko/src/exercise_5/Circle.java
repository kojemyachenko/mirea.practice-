package exercise_5;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Circle implements Comparable<Circle> {
    @Getter
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }
}
