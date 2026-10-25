package block2.LAB13.t3;

public class AddressTest {
    public static void main(String[] args) {

        String[] withComma = {
                "Россия, Московская область, Москва, Ленина, 5, 2, 12",
                "  Россия ,Свердловская область,Екатеринбург , Мира,10,,45  ",
                "Беларусь, Минская область, Минск, Независимости, 7, 1, 3",
                "Россия, Татарстан, Казань, Баумана, 20, , "
        };
        System.out.println("--- split (запятая) ---");
        for (int i = 0; i < withComma.length; i++) {
            Address a = new Address();
            a.parseBySplit(withComma[i]);
            System.out.println(a);
        }

        String[] mixed = {
                "Россия; Московская область. Москва, Ленина; 5. 2, 12",
                "Россия,Самарская область;Самара.Мира;15,,7",
                "Казахстан . Алматинская область ; Алматы , Абая ; 3 . 1 , 9",
                "Россия, Омская область, Омск, Гагарина, 8, , "
        };
        System.out.println("\n--- StringTokenizer (, . ;) ---");
        for (int i = 0; i < mixed.length; i++) {
            Address a = new Address();
            a.parseByTokenizer(mixed[i]);
            System.out.println(a);
        }
    }
}
