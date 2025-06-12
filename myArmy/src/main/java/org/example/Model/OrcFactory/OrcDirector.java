package org.example.Model.OrcFactory;

import org.example.Model.Orc.Orc;
import org.example.Model.Orc.OrcBuilder;
import org.example.Model.Orc.OrcRace;

import static org.example.Model.Orc.OrcType.*;

public class OrcDirector {
    private OrcBuilder builder;


    public OrcDirector(OrcRace race) {
        setOrcBuilder(race);
    }
    // Фабричный метод
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
                // to-do добавить эксепшен
                builder = null;
        }
    }


    public Orc createBasicOrc(String orcName) {
        builder.buildType(BASIC)
                .buildName(orcName)
                .buildWeapon()
                .buildArmor()
                .buildBanner()
                .buildHealth()
                .buildPower()
                .buildAgility()
                .buildIntelligence()
                .addBanner()
                .addHorn();
        return builder.createNewOrc();
    }

    public Orc createLeaderOrc(String orcName) {
        builder.buildType(LEADER)
                .buildName(orcName)
                .buildWeapon()
                .buildArmor()
                .buildBanner()
                .buildHealth()
                .buildPower()
                .buildAgility()
                .buildIntelligence()
                .addBanner()
                .addHorn();
        return builder.createNewOrc();
    }

    public Orc createScoutOrc(String orcName) {
        builder.buildType(SCOUTE)
                .buildName(orcName)
                .buildWeapon()
                .buildArmor()
                .buildBanner()
                .buildHealth()
                .buildPower()
                .buildAgility()
                .buildIntelligence()
                .addBanner()
                .addHorn();
        return builder.createNewOrc();
    }
}
