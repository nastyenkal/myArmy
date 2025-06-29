package mephi.b23902.Model.Orc;

public enum OrcRace {
    MORDOR_ORC("Племя Мордора"),
    DOLGULDUR_ORC("Племя Долгулдур"),
    MISTYMOUNTS_ORC("Племя Мглистые Горы");

    private String raceName;

    OrcRace(String raceName) {
        this.raceName = raceName;
    }

    public String getRaceName() {
        return raceName;
    }
}
