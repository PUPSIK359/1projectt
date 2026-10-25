package block2.LAB10.t3;

import block2.LAB10.t1.Student;
import block2.LAB10.t2.SortingStudentsByGPA;

public class MergeLists {

    static void print(String title, Student[] list) {
        System.out.println(title);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortingStudentsByGPA cmp = new SortingStudentsByGPA();

        Student[] groupA = {
                new Student(101, "Анна", "Смирнова", "Информатика", 2, "КВБО-12-25", 4.8),
                new Student(305, "Иван", "Петров", "Информатика", 2, "КВБО-12-25", 4.3),
                new Student(220, "Олег", "Иванов", "Математика", 3, "КМБО-01-24", 3.9)
        };
        Student[] groupB = {
                new Student(150, "Мария", "Кузнецова", "Физика", 1, "КФБО-02-26", 4.5),
                new Student(78, "Павел", "Сидоров", "Информатика", 4, "КВБО-05-23", 4.0),
                new Student(412, "Елена", "Белова", "Математика", 2, "КМБО-03-25", 4.6),
                new Student(500, "Дарья", "Орлова", "Физика", 1, "КФБО-02-26", 3.5)
        };

        SortingStudentsByGPA.mergeSort(groupA, cmp);
        SortingStudentsByGPA.mergeSort(groupB, cmp);
        print("Список A (отсортирован):", groupA);
        print("Список B (отсортирован):", groupB);

        Student[] all = SortingStudentsByGPA.merge(groupA, groupB, cmp);
        print("Объединённый отсортированный список:", all);
    }
}
