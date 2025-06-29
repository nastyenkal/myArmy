package mephi.b23902.Model.GearFactory.MistyMounts;

import mephi.b23902.Model.GearFactory.Armor;
import mephi.b23902.Model.GearFactory.ArmorType;

import static mephi.b23902.Model.GearFactory.ArmorType.*;

public class MistyMountsArmor implements Armor {
    ArmorType armor;

    public MistyMountsArmor() {
        armor = LEATHER_ARMOR;
    }

    @Override
    public String toString() {
        return armor.getArmor();
    }
}
