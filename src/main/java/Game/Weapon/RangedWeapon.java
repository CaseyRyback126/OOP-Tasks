package Game.Weapon;

public class RangedWeapon extends Weapon{
    private final int range;
    public RangedWeapon(String name, int damage, int range) {
        super(name, damage);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("%s Дальность: %d.", super.toString(), range);
    }
}
