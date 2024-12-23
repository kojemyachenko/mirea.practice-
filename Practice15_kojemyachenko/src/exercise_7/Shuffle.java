package exercise_7;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>();

        Collections.addAll(listOfWords,"Arkadiy","Spartak","Artem","Arkadiy","Artem");

        System.out.println("Before Shuffle: " + listOfWords);
        shuffle(listOfWords);
        System.out.println("After Shuffle: " + listOfWords);
    }
}
