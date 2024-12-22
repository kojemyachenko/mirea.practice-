package Ex_14;

public class digitPrinter {

    public void printDigits(int number) {
        if (number == 0) {
            return;
        }

        printDigits(number / 10);

        System.out.print((number % 10) + " ");
    }
}

