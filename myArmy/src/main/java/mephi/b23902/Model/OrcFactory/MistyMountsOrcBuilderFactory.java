package mephi.b23902.Model.OrcFactory;

import mephi.b23902.Model.GearFactory.MistyMounts.MistyMountsGearFactory;
import mephi.b23902.Model.Orc.MistyMountsOrcBuilder;
import mephi.b23902.Model.Orc.OrcBuilder;

public class MistyMountsOrcBuilderFactory implements OrcBuilderFactory {
    @Override
    public OrcBuilder createOrcBuilder() {
        return new MistyMountsOrcBuilder().buildGearFactory( new MistyMountsGearFactory());
    }
}