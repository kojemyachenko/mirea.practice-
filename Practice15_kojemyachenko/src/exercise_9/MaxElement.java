package exercise_9;

import java.util.ArrayList;
import java.util.Collections;

public class MaxElement {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }

        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers,10,25,10,30,35);

        Integer maxNumber = max(numbers);
        System.out.println("The largest number is: " + maxNumber);
    }
}
