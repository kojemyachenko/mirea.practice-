package Ex_13;

import java.util.Scanner;

public class Odd_Position_Printer {

    public void print_Odd_Position_Numbers() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int position = 1;

        System.out.println("Здавствуйте! Введите последовательность натуральных чисел (введите 0 для завершения):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (position % 2 != 0) {
                System.out.println(number);
            }
            position++;
        }
        System.out.println("Спасибо за использование программы!");
        scanner.close();
    }
}

