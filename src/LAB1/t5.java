package LAB1;

// зд5 вывод аргументов командной строки в цикле фор
// аргументы задаются в IDEA  Run -> Edit Configurations -> Program arguments.
public class t5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("аргументы не переданы задайте их в Run -> Edit Configurations.");
            return;
        }

        System.out.println("количество аргументов: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}