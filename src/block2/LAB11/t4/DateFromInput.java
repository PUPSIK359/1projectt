package block2.LAB11.t4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateFromInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите: год месяц число часы минуты (через пробел)");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        Calendar calendar = new GregorianCalendar();
        calendar.setLenient(false);
        calendar.clear();
        calendar.set(year, month - 1, day, hour, minute, 0);

        try {

            Date date = calendar.getTime();

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            System.out.println("Date:     " + format.format(date));
            System.out.println("Calendar: " + calendar.get(Calendar.DAY_OF_MONTH) + "."
                    + (calendar.get(Calendar.MONTH) + 1) + "." + calendar.get(Calendar.YEAR)
                    + " " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
            System.out.println("День недели (1 = воскресенье): " + calendar.get(Calendar.DAY_OF_WEEK));
        } catch (IllegalArgumentException e) {
            System.out.println("Такой даты не существует");
        }
    }
}
