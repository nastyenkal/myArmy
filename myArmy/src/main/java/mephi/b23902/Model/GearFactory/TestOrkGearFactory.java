package mephi.b23902.Model.GearFactory;

import mephi.b23902.Model.GearFactory.Mordor.MordorGearFactory;

public class TestOrkGearFactory {
    public static void main(String[] args) {
        OrcGearFactory factory = new MordorGearFactory();
        //OrcGearFactory factory = new DolguldurGearFactory();
        //OrcGearFactory factory = new MistyMountsGearFactory();

        System.out.println(factory.getClass());
        System.out.println(factory.createArmor());
        System.out.println(factory.createBanner());
        System.out.println(factory.createWeapon());

        Weapon orcWeapon = factory.createWeapon();
        orcWeapon.setWeapon(WeaponType.BOW);
        System.out.println(orcWeapon.getWeapon());

    }
}
