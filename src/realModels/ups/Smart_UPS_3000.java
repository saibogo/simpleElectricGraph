package realModels.ups;

import models.onePhased.OnePhasedConsumer;

final public class Smart_UPS_3000 extends OnePhasedConsumer {

    public Smart_UPS_3000(final String name) {
        super((OnePhasedConsumer.Builder)(new OnePhasedConsumer.Builder())
                .setName(name)
                .setDescription("Smart UPS 10000")
                .setPower(300d));
    }
}
