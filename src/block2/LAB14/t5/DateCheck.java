package block2.LAB14.t5;

import java.util.regex.Pattern;

public class DateCheck {

    private static final String DAY_MONTH =
            "(?:31/(?:0[13578]|1[02])"
            + "|(?:29|30)/(?:0[13-9]|1[0-2])"
            + "|(?:0[1-9]|1\\d|2[0-8])/(?:0[1-9]|1[0-2]))"
            + "/(?:19|[2-9]\\d)\\d{2}";

    private static final String LEAP_FEBRUARY =
            "29/02/(?:(?:19|[2-9]\\d)(?:0[48]|[2468][048]|[13579][26])"
            + "|(?:[2468][048]|[3579][26])00)";

    private static final Pattern PATTERN = Pattern.compile("^(?:" + DAY_MONTH + "|" + LEAP_FEBRUARY + ")$");

    public static boolean check(String s) {
        return PATTERN.matcher(s).matches();
    }

    public static void main(String[] args) {
        String[] tests = {
                "29/02/2000", "30/04/2003", "01/01/2003",
                "29/02/2001", "30-04-2003", "1/1/1899",
                "29/02/1900", "29/02/2004", "31/04/2020",
                "31/12/9999", "00/01/2020", "15/13/2020"
        };
        for (int i = 0; i < tests.length; i++) {
            System.out.println(tests[i] + " -> " + check(tests[i]));
        }
    }
}
