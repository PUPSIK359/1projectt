package block2.LAB13.t6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordChain {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла со словами:");
        String fileName = sc.nextLine().trim();

        String text = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        String[] words = text.trim().split("\\s+");

        StringBuilder result = getLine(words);
        if (result.length() == 0) {
            System.out.println("Цепочку из всех слов составить нельзя");
        } else {
            System.out.println(result);
        }
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        if (words == null || words.length == 0 || words[0].isEmpty()) {
            return sb;
        }
        boolean[] used = new boolean[words.length];
        String[] order = new String[words.length];

        for (int start = 0; start < words.length; start++) {
            used[start] = true;
            order[0] = words[start];
            if (build(words, used, order, 1)) {
                for (int i = 0; i < order.length; i++) {
                    if (i > 0) {
                        sb.append(' ');
                    }
                    sb.append(order[i]);
                }
                return sb;
            }
            used[start] = false;
        }
        return sb;
    }

    private static boolean build(String[] words, boolean[] used, String[] order, int pos) {
        if (pos == words.length) {
            return true;
        }
        String previous = order[pos - 1];
        char last = Character.toLowerCase(previous.charAt(previous.length() - 1));

        for (int i = 0; i < words.length; i++) {
            if (!used[i] && Character.toLowerCase(words[i].charAt(0)) == last) {
                used[i] = true;
                order[pos] = words[i];
                if (build(words, used, order, pos + 1)) {
                    return true;
                }
                used[i] = false;
            }
        }
        return false;
    }
}
