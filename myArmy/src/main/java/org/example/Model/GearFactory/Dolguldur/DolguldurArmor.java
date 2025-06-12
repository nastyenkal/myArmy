package org.example.Model.GearFactory.Dolguldur;

import org.example.Model.GearFactory.Armor;
import org.example.Model.GearFactory.ArmorType;

import static org.example.Model.GearFactory.ArmorType.*;

public class DolguldurArmor implements Armor {
    ArmorType armor;

    public DolguldurArmor() {
        armor = CHAINMAIL;
    }

    @Override
    public String toString() {
        return armor.getArmor();
    }
}
