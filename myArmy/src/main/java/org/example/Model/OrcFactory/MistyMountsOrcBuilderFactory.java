package org.example.Model.OrcFactory;

import org.example.Model.GearFactory.MistyMounts.MistyMountsGearFactory;
import org.example.Model.Orc.MistyMountsOrcBuilder;
import org.example.Model.Orc.OrcBuilder;

public class MistyMountsOrcBuilderFactory implements OrcBuilderFactory {
    @Override
    public OrcBuilder createOrcBuilder() {
        return new MistyMountsOrcBuilder().buildGearFactory( new MistyMountsGearFactory());
    }
}