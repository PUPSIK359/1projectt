package block2.LAB14.t7;

import java.util.regex.Pattern;

public class PasswordCheck {

    private static final Pattern PATTERN =
            Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)\\w{8,}$");

    public static boolean isStrong(String password) {
        return PATTERN.matcher(password).matches();
    }

    public static void main(String[] args) {
        String[] tests = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007",
                "Abcdefg1",
                "abcdefgh1",
                "ABCDEFGH1",
                "Abcdefgh",
                "Abcd efg1"
        };
        for (int i = 0; i < tests.length; i++) {
            System.out.println(tests[i] + " -> " + isStrong(tests[i]));
        }
    }
}
