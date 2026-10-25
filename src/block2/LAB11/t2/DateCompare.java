package block2.LAB11.t2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату и время в формате дд.мм.гггг чч:мм");
        String line = sc.nextLine().trim();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        format.setLenient(false);

        try {
            Date entered = format.parse(line);
            Date now = new Date();

            System.out.println("Введённая дата: " + format.format(entered));
            System.out.println("Текущая дата:   " + format.format(now));

            if (entered.before(now)) {
                System.out.println("Введённая дата РАНЬШЕ текущей");
            } else if (entered.after(now)) {
                System.out.println("Введённая дата ПОЗЖЕ текущей");
            } else {
                System.out.println("Даты совпадают");
            }

            long millisInDay = 24L * 60 * 60 * 1000;
            long days = Math.abs(entered.getTime() - now.getTime()) / millisInDay;
            System.out.println("Разница: " + days + " дн.");
        } catch (ParseException e) {
            System.out.println("Неверный формат или несуществующая дата");
        }
    }
}
