package Exercise_1_2_3;

public abstract class geometric_object implements comparable<geometric_object> {
    private String color = "зелёный";
    private boolean filled;
    private java.util.Date dateCreated;

    protected geometric_object() {
        dateCreated = new java.util.Date();
    }

    protected geometric_object(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "создано " + dateCreated + "\nцвет: " + color +
                " и заливка: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(geometric_object o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    public static geometric_object max(geometric_object o1, geometric_object o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }
}
