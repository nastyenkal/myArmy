package org.example.Model.GearFactory.Mordor;

import org.example.Model.GearFactory.Armor;
import org.example.Model.GearFactory.Banner;
import org.example.Model.GearFactory.OrcGearFactory;
import org.example.Model.GearFactory.Weapon;

public class MordorGearFactory implements OrcGearFactory {

    @Override
    public Weapon createWeapon() {
        return new MordorWeapon();
    }

    @Override
    public Armor createArmor() {
        return new MordorArmor();
    }

    @Override
    public Banner createBanner() {
        return new MordorBanner();
    }
}

