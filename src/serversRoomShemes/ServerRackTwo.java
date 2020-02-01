package serversRoomShemes;


import consumers.onePhasedConsumers.OnePhasedScheme;
import consumers.onePhasedConsumers.UPS;
import lines.onePhasedLines.VVGng3x4;

public class ServerRackTwo {

    public static OnePhasedScheme consumer() {
        OnePhasedScheme scheme = new OnePhasedScheme("Малая серверная стойка",
                "Малая серверная стойка");

        VVGng3x4 vvg = new VVGng3x4("Питание серверной стойки", "ВВГнг 3*4",
                9d, 32d);

        scheme.addChild(vvg);

        UPS ups = new UPS("UPS серверной стойки", "SmartUPS 1000", 100d);

        vvg.addChild(ups);

        return scheme;
    }

}
