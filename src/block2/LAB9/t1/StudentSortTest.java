package block2.LAB9.t1;

import block2.LAB10.t1.Student;

public class StudentSortTest {
    public static void main(String[] args) {

        Student[] iDNumber = {
                new Student(305, "Иван", "Петров", "Информатика", 2, "КВБО-12-25", 4.3),
                new Student(101, "Анна", "Смирнова", "Информатика", 2, "КВБО-12-25", 4.8),
                new Student(220, "Олег", "Иванов", "Математика", 3, "КМБО-01-24", 3.9),
                new Student(150, "Мария", "Кузнецова", "Физика", 1, "КФБО-02-26", 4.5),
                new Student(78, "Павел", "Сидоров", "Информатика", 4, "КВБО-05-23", 4.0)
        };

        System.out.println("До сортировки:");
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }

        Sorting.insertionSort(iDNumber);

        System.out.println("\nПосле сортировки вставками по idNumber:");
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }
    }
}
