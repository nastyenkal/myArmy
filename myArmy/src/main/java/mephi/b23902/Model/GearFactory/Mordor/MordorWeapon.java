package mephi.b23902.Model.GearFactory.Mordor;

import mephi.b23902.Model.GearFactory.Weapon;
import mephi.b23902.Model.GearFactory.WeaponType;

import static mephi.b23902.Model.GearFactory.WeaponType.*;

public class MordorWeapon implements Weapon {
    WeaponType weapon;

    public MordorWeapon() {
        setWeapon(SWORD);
    }

    @Override
    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return weapon.getWeapon();
    }

    @Override
    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
