package org.example.Model.GearFactory.Dolguldur;

import org.example.Model.GearFactory.Armor;
import org.example.Model.GearFactory.Banner;
import org.example.Model.GearFactory.OrcGearFactory;
import org.example.Model.GearFactory.Weapon;

public class DolguldurGearFactory implements OrcGearFactory {

    @Override
    public Weapon createWeapon() {
        return new DolguldurWeapon();
    }

    @Override
    public Armor createArmor() {
        return new DolguldurArmor();
    }

    @Override
    public Banner createBanner() {
        return new DolguldurBanner();
    }
}

