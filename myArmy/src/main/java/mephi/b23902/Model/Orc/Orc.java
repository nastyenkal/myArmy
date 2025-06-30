package mephi.b23902.Model.Orc;

import mephi.b23902.Model.GearFactory.Armor;
import mephi.b23902.Model.GearFactory.Banner;
import mephi.b23902.Model.GearFactory.Weapon;

public class Orc {
    private final OrcRace race;
    private final OrcType type;
    private final String name;
    private final Weapon weapon;
    private final Armor armor;
    private final Banner banner;
    private final int power;
    private final int agility;
    private final int intelligence;
    private final int health;
    private final boolean hasWeapon;
    private final boolean hasArmor;
    private final boolean hasBanner;

    public Orc(OrcRace race, OrcType type, String name,
               Weapon weapon, Armor armor, Banner banner,
               int power, int agility, int intelligence, int health,
               boolean hasWeapon, boolean hasArmor, boolean hasBanner) {
        this.race = race;
        this.type = type;
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.banner = banner;
        this.power = power;
        this.agility = agility;
        this.intelligence = intelligence;
        this.health = health;
        this.hasWeapon = hasWeapon;
        this.hasArmor = hasArmor;
        this.hasBanner = hasBanner;
    }

    public OrcRace getRace() { return race; } 
    public OrcType getType() { return type; }
    public String getName() { return name; }
    public Weapon getWeapon() { return weapon; }
    public Armor getArmor() { return armor; }
    public Banner getBanner() { return banner; }
    public int getPower() { return power; }
    public int getAgility() { return agility; }
    public int getIntelligence() { return intelligence; }
    public int getHealth() { return health; }
    public boolean hasWeapon() { return hasWeapon; }
    public boolean hasArmor() { return hasArmor; }
    public boolean hasBanner() { return hasBanner; }
    
    @Override
public String toString() {
    return name + " (" + type.getTypeName() + ")";
}
}