package Testing_group;

import Exercise_1_2_3.circle;
import Exercise_1_2_3.rectangle;
import Exercise_1_2_3.geometric_object;

public class testing_geometric_object {
    public static void main(String[] args) {

        circle circle_uno = new circle(5.0);
        circle circle_dos = new circle(10.0);

        geometric_object largest_Circle = geometric_object.max(circle_uno, circle_dos);
        System.out.println("Наибольший круг: " + largest_Circle);

        rectangle rectangle_uno = new rectangle(8.0, 3.5);
        rectangle rectangle_dos = new rectangle(7.0, 5.0);

        geometric_object largestRectangle = geometric_object.max(rectangle_uno, rectangle_dos);
        System.out.println("Наибольший прямоугольник: " + largestRectangle);
    }
}
