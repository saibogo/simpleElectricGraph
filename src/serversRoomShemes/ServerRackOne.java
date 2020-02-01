package serversRoomShemes;

import consumers.onePhasedConsumers.OnePhasedScheme;
import consumers.onePhasedConsumers.UPS;
import lines.onePhasedLines.VVGng3x4;

public class ServerRackOne {

    public static OnePhasedScheme consumer() {
        OnePhasedScheme scheme = new OnePhasedScheme("Главная серверная стойка",
                "Главная серверная стойка");

        VVGng3x4 vvg1 = new VVGng3x4("Питание серверной стойки", "ВВГнг 3*4",
                8d, 32d);

        scheme.addChild(vvg1);

        UPS ups10000 = new UPS("UPS серверной стойки", "SmartUPS 10000", 2700d);
        vvg1.addChild(ups10000);

        return scheme;
    }
}
