package Exercise_1_2_3;

public class sort_rectangles {
    public static void main(String[] args) {
        comparable_rectangle[] rectangles = {
                new comparable_rectangle(5.0, 5.0),
                new comparable_rectangle(15.0, 55.0),
                new comparable_rectangle(10.0, 35.0),
                new comparable_rectangle(1.5, 30.0)};
        java.util.Arrays.sort(rectangles);
        for (rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}
