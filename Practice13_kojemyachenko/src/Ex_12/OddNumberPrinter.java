package Ex_12;

import java.util.Scanner;

public class OddNumberPrinter {

    public void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Здравствуйте! Введите последовательность натуральных чисел (введите 0 для завершения):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
        System.out.println("Спасибо за использование программы!");
        scanner.close();
    }
}










