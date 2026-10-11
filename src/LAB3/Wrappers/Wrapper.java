package LAB3.Wrappers;

public class Wrapper {
    public static void main(String[] args) {
        // 1 объект Double через valueOf()
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.718");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        // 2 Преобразовать значение типа String к типу double. Используем
        //метод Double.parseDouble().
        double fromString = Double.parseDouble("5.5");
        System.out.println("parseDouble(\"5.5\") = " + fromString);

        // 3 Преобразовать объект класса Double ко всем примитивным типам.
        Double d = Double.valueOf(123.987);
        byte b = d.byteValue();
        short s = d.shortValue();
        int i = d.intValue();
        long l = d.longValue();
        float f = d.floatValue();
        double dd = d.doubleValue();
        System.out.println("byte   = " + b);
        System.out.println("short  = " + s);
        System.out.println("int    = " + i);
        System.out.println("long   = " + l);
        System.out.println("float  = " + f);
        System.out.println("double = " + dd);

        // 4 Вывести значение объекта Double на консоль.
        System.out.println("Значение объекта d: " + d);

        // 5 Преобразовать литерал типа double к строке: String d =
        //Double.toString(3.14);
        String str = Double.toString(3.14);
        System.out.println("Строка: " + str);
    }
}