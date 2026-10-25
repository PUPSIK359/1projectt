package block2.LAB11.t3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("Иван", "Иванов", "КВБО-12-25",
                new GregorianCalendar(2007, Calendar.MARCH, 15).getTime());

        System.out.println(s);
        System.out.println("Короткий: " + s.getBirthDateString("short"));
        System.out.println("Средний:  " + s.getBirthDateString("medium"));
        System.out.println("Длинный:  " + s.getBirthDateString("long"));
        System.out.println("Полный:   " + s.getBirthDateString("full"));
    }
}
