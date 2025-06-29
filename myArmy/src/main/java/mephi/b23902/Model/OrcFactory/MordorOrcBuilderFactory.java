package org.example.Model.OrcFactory;

import org.example.Model.GearFactory.Mordor.MordorGearFactory;
import org.example.Model.Orc.MordorOrcBuilder;
import org.example.Model.Orc.OrcBuilder;

public class MordorOrcBuilderFactory implements OrcBuilderFactory {
    @Override
    public OrcBuilder createOrcBuilder() {
        OrcBuilder orcBuilder;
        orcBuilder = new MordorOrcBuilder();
        return new MordorOrcBuilder().buildGearFactory( new MordorGearFactory() );
    }

}
