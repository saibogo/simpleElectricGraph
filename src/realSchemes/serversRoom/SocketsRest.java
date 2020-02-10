package realSchemes.serversRoom;

import models.AbstractElement;
import models.onePhased.OnePhasedScheme;
import realModels.cables.VVGng3x2_5;

final public class SocketsRest {

    public static OnePhasedScheme consumer() {
        AbstractElement scheme  = new OnePhasedScheme.Builder()
                .setName("Розетки дальний угол")
                .setDescription("Проложено за потолком и стеной")
                .build();
        AbstractElement cable = new VVGng3x2_5("Питание розеток в углу", 6d);
        scheme.addChildren(cable);

        return (OnePhasedScheme)scheme;
    }
}
