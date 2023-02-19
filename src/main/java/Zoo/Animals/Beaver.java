package Zoo.Animals;

import Zoo.Herbivores;
import Zoo.Runable;
import Zoo.Swimable;

public class Beaver extends Herbivores implements Swimable, Runable {
    public Beaver(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "Tasty wood";
    }

    public String toString() {
        return "I'm beaver. " + super.toString()
                + ". My speed of run is " + speedOfRun()
                + ". My speed of swim is " + speedOfSwim();

    }

    @Override
    public int speedOfSwim() {
        return 40;
    }

    @Override
    public int speedOfRun() {
        return 25;
    }
}
