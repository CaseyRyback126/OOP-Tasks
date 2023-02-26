package Game.Shields;

public abstract class Shield {
    private final int defence;

    private final double absorption;

    public Shield(int defence, double absorption) {
        this.defence = defence;
        this.absorption = absorption;
    }

    public int getDefence() {
        return defence;
    }

    public double getAbsorption() {
        return absorption;
    }

    @Override
    public String toString() {
        return String.format(" щит: %d.", defence);
    }
}
