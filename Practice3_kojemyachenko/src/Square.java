package kojemyachenko;

public class Square extends Rectangle {
    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide(){
        return this.lenght;
    }
    public void setSide(double side){
        this.lenght = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + widht +
                ", length=" + lenght +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    void getWidth(double side){
        this.setWidht(side);
    }
    void getLength(double side){
        this.setLenght(side);
    }
}
