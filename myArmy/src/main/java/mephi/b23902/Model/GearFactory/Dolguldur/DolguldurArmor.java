package mephi.b23902.Model.GearFactory.Dolguldur;

import mephi.b23902.Model.GearFactory.Armor;
import mephi.b23902.Model.GearFactory.ArmorType;

import static mephi.b23902.Model.GearFactory.ArmorType.*;

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
