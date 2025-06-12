package org.example.Model.GearFactory.MistyMounts;

import org.example.Model.GearFactory.Armor;
import org.example.Model.GearFactory.Banner;
import org.example.Model.GearFactory.OrcGearFactory;
import org.example.Model.GearFactory.Weapon;

public class MistyMountsGearFactory implements OrcGearFactory {

    @Override
    public Weapon createWeapon() {
        return new MistyMountsWeapon();
    }

    @Override
    public Armor createArmor() {
        return new MistyMountsArmor();
    }

    @Override
    public Banner createBanner() {
        return new MistyMountsBanner();
    }
}

