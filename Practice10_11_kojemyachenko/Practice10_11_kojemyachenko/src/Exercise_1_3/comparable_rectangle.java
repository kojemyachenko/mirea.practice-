package Exercise_1_3;

public class comparable_rectangle extends rectangle {

    public comparable_rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof comparable_rectangle && getArea() == ((comparable_rectangle)obj).getArea();
    }
}
