package mephi.b23902.Model.Orc;

public enum OrcRace {
    MORDOR_ORC("Мордор"),
    DOLGULDUR_ORC("Дол-Гулдур"),
    MISTYMOUNTS_ORC("Мглистые Горы");

    private String raceName;

    OrcRace(String raceName) {
        this.raceName = raceName;
    }

    public String getRaceName() {
        return raceName;
    }
}
