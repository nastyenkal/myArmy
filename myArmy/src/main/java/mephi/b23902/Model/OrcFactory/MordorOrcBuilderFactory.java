package mephi.b23902.Model.OrcFactory;

import mephi.b23902.Model.GearFactory.Mordor.MordorGearFactory;
import mephi.b23902.Model.Orc.MordorOrcBuilder;
import mephi.b23902.Model.Orc.OrcBuilder;

public class MordorOrcBuilderFactory implements OrcBuilderFactory {
    @Override
    public OrcBuilder createOrcBuilder() {
        OrcBuilder orcBuilder;
        orcBuilder = new MordorOrcBuilder();
        return new MordorOrcBuilder().buildGearFactory( new MordorGearFactory() );
    }

}
