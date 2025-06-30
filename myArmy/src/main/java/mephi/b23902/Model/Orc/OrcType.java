package mephi.b23902.Model.Orc;

public enum OrcType {
    BASIC("Basic"),
    LEADER("Leader"),
    SCOUTE("Scoute");

    private String typeName;

    OrcType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

}
