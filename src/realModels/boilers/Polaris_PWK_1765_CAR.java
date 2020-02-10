package realModels.boilers;

import models.onePhased.OnePhasedConsumer;

final public class Polaris_PWK_1765_CAR extends OnePhasedConsumer {

    public Polaris_PWK_1765_CAR(final String name) {
        super((OnePhasedConsumer.Builder)(new OnePhasedConsumer.Builder())
                .setName(name)
                .setDescription("Кипятильник электрический Polaris PWK 1765 CAR")
                .setPower(2200d));

    }
}
