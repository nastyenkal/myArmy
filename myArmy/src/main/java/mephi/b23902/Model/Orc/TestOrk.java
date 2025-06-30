package mephi.b23902.Model.Orc;

import mephi.b23902.Model.GearFactory.Dolguldur.DolguldurGearFactory;
import mephi.b23902.Model.GearFactory.OrcGearFactory;
import mephi.b23902.Model.OrcModel;

import static mephi.b23902.Model.Orc.OrcType.*;

public class TestOrk {
    public static void main(String[] args) {
        //OrcBuilder builder = new MordorOrcBuilder();
        //OrcBuilder builder = new MistyMountsOrcBuilder();
        OrcBuilder builder = new DolguldurOrcBuilder();
        OrcGearFactory gearFactory = new DolguldurGearFactory();

        OrcModel exmplArmy = new OrcModel();

        Orc orc1;
        Orc orc2;
        Orc orc3;

        for (int i = 0; i < 10; i++) {
            orc1 = builder.buildType(BASIC)
                    .buildGearFactory(gearFactory)
                    .buildName(null)
                    .buildWeapon()
                    .buildArmor()
                    .buildBanner()
                    .buildHealth()
                    .buildPower()
                    .buildAgility()
                    .buildIntelligence()
                    .createNewOrc();

            orc2 = builder.buildType(SCOUTE)
                    .buildGearFactory(gearFactory)
                    .buildName(null)
                    .buildWeapon()
                    .buildArmor()
                    .buildBanner()
                    .buildHealth()
                    .buildPower()
                    .buildAgility()
                    .buildIntelligence()
                    .createNewOrc();

            orc3 = builder.buildType(LEADER)
                    .buildGearFactory(gearFactory)
                    .buildName(null)
                    .buildWeapon()
                    .buildArmor()
                    .buildBanner()
                    .buildHealth()
                    .buildPower()
                    .buildAgility()
                    .buildIntelligence()
                    .createNewOrc();

            exmplArmy.addOrc(orc1);
            exmplArmy.addOrc(orc2);
            exmplArmy.addOrc(orc3);
        }

        System.out.println("Race : " + exmplArmy.getOrcArmyByRace(OrcRace.DOLGULDUR_ORC).get(0).getRace());
        System.out.println("All Army : " + exmplArmy.getOrcArmy());
        System.out.println("Army by Race : " + exmplArmy.getOrcArmyByRace(OrcRace.DOLGULDUR_ORC));
        System.out.println("Army by Type : " + exmplArmy.getOrcArmyByType(BASIC));
        System.out.println("Army by Type : " + exmplArmy.getOrcArmyByType(LEADER));
        System.out.println("Army by Type : " + exmplArmy.getOrcArmyByType(SCOUTE));
    }
}