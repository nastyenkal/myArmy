package mephi.b23902.Model.GearFactory.MistyMounts;

import mephi.b23902.Model.GearFactory.Armor;
import mephi.b23902.Model.GearFactory.Banner;
import mephi.b23902.Model.GearFactory.OrcGearFactory;
import mephi.b23902.Model.GearFactory.Weapon;

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

