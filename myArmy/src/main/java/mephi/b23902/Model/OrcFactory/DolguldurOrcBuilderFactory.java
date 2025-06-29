package mephi.b23902.Model.OrcFactory;

import mephi.b23902.Model.GearFactory.Dolguldur.DolguldurGearFactory;
import mephi.b23902.Model.Orc.DolguldurOrcBuilder;
import mephi.b23902.Model.Orc.OrcBuilder;

public class DolguldurOrcBuilderFactory implements OrcBuilderFactory {

    @Override
    public OrcBuilder createOrcBuilder() {
        return new DolguldurOrcBuilder().buildGearFactory( new DolguldurGearFactory());
    }
}
