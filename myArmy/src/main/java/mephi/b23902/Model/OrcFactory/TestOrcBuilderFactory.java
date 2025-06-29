package mephi.b23902.Model.OrcFactory;

import mephi.b23902.Model.Orc.Orc;
import mephi.b23902.Model.Orc.OrcRace;

public class TestOrcBuilderFactory {
    public static void main(String[] args) {

        //OrcDirector director1 = new OrcDirector(OrcRace.MORDOR_ORC);
        //OrcDirector director1 = new OrcDirector(OrcRace.MISTYMOUNTS_ORC);
        OrcDirector director1 = new OrcDirector(OrcRace.DOLGULDUR_ORC);

        Orc orc1 = director1.createBasicOrc(null);
        Orc orc2 = director1.createScoutOrc(null);
        Orc orc3 = director1.createLeaderOrc(null);

        System.out.println(orc1);
        System.out.println(orc2);
        System.out.println(orc3);
    }

}
