package Testing_group;

import Exercise_1_2_3.*;

public class testing_colorable {
    public static void main(String[] args) {
        geometric_object[] objects = {
                new circle(6.0),
                new rectangle(5.0, 8.0),
                new square(3.5),
                new comparable_rectangle(6.0, 7.0),
                new square(8.0)
        };

        for (geometric_object obj : objects) {
            System.out.println(obj);
            System.out.println("Площадь: " + obj.getArea());

            if (obj instanceof colorable) {
                ((colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}
