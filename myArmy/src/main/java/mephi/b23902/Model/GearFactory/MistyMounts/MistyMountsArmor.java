package org.example.Model.GearFactory.MistyMounts;

import org.example.Model.GearFactory.Armor;
import org.example.Model.GearFactory.ArmorType;

import static org.example.Model.GearFactory.ArmorType.*;

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
