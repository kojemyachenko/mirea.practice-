package Testing_group;

import Exercise_1_3.comparable_circle;
import Exercise_1_3.geometric_object;
import Exercise_1_3.rectangle;

public class testing_comparable_circle {
    public static void main(String[] args) {

        comparable_circle comparable_Circle_uno = new comparable_circle(3.0);
        comparable_circle comparable_Circle_dos = new comparable_circle(4.2);

        geometric_object largest_Comparable_Circle = geometric_object.max(comparable_Circle_uno, comparable_Circle_dos);
        System.out.println("Наибольший из двух кругов Exercise1_2_3.comparable_circle: " + largest_Comparable_Circle);

        comparable_circle circle = new comparable_circle(8.0);
        rectangle rectangle = new rectangle(5.0, 7.0);

        geometric_object largest_Shape = geometric_object.max(circle, rectangle);
        System.out.println("Наибольший объект между кругом и прямоугольником: " + largest_Shape);
    }
}
