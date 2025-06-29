package mephi.b23902.Model.GearFactory.Dolguldur;

import mephi.b23902.Model.GearFactory.Weapon;
import mephi.b23902.Model.GearFactory.WeaponType;

import static mephi.b23902.Model.GearFactory.WeaponType.SPEAR;

public class DolguldurWeapon implements Weapon {
    WeaponType weapon;

    public DolguldurWeapon() {
        setWeapon(SPEAR);
    }

    @Override
    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    @Override
    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return weapon.getWeapon();
    }
}
