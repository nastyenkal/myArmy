package mephi.b23902.Model;

import mephi.b23902.Model.Orc.Orc;
import mephi.b23902.Model.Orc.OrcRace;
import mephi.b23902.Model.Orc.OrcType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrcModel {
    private List<Orc> orcArmy;
    private String[] orcRace;
    private String[] orcType;

    public OrcModel() {
        orcArmy = new ArrayList<>();

        orcRace = new String[OrcRace.values().length];
        for (OrcRace race : OrcRace.values()) {
            orcRace[race.ordinal()] = race.name();
        }

        orcType = new String[OrcType.values().length];
        for (OrcType type : OrcType.values()) {
            orcType[type.ordinal()] = type.name();
        }
    }

    public void addOrc(Orc orc) {
        orcArmy.add(orc);
    }

    public List<Orc> getOrcArmy() {
        return orcArmy;
    }

    public List<Orc> getOrcArmyByType(OrcType type) {
        return orcArmy.stream().filter(o -> o.getType() == type).collect(Collectors.toList());
    }

    public List<Orc> getOrcArmyByRace(OrcRace race) {
        return orcArmy.stream().filter(o -> o.getRace() == race).collect(Collectors.toList());
    }

    public String[] getOrcRace() {
        return orcRace;
    }

    public String[] getOrcType() {
        return orcType;
    }

}
