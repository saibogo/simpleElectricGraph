package realSchemes.serversRoom;

import models.AbstractElement;
import models.onePhased.OnePhasedScheme;
import realModels.cables.VVGng3x1_5;
import realModels.lamps.LED_Navigator36;

final public class ServersRoomLigth {

    public static OnePhasedScheme consumer() {
        AbstractElement lamp1 = new LED_Navigator36("Дальний светильник серверная");
        AbstractElement cable1 = new VVGng3x1_5("Перемычка между светильниками", 1.5d);
        cable1.addChildren(lamp1);

        AbstractElement lamp2 = new LED_Navigator36("Ближний светильник серверная");
        AbstractElement cable2 = new VVGng3x1_5("Линия освещения серверной", 3d);

        cable2.addChildren(cable1);
        cable2.addChildren(lamp2);

        OnePhasedScheme scheme = (OnePhasedScheme) new OnePhasedScheme.Builder()
                .setName("Освещение серверной")
                .setDescription("Через выключатель в коридоре").
                        build();

        scheme.addChildren(cable2);

        return scheme;
    }
}
