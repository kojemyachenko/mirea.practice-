package exercise_5;

import exercise_5.factory.AbstractFactory;
import exercise_5.factory.CircleFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxElement {

    private static AbstractFactory abstractFactory = new CircleFactory();

    public static <E extends Comparable<E>> E findMaxElement(List<E> array) {
        if (array == null || array.size() == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        E max = array.get(0);
        for (E element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Circle> circles = new ArrayList();
        Collections.addAll(circles,abstractFactory.createCircle(1.5),
                abstractFactory.createCircle(2.5),abstractFactory.createCircle(3.5));

        Circle maxCircle = findMaxElement(circles);
        System.out.println("Circle with the largest radius: " + maxCircle);
    }
}
