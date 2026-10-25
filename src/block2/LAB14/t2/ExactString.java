package block2.LAB14.t2;

import java.util.regex.Pattern;

public class ExactString {

    private static final Pattern PATTERN = Pattern.compile("abcdefghijklmnopqrstuv18340");

    public static boolean check(String s) {
        return PATTERN.matcher(s).matches();
    }

    public static void main(String[] args) {
        String[] tests = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340",
                "abcdefghijklmnopqrstuv18341"
        };
        for (int i = 0; i < tests.length; i++) {
            System.out.println(tests[i] + " -> " + check(tests[i]));
        }
    }
}
