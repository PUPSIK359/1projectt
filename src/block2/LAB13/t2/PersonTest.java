package block2.LAB13.t2;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Иванов", "Иван", "Иванович"),
                new Person("Петрова", "Анна", null),
                new Person("Сидоров", null, "Петрович"),
                new Person("Кузнецов", "", ""),
                new Person("Смирнова", "Мария", "")
        };
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getShortName());
        }
    }
}
