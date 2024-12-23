package exercise_8;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>();

        Collections.addAll(listOfWords, "RED","ORANGE","RED","YELLOW","GREEN");

        System.out.println("Before Sort: " + listOfWords);
        sort(listOfWords);
        System.out.println("After Sort: " + listOfWords);
    }
}
