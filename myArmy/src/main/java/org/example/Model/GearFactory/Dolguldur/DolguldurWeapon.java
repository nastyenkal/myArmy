package org.example.Model.GearFactory.Dolguldur;

import org.example.Model.GearFactory.Weapon;
import org.example.Model.GearFactory.WeaponType;

import static org.example.Model.GearFactory.WeaponType.SPEAR;

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
