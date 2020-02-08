package realSchemes.serversRoom;

import baseConcept.AbstractElement;
import baseConcept.onePhased.OnePhasedConsumer;
import baseConcept.onePhased.OnePhasedLine;
import baseConcept.onePhased.OnePhasedScheme;
import models.cables.VVGng3x4;
import models.ups.Smart_UPS_3000;

final public class RightServers {
    public static OnePhasedScheme consumer() {

        OnePhasedConsumer ups = new Smart_UPS_3000("UPS малая стойка");
        OnePhasedLine line = new VVGng3x4("Питание малой серверной стойки", 8.5d);
        line.addChildren(ups);
        AbstractElement scheme = new OnePhasedScheme.Builder()
                .setName("Малая серверная стойка")
                .setDescription("Через потолок")
                .build();
        scheme.addChildren(line);
        return (OnePhasedScheme) scheme;
    }
}
