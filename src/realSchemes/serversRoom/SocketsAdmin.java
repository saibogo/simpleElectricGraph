package realSchemes.serversRoom;

import baseConcept.AbstractElement;
import baseConcept.onePhased.OnePhasedScheme;
import models.boilers.Polaris_PWK_1765_CAR;
import models.cables.VVGng3x2_5;
import models.computers.ComputerSystemUnit;
import models.computers.MonitorsAny;

final public class SocketsAdmin {

    public static OnePhasedScheme consumer() {
        AbstractElement scheme = new OnePhasedScheme.Builder()
                .setName("Розетки сисадмин")
                .setDescription("Проложено за потолком")
                .build();
        AbstractElement cable1 = new VVGng3x2_5("Розетки сисадмин", 3d);
        AbstractElement cable2 = new VVGng3x2_5("Розетки сисадмин стол", 2.5d);
        AbstractElement cable3 = new VVGng3x2_5("Розетки сисадмин стена", 3d);
        cable1.addChildren(cable2);
        cable1.addChildren(cable3);
        scheme.addChildren(cable1);

        AbstractElement boiler = new Polaris_PWK_1765_CAR("Чайник настольный");
        AbstractElement systemUnit = new ComputerSystemUnit("Компьютер Льва");
        AbstractElement monitor = new MonitorsAny("ASUS 22дм.");
        cable2.addChildren(systemUnit);
        cable2.addChildren(monitor);

        cable3.addChildren(boiler);
        return (OnePhasedScheme) scheme;
    }
}
