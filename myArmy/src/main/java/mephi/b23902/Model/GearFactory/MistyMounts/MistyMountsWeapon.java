package mephi.b23902.Model.GearFactory.MistyMounts;

import mephi.b23902.Model.GearFactory.Weapon;
import mephi.b23902.Model.GearFactory.WeaponType;
import static mephi.b23902.Model.GearFactory.WeaponType.*;

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
