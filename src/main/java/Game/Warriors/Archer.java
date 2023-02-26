package Game.Warriors;

import Game.Shields.LightShield;
import Game.Weapon.RangedWeapon;

public class Archer extends Warrior {
    RangedWeapon weapon;

    LightShield shield = null;

    public Archer(String name, int health, RangedWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public Archer(String name, int health, RangedWeapon weapon, LightShield shield) {
        super(name, health);
        this.weapon = weapon;
        this.shield = shield;
    }

    public RangedWeapon getWeapon() {
        return weapon;
    }

    @Override
    public LightShield getShield() {
        return shield;
    }

    @Override
    public boolean hasShield() {
        return shield != null;
    }

    public int getWeaponRange() {
        return weapon.getRange();
    }

    @Override
    public String toString() {
        return String.format("Лучник%s Оружие: %s", super.toString(), weapon) +
                (shield != null ? " " + shield : "");
    }
}
