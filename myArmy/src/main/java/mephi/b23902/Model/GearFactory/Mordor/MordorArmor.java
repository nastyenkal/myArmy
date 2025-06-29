package org.example.Model.GearFactory.Mordor;

import org.example.Model.GearFactory.Armor;
import org.example.Model.GearFactory.ArmorType;

import static org.example.Model.GearFactory.ArmorType.*;

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
