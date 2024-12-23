package exercise_2;

import java.util.Scanner;

public class TestGenericStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestGenericStack stack = new TestGenericStack();

        System.out.println("Введите пять строк:");

        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextLine());
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }

    private boolean pop() {
        return true;
    }

    private boolean isEmpty() {
        return true;
    }

    private void push(String s) {

    }
}
