package block2.LAB9.t1;

public class Sorting {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            while (position > 0 && list[position - 1].compareTo(key) > 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}
