package org.example.Model.GearFactory.Mordor;

import org.example.Model.GearFactory.Weapon;
import org.example.Model.GearFactory.WeaponType;

import static org.example.Model.GearFactory.WeaponType.*;

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
