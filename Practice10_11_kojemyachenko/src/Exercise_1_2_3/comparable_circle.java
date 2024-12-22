package Exercise_1_2_3;

public class comparable_circle extends circle {

    public comparable_circle(double radius) {
        super(radius);
    }

    public boolean equals(Object obj) {
        return obj instanceof comparable_circle && getArea() == ((comparable_circle)obj).getArea();
    }
}
