package org.example.Model.GearFactory.MistyMounts;

import org.example.Model.GearFactory.Weapon;
import org.example.Model.GearFactory.WeaponType;
import static org.example.Model.GearFactory.WeaponType.*;

public class MistyMountsWeapon implements Weapon {
    WeaponType weapon;

    public MistyMountsWeapon() {
        setWeapon(AXE);
    }

    @Override
    public String toString() {
        return weapon.getWeapon();
    }

    @Override
    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    @Override
    public WeaponType getWeapon() {
        return weapon;
    }
}
