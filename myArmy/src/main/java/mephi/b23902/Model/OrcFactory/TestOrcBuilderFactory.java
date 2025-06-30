package mephi.b23902.Model.OrcFactory;

import mephi.b23902.Model.Orc.Orc;
import mephi.b23902.Model.Orc.OrcRace;

public class TestOrcBuilderFactory {
    public static void main(String[] args) {
        //OrcDirector director1 = new OrcDirector(OrcRace.MORDOR_ORC);
        //OrcDirector director1 = new OrcDirector(OrcRace.MISTYMOUNTS_ORC);
        OrcDirector director1 = new OrcDirector(OrcRace.DOLGULDUR_ORC);

        Orc orc1 = director1.createBasicOrc(null);
        Orc orc2 = director1.createScoutOrc(null); // исправлено reate -> create
        Orc orc3 = director1.createLeaderOrc(null);

        System.out.println("Basic Orc: " + orc1);
        System.out.println("Scout Orc: " + orc2);
        System.out.println("Leader Orc: " + orc3);
        
        printOrcDetails(orc1);
        printOrcDetails(orc2);
        printOrcDetails(orc3);
    }

    private static void printOrcDetails(Orc orc) {
        System.out.println("\nDetailed info:");
        System.out.println("Name: " + orc.getName());
        System.out.println("Race: " + orc.getRace());
        System.out.println("Type: " + orc.getType());
        System.out.println("Weapon: " + orc.getWeapon());
        System.out.println("Armor: " + orc.getArmor());
        System.out.println("Banner: " + (orc.hasBanner() ? orc.getBanner() : "None"));
        System.out.println("Power: " + orc.getPower());
        System.out.println("Agility: " + orc.getAgility());
        System.out.println("Intelligence: " + orc.getIntelligence());
        System.out.println("Health: " + orc.getHealth());
    }
}