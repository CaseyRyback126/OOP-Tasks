package Zoo.Animals;

import Zoo.Predator;
import Zoo.Swimable;

public class Shark extends Predator implements Swimable {

    public Shark(String nickname) {
        super(nickname);
    }

    @Override
    public int speedOfSwim() {
        return 55;
    }
    public String toString() {
        return "I'm shark. " + super.toString() + ". My speed of swim is " + speedOfSwim();
    }

    @Override
    public String say() {
        return "Tasty legs";
    }
}
