package Ex_14;

import java.util.Scanner;

public class test_digitPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Цифры числа слева направо:");
            digitPrinter printer = new digitPrinter();
            printer.printDigits(number);
        } else {
            System.out.println("Введите корректное натуральное число.");
        }

        scanner.close();
    }
}

