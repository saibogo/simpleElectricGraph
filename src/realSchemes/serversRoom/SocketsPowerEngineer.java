package realSchemes.serversRoom;

import models.AbstractElement;
import models.onePhased.OnePhasedScheme;
import realModels.cables.VVGng3x2_5;
import realModels.computers.ComputerSystemUnit;
import realModels.computers.MonitorsAny;

final public class SocketsPowerEngineer {

    public static OnePhasedScheme consumer() {
        AbstractElement scheme = new OnePhasedScheme.Builder()
                .setName("Розетки главный энергетик")
                .setDescription("Проложено за стеной")
                .build();

        AbstractElement cable = new VVGng3x2_5("Розетки стол главного энергетика", 2d);
        AbstractElement systemUnit = new ComputerSystemUnit("Компьютер Андрея");
        AbstractElement monitor = new MonitorsAny("LG 20дм.");
        cable.addChildren(systemUnit);
        cable.addChildren(monitor);

        scheme.addChildren(cable);
        return (OnePhasedScheme) scheme;
    }
}
