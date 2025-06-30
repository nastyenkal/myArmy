package mephi.b23902.Model.Orc;

import com.github.javafaker.Faker;
import mephi.b23902.Model.GearFactory.Armor;
import mephi.b23902.Model.GearFactory.Banner;
import mephi.b23902.Model.GearFactory.OrcGearFactory;
import mephi.b23902.Model.GearFactory.Weapon;
import mephi.b23902.Model.GearFactory.WeaponType;

import static mephi.b23902.Model.Orc.OrcType.*;

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
    protected boolean hasWeapon;
    protected boolean hasArmor;
    protected boolean hasBanner;
    protected OrcGearFactory gearFactory;

    public OrcBuilder buildType(OrcType type) {
        this.type = type;
        return this;
    }

    public OrcBuilder buildName(String name) {
        this.name = (name == null || name.isEmpty()) 
            ? new Faker().lordOfTheRings().character() 
            : name;
        return this;
    }

    public OrcBuilder buildWeapon() {
        this.weapon = gearFactory.createWeapon();
        this.hasWeapon = (this.weapon != null);
        
        if (this.type == SCOUTE) {
            this.weapon.setWeapon(WeaponType.BOW);
        }
        return this;
    }

    public OrcBuilder buildArmor() {
        this.armor = gearFactory.createArmor();
        this.hasArmor = (this.armor != null);
        return this;
    }

    public OrcBuilder buildBanner() {
        if (this.type == LEADER) {
            this.banner = gearFactory.createBanner();
            this.hasBanner = (this.banner != null);
        } else {
            this.banner = null;
            this.hasBanner = false;
        }
        return this;
    }

    public abstract OrcBuilder buildPower();
    public abstract OrcBuilder buildAgility();
    public abstract OrcBuilder buildIntelligence();
    public abstract OrcBuilder buildHealth();

    public OrcBuilder buildGearFactory(OrcGearFactory gearFactory) {
        this.gearFactory = gearFactory;
        return this;
    }

    public Orc createNewOrc() {
        if (!hasWeapon) {
            throw new IllegalStateException("Каждый орк должен иметь оружие");
        }
        if (!hasArmor) {
            throw new IllegalStateException("Каждый орк должен иметь броню");
        }
        
        return new Orc(
            race, 
            type, 
            name, 
            weapon, 
            armor, 
            banner,
            power, 
            agility, 
            intelligence, 
            health,
            hasWeapon,
            hasArmor,
            hasBanner
        );
    }
}