package mephi.b23902.Model.Orc;

import static mephi.b23902.Model.Orc.OrcRace.*;

public class DolguldurOrcBuilder extends OrcBuilder {
    public DolguldurOrcBuilder() {
        super();
        this.race = DOLGULDUR_ORC;
    }

    @Override
    public OrcBuilder buildPower() {
        int min = 1;
        int max = 50;
        int power = min + (int) (Math.random() * (max - min));
        this.power = (int) (1.00 * power);
        return this;
    }

    @Override
    public OrcBuilder buildAgility() {
        int min = 1;
        int max = 100;
        int audacity = min + (int) (Math.random() * (max - min));
        this.agility = (int) (1.00 * audacity);
        return this;
    }

    @Override
    public OrcBuilder buildIntelligence() {
        int min = 1;
        int max = 50;
        this.intelligence = min + (int) (Math.random() * (max - min));
        return this;
    }

    @Override
    public OrcBuilder buildHealth() {
        int min = 50;
        int max = 200;
        this.health = min + (int) (Math.random() * (max - min));
        return this;
    }

}

