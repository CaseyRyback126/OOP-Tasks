package Zoo.Animals;

import Zoo.Flyable;
import Zoo.Herbivores;

public class Butterfly extends Herbivores implements Flyable {
    public Butterfly(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfFly() {
        return 10;
    }

    public String toString() {
        return "I'm butterfly. " + super.toString()
                + ". My speed of fly is " + speedOfFly();
    }


    @Override
    public String say() {
        return "hhhh";
    }
}
