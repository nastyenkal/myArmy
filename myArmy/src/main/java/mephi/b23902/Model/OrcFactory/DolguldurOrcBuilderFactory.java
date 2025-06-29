package org.example.Model.OrcFactory;

import org.example.Model.GearFactory.Dolguldur.DolguldurGearFactory;
import org.example.Model.Orc.DolguldurOrcBuilder;
import org.example.Model.Orc.OrcBuilder;

public class DolguldurOrcBuilderFactory implements OrcBuilderFactory {

    @Override
    public OrcBuilder createOrcBuilder() {
        return new DolguldurOrcBuilder().buildGearFactory( new DolguldurGearFactory());
    }
}
