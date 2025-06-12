package org.example.Model.Orc;

import org.example.Model.GearFactory.Armor;
import org.example.Model.GearFactory.Banner;
import org.example.Model.GearFactory.Weapon;

public class Orc {
    private OrcRace race;
    private OrcType type;
    private String name = "";
    private Weapon weapon;
    private Armor armor;
    private Banner banner;
    private int power = 0;
    private int agility = 0;
    private int intelligence = 0;
    private int health = 0;
    private boolean hasHorn = false;
    private boolean hasBanner = false;

    public Orc(OrcRace race, OrcType type, String name, Weapon weapon, Armor armor, Banner banner,
               int power, int audacity, int intelligence, int health, boolean hasHorn, boolean hasBanner) {
        this.race = race;
        this.type = type;
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.banner = banner;
        this.power = power;
        this.agility = audacity;
        this.intelligence = intelligence;
        this.health = health;
        this.hasHorn = hasHorn;
        this.hasBanner = hasBanner;
    }

    public OrcRace getRace() {
        return race;
    }

    public void setRace(OrcRace race) {
        this.race = race;
    }

    public OrcType getType() {
        return type;
    }

    public void setType(OrcType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Banner getBanner() {
        return banner;
    }

    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isHasHorn() {
        return hasHorn;
    }

    public void setHasHorn(boolean hasHorn) {
        this.hasHorn = hasHorn;
    }

    public boolean isHasBanner() {
        return hasBanner;
    }

    public void setHasBanner(boolean hasBanner) {
        this.hasBanner = hasBanner;
    }

    @Override
    public String toString() {
        return "[" + type.getTypeName() + "] " + name;
    }

}
