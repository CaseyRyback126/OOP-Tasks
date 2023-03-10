package Zoo.Animals;

import Zoo.Herbivores;
import Zoo.Runable;

public class Cow extends Herbivores implements Runable {
    public Cow(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm cow. " + super.toString()
                + ". My speed of run is " + speedOfRun();
    }
    public String say(){
        return "Mu-mu";
    }

    @Override
    public int speedOfRun() {
        return 5;
    }
}