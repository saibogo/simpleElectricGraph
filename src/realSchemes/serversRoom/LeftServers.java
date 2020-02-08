package realSchemes.serversRoom;

import baseConcept.AbstractElement;
import baseConcept.onePhased.OnePhasedConsumer;
import baseConcept.onePhased.OnePhasedLine;
import baseConcept.onePhased.OnePhasedScheme;
import models.cables.VVGng3x4;
import models.ups.Smart_UPS_10000;

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
