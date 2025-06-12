package org.example.Model.Orc;

public enum OrcType {
    BASIC("Обычный"),
    LEADER("Командир"),
    SCOUTE("Разведчик");

    private String typeName;

    OrcType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

}
