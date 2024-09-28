package kojemyachenko;

public class Rectangle extends Shape  {
    protected double widht;
    protected double lenght;

    public Rectangle(String color, boolean filled, double widht, double lenght) {
        super(color, filled);
        this.widht = widht;
        this.lenght = lenght;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public double getArea(){
        return this.widht * this.lenght;
    }
    public double getPerimetr(){
        return 2 * this.lenght + 2 * this.widht;
    }

}