package realSchemes.serversRoom;

import models.AbstractElement;
import models.onePhased.OnePhasedConsumer;
import models.onePhased.OnePhasedLine;
import models.onePhased.OnePhasedScheme;
import realModels.cables.VVGng3x4;
import realModels.ups.Smart_UPS_10000;

final public class LeftServers {

    public static OnePhasedScheme consumer() {

        OnePhasedConsumer ups = new Smart_UPS_10000("UPS главная стойка");
        OnePhasedLine line = new VVGng3x4("Питание главной серверной стойки", 7.5d);
        line.addChildren(ups);
        AbstractElement scheme = new OnePhasedScheme.Builder()
                .setName("Главная серверная стойка")
                .setDescription("Через потолок")
                .build();
        scheme.addChildren(line);
        return (OnePhasedScheme) scheme;
    }
}
