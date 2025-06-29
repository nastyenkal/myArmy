package mephi.b23902.Model.GearFactory;

public enum ArmorType {
    STEEL_ARMOR ("Стальная броня"),
    CHAINMAIL( "Кольчуга"),
    LEATHER_ARMOR ("Кожаная броня"),;

    private String armorName;

    ArmorType(String armorName) {
        this.armorName = armorName;
    }

    public String getArmor() {
        return armorName;
    }


}
