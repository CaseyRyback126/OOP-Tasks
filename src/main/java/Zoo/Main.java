package Zoo;

import Zoo.Animals.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(new Cat("Barsik"),
                new Dog("Sharik"),
                new Rabbit("Whik"),
                new Cow("Murka"),
                new Duck("Krya"),
                new Butterfly("Lyuba"),
                new Shark("Travis"),
                new Beaver("Samuel")));
        for (Sayable item : zoopark.getSayAble()) {
            System.out.println(item.say());
        }
        System.out.println("---------------------------------------------");
        for (Runable item : zoopark.getRunable()) {
            System.out.println(item);
        }
        System.out.println("---------------------------------------------");
        for (Flyable item : zoopark.getFlyable()) {
            System.out.println(item);
        }

        System.out.println("---------------------------------------------");
        for (Swimable item : zoopark.getSwimable()) {
            System.out.println(item);
        }

        System.out.println("---------------------------------------------");
        System.out.println(zoopark.getWinner());

        System.out.println("---------------------------------------------");
        System.out.println(zoopark.getWinnerFly());

        System.out.println("---------------------------------------------");
        System.out.println(zoopark.getWinnerSwim());
        System.out.println("---------------------------------------------");
        for (Animal item : zoopark.getAnimals()) {
            System.out.println(item.nickname);
        }
    }
}
