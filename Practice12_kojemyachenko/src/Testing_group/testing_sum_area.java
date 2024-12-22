package Testing_group;

import Exercise_4_6.circle;
import Exercise_4_6.geometric_object;
import Exercise_4_6.rectangle;

public class testing_sum_area {
    public static void main(String[] args) {

        geometric_object[] objects = {
                new circle(5.0),
                new circle(3.0),
                new rectangle(1.5, 4.0),
                new rectangle(4.0, 9.0)
        };

        double totalArea = sumArea(objects);

        System.out.println("Общая площадь всех объектов составляет: " + totalArea);
    }

    public static double sumArea(geometric_object[] a) {
        double totalArea = 0;
        for (geometric_object obj : a) {
            totalArea += obj.getArea();
        }
        return totalArea;
    }
}
