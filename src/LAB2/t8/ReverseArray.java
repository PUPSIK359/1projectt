package LAB2.t8;

public class ReverseArray {
    public static void reverse(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] words = {"один", "два", "три", "четыре", "пять"};

        System.out.println("До:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        reverse(words);

        System.out.println("После:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
