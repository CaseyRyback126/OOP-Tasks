package Zoo.Animals;

import Zoo.Flyable;
import Zoo.Herbivores;
import Zoo.Runable;
import Zoo.Swimable;

public class Duck extends Herbivores implements Flyable, Runable, Swimable {
    public Duck(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfFly() {
        return 50;
    }

    public String toString() {
        return "I'm duck. " + super.toString()
                + ". My speed of run is " + speedOfRun()
                + ". My speed of fly is " + speedOfFly()
                + ". My speed of swim is " + speedOfSwim();
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public String say() {
        return "Krya-krya";
    }

    @Override
    public int speedOfSwim() {
        return 30;
    }
}
