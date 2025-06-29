package mephi.b23902.Model.GearFactory.Mordor;

import mephi.b23902.Model.GearFactory.Armor;
import mephi.b23902.Model.GearFactory.ArmorType;

import static mephi.b23902.Model.GearFactory.ArmorType.*;

public class MordorArmor implements Armor {
    ArmorType armor;

    public MordorArmor() {
        armor = STEEL_ARMOR;
    }

    @Override
    public String toString() {
        return armor.getArmor();
    }
}
