package mephi.b23902.Model.GearFactory.Mordor;

import mephi.b23902.Model.GearFactory.Armor;
import mephi.b23902.Model.GearFactory.Banner;
import mephi.b23902.Model.GearFactory.OrcGearFactory;
import mephi.b23902.Model.GearFactory.Weapon;

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

