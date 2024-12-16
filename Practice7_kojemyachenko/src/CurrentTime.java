package kojemyachenko;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentTime {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1; // Месяцы начинаются с 0
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Текущий год: " + currentYear);
        System.out.println("Текущий месяц: " + currentMonth);
        System.out.println("Текущий день: " + currentDay);

        long timestamp = 1234567898765L;
        calendar.setTimeInMillis(timestamp);

        int yearFromTimestamp = calendar.get(Calendar.YEAR);
        int monthFromTimestamp = calendar.get(Calendar.MONTH) + 1; // Месяцы начинаются с 0
        int dayFromTimestamp = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Год для " + timestamp + ": " + yearFromTimestamp);
        System.out.println("Месяц для " + timestamp + ": " + monthFromTimestamp);
        System.out.println("День для " + timestamp + ": " + dayFromTimestamp);
    }
}
