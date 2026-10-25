package block2.LAB11.t3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private Date birthDate;

    public Student(String firstName, String lastName, String group, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getBirthDateString(String format) {
        int style;
        if (format.equalsIgnoreCase("short") || format.equalsIgnoreCase("короткий")) {
            style = DateFormat.SHORT;
        } else if (format.equalsIgnoreCase("medium") || format.equalsIgnoreCase("средний")) {
            style = DateFormat.MEDIUM;
        } else if (format.equalsIgnoreCase("long") || format.equalsIgnoreCase("длинный")) {
            style = DateFormat.LONG;
        } else if (format.equalsIgnoreCase("full") || format.equalsIgnoreCase("полный")) {
            style = DateFormat.FULL;
        } else {
            return "неизвестный формат: " + format;
        }
        return DateFormat.getDateInstance(style, Locale.forLanguageTag("ru")).format(birthDate);
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", группа " + group
                + ", дата рождения: " + getBirthDateString("medium");
    }
}
