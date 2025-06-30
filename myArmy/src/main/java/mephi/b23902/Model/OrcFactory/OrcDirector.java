package mephi.b23902.Model.OrcFactory;

import mephi.b23902.Model.Orc.Orc;
import mephi.b23902.Model.Orc.OrcBuilder;
import mephi.b23902.Model.Orc.OrcRace;

import static mephi.b23902.Model.Orc.OrcType.*;

public class OrcDirector {
    private OrcBuilder builder;

    public OrcDirector(OrcRace race) {
        setOrcBuilder(race);
    }

    public void setOrcBuilder(OrcRace race) {
        switch (race) {
            case MORDOR_ORC:
                builder = new MordorOrcBuilderFactory().createOrcBuilder();
                break;
            case DOLGULDUR_ORC:
                builder = new DolguldurOrcBuilderFactory().createOrcBuilder();
                break;
            case MISTYMOUNTS_ORC:
                builder = new MistyMountsOrcBuilderFactory().createOrcBuilder();
                break;
            default:
                throw new IllegalArgumentException("Unknown orc race: " + race);
        }
    }

    public Orc createBasicOrc(String orcName) {
        return builder.buildType(BASIC)
            .buildName(orcName)
            .buildWeapon()
            .buildArmor()
            .buildHealth()
            .buildPower()
            .buildAgility()
            .buildIntelligence()
            .createNewOrc();
    }

    public Orc createScoutOrc(String orcName) {
        return builder.buildType(SCOUTE)
            .buildName(orcName)
            .buildWeapon()
            .buildArmor()
            .buildHealth()
            .buildPower()
            .buildAgility()
            .buildIntelligence()
            .createNewOrc();
    }

    public Orc createLeaderOrc(String orcName) {
        return builder.buildType(LEADER)
            .buildName(orcName)
            .buildWeapon()
            .buildArmor()
            .buildBanner()
            .buildHealth()
            .buildPower()
            .buildAgility()
            .buildIntelligence()
            .createNewOrc();
    }
}