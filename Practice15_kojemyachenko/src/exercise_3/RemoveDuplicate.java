package exercise_3;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicate {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();

        list.stream().filter(
                (item)->!result.contains(item)
        ).forEach(result::add);

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> listOfColors = new ArrayList<>();

        Collections.addAll(listOfColors,"RED","ORANGE","YELLOW","GREEN","BLUE");

        System.out.println("Original List: " + listOfColors);
        ArrayList<String> uniqueList = removeDuplicates(listOfColors);
        System.out.println("List without duplicates: " + uniqueList);
    }
}