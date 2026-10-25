package block2.LAB10.t2;

import block2.LAB10.t1.Student;

import java.util.Arrays;
import java.util.Comparator;


public class SortingStudentsByGPA implements Comparator<Student> {

    private Student[] iDNumber;


    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }

    public static class LastNameComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            int result = a.getLastName().compareTo(b.getLastName());
            if (result != 0) {
                return result;
            }
            return a.getFirstName().compareTo(b.getFirstName());
        }
    }

    public void setArray() {
        iDNumber = new Student[] {
                new Student(305, "Иван", "Петров", "Информатика", 2, "КВБО-12-25", 4.3),
                new Student(101, "Анна", "Смирнова", "Информатика", 2, "КВБО-12-25", 4.8),
                new Student(220, "Олег", "Иванов", "Математика", 3, "КМБО-01-24", 3.9),
                new Student(150, "Мария", "Кузнецова", "Физика", 1, "КФБО-02-26", 4.5),
                new Student(78, "Павел", "Сидоров", "Информатика", 4, "КВБО-05-23", 4.0),
                new Student(412, "Елена", "Белова", "Математика", 2, "КМБО-03-25", 4.6)
        };
    }

    public void quicksort() {
        quickSort(iDNumber, 0, iDNumber.length - 1, this);
    }

    public void mergeSort() {
        mergeSort(iDNumber, this);
    }

    public void sortByLastName() {
        mergeSort(iDNumber, new LastNameComparator());
    }

    public void outArray() {
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }
    }

    public static void quickSort(Student[] a, int low, int high, Comparator<Student> cmp) {
        if (low >= high) {
            return;
        }
        Student pivot = a[(low + high) / 2];
        int i = low;
        int j = high;
        while (i <= j) {
            while (cmp.compare(a[i], pivot) < 0) {
                i++;
            }
            while (cmp.compare(a[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(a, low, j, cmp);
        quickSort(a, i, high, cmp);
    }

    public static void mergeSort(Student[] a, Comparator<Student> cmp) {
        if (a.length < 2) {
            return;
        }
        int mid = a.length / 2;
        Student[] left = Arrays.copyOfRange(a, 0, mid);
        Student[] right = Arrays.copyOfRange(a, mid, a.length);
        mergeSort(left, cmp);
        mergeSort(right, cmp);
        Student[] merged = merge(left, right, cmp);
        for (int i = 0; i < a.length; i++) {
            a[i] = merged[i];
        }
    }

    public static Student[] merge(Student[] left, Student[] right, Comparator<Student> cmp) {
        Student[] result = new Student[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (cmp.compare(left[i], right[j]) <= 0) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        SortingStudentsByGPA tester = new SortingStudentsByGPA();

        tester.setArray();
        System.out.println("Исходный массив:");
        tester.outArray();

        tester.quicksort();
        System.out.println("\nБыстрая сортировка по баллу (по убыванию):");
        tester.outArray();

        tester.setArray();
        tester.mergeSort();
        System.out.println("\nСортировка слиянием по баллу (по убыванию):");
        tester.outArray();

        tester.sortByLastName();
        System.out.println("\nСортировка по фамилии:");
        tester.outArray();
    }
}
