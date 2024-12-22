package Testing_group;

import Exercise_4_6.circle;
import Exercise_4_6.geometric_object;
import Exercise_4_6.rectangle;

public class testing_geometric_object {
    public static void main(String[] args) {

        geometric_object get_Object1 = new circle(5);
        geometric_object get_Object2 = new rectangle(10, 3);

        System.out.println("Одинаковая ли площадь у двух фигур? " +
                equalArea(get_Object1, get_Object2));

        displayGeometricObject(get_Object1);

        displayGeometricObject(get_Object2);
    }

    public static boolean equalArea(geometric_object object1,
                                    geometric_object object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(geometric_object object) {
        System.out.println();
        System.out.println("Площадь равна " + object.getArea());
        System.out.println("Периметр равен " + object.getPerimeter());
    }

}
