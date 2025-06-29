package mephi.b23902.Model.GearFactory.Dolguldur;

import mephi.b23902.Model.GearFactory.Armor;
import mephi.b23902.Model.GearFactory.Banner;
import mephi.b23902.Model.GearFactory.OrcGearFactory;
import mephi.b23902.Model.GearFactory.Weapon;

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

