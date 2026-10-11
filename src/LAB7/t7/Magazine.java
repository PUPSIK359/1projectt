package LAB7.t7;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'%n", name);
    }

    public static void printMagazines(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Magazine) {
                Magazine m = (Magazine) printable[i];
                System.out.println(m.getName());
            }
        }
    }
}
