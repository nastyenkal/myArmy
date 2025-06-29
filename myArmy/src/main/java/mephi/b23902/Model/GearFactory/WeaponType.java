package mephi.b23902.Model.GearFactory;

public enum WeaponType {
    SWORD("Мечь"),
    AXE("Топор"),
    SPEAR("Копье"),
    BOW("Лук");

    private String weaponName;

    WeaponType(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeapon() {
        return weaponName;
    }
}

