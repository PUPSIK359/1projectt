package block2.LAB11.t1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DeveloperInfo {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        Date received = new GregorianCalendar(2026, Calendar.SEPTEMBER, 28, 0, 0, 0).getTime();

        Date submitted = new Date();

        System.out.println("Разработчик: Старостин А.Е.");
        System.out.println("Получение задания: " + format.format(received));
        System.out.println("Сдача задания:     " + format.format(submitted));
    }
}
