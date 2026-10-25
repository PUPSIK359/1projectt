package block1.LAB4.t1;

public class SeasonDemo {

    public static void sayAboutSeason(Season s) {
        switch (s) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {

        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite);
        System.out.println("Порядковый номер: " + favorite.ordinal());
        System.out.println("Средняя температура: " + favorite.getAvgTemp());
        System.out.println("Описание: " + favorite.getDescription());

        sayAboutSeason(favorite);


        System.out.println("\nВсе времена года:");
        for (Season s : Season.values()) {
            System.out.println(s + ", средняя температура " + s.getAvgTemp()
                    + ", " + s.getDescription());
        }
    }
}
