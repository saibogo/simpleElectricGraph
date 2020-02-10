package realModels.lamps;

import models.onePhased.OnePhasedConsumer;

final public class LED_Navigator36 extends OnePhasedConsumer {


    public LED_Navigator36(final String name) {
        super((OnePhasedConsumer.Builder)(new OnePhasedConsumer.Builder())
                .setName(name)
                .setDescription("LED 36W Navigator 4000K для подвесных потолков")
                .setPower(36d));

    }
}
