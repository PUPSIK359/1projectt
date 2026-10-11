package LAB2.t5;

public class Budka {
    public static void main (String [] args){
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog(5,"Шарик" );
        dogs[1] = new Dog(2,"Бобик");
        dogs[2] = new Dog(8,"Рекс");

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i] + ", человеческий возраст: " + dogs[i].getHumanAge());
        }
    }
}
