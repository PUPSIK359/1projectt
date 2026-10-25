package block2.LAB13.t5;

public class PhoneFormatter {

    public static String format(String phone) {
        String countryCode;
        String number;

        if (phone.matches("8\\d{10}")) {

            countryCode = "7";
            number = phone.substring(1);
        } else if (phone.matches("\\+\\d{11,13}")) {

            String digits = phone.substring(1);
            countryCode = digits.substring(0, digits.length() - 10);
            number = digits.substring(digits.length() - 10);
        } else {
            return null;
        }

        return "+" + countryCode
                + number.substring(0, 3) + "-"
                + number.substring(3, 6) + "-"
                + number.substring(6);
    }

    public static void main(String[] args) {
        String[] phones = {"+79175655655", "+104289652211", "89175655655", "12345", "+7917abc"};
        for (int i = 0; i < phones.length; i++) {
            String result = format(phones[i]);
            if (result == null) {
                System.out.println(phones[i] + " -> неверный формат");
            } else {
                System.out.println(phones[i] + " -> " + result);
            }
        }
    }
}
