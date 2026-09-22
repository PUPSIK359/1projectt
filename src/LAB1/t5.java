package LAB1;

// Задание 5: вывод аргументов командной строки в цикле for.
// Аргументы задаются в IDEA: Run -> Edit Configurations -> Program arguments.
public class t5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы не переданы. Задайте их в Run -> Edit Configurations.");
            return;
        }

        System.out.println("Количество аргументов: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}