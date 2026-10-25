package block2.LAB13.t2;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Person(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    private static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public String getShortName() {
        StringBuilder sb = new StringBuilder(lastName);
        boolean hasFirst = !isEmpty(firstName);
        boolean hasPatronymic = !isEmpty(patronymic);

        if (hasFirst) {
            sb.append(' ').append(firstName.charAt(0)).append('.');
        }
        if (hasPatronymic) {
            if (!hasFirst) {
                sb.append(' ');
            }
            sb.append(patronymic.charAt(0)).append('.');
        }
        return sb.toString();
    }
}
