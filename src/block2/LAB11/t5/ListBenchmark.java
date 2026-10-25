package block2.LAB11.t5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListBenchmark {

    static final int N = 100_000;
    static final int OPS = 5_000;


    static long testAdd(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }


    static long testInsert(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < OPS; i++) {
            list.add(list.size() / 2, i);
        }
        return System.nanoTime() - start;
    }


    static long testSearch(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            list.contains(-1);
        }
        return System.nanoTime() - start;
    }


    static long testRemove(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < OPS; i++) {
            list.remove(list.size() / 2);
        }
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.printf("%-30s %12s %12s%n", "Операция", "ArrayList", "LinkedList");
        System.out.printf("%-30s %10d мкс %10d мкс%n", "Добавление в конец (" + N + ")",
                testAdd(arrayList) / 1000, testAdd(linkedList) / 1000);
        System.out.printf("%-30s %10d мкс %10d мкс%n", "Вставка в середину (" + OPS + ")",
                testInsert(arrayList) / 1000, testInsert(linkedList) / 1000);
        System.out.printf("%-30s %10d мкс %10d мкс%n", "Поиск contains (100 раз)",
                testSearch(arrayList) / 1000, testSearch(linkedList) / 1000);
        System.out.printf("%-30s %10d мкс %10d мкс%n", "Удаление из середины (" + OPS + ")",
                testRemove(arrayList) / 1000, testRemove(linkedList) / 1000);
    }
}
