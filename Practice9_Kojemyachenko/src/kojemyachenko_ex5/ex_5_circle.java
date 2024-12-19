package kojemyachenko_ex5;

public class ex_5_circle {
    private double radius;
    public ex_5_circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getRadius() {
        return radius;
    }
    public static void main(String[] args) {
        ex_5_circle[] circles = {
                new ex_5_circle(6.0),
                new ex_5_circle(3.5),
                new ex_5_circle(2.5),
                new ex_5_circle(7.4),
                new ex_5_circle(6.2)
        };
        int largestCircleIndex = 0;
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getArea() > circles[largestCircleIndex].getArea()) {
                largestCircleIndex = i;
            }
        }
        System.out.println("Круг с самой большой площадью: " + (largestCircleIndex + 1));
    }
}
