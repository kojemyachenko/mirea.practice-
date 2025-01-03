package Exercise_4_6;

public class square extends geometric_object implements colorable {
    private double side;

    public square() {
        this.side = 1;
    }

    public square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + side +
                ", площадью " + getArea() +
                " и периметром " + getPerimeter();
    }
}