package realModels.computers;

import models.onePhased.OnePhasedConsumer;

final public class ComputerSystemUnit extends OnePhasedConsumer {

    public ComputerSystemUnit(final String name) {
        super((OnePhasedConsumer.Builder)(new OnePhasedConsumer.Builder())
                .setName(name)
                .setDescription("Системный блок разн.")
                .setPower(50d));

    }
}
