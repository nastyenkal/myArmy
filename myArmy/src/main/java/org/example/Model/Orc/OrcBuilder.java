package org.example.Model.Orc;

import com.github.javafaker.Faker;
import org.example.Model.GearFactory.Armor;
import org.example.Model.GearFactory.Banner;
import org.example.Model.GearFactory.OrcGearFactory;
import org.example.Model.GearFactory.Weapon;

import static org.example.Model.GearFactory.WeaponType.BOW;
import static org.example.Model.Orc.OrcType.LEADER;
import static org.example.Model.Orc.OrcType.SCOUTE;

/** "Abstract builder" */
public abstract class OrcBuilder {
    protected OrcRace race;
    protected OrcType type;
    protected String name;
    protected Weapon weapon;
    protected Armor armor;
    protected Banner banner;
    protected int power;
    protected int agility;
    protected int intelligence;
    protected int health;
    protected boolean hasHorn = false;
    protected boolean hasBanner = false;
    protected OrcGearFactory gearFactory;

    public OrcBuilder buildType(OrcType type) {
        this.type = type;
        return this;
    }

    public OrcBuilder buildName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = new Faker().lordOfTheRings().character();
            //this.name = faker.pokemon().name();
        } else {
            this.name = name;
        }
        return this;
    }

    public OrcBuilder buildWeapon() {
        this.weapon = gearFactory.createWeapon();
        if (this.type == SCOUTE) {
            this.weapon.setWeapon(BOW);
        }
        return this;
    }

    public OrcBuilder buildArmor() {
        this.armor = gearFactory.createArmor();
        return this;
    }

    public OrcBuilder buildBanner() {
        this.banner = this.gearFactory.createBanner();
        return this;
    }


    public abstract OrcBuilder buildPower();
    public abstract OrcBuilder buildAgility();
    public abstract OrcBuilder buildIntelligence();
    public abstract OrcBuilder buildHealth();

    public OrcBuilder addHorn() {
        if (this.type == LEADER) {
            hasHorn = true;
        }
        return this;
    }

    public OrcBuilder addBanner() {
        if (this.type == LEADER) {
            hasBanner = true;
        }
        return this;
    }

    public OrcBuilder buildGearFactory(OrcGearFactory gearFactory) {
        this.gearFactory = gearFactory;
        return this;
    }

    public Orc createNewOrc() {
        return new Orc(race, type, name, weapon, armor, banner,
                power, agility, intelligence, health, hasHorn, hasBanner);
    }

}

