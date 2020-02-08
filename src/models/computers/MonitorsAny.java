package models.computers;

import baseConcept.onePhased.OnePhasedConsumer;

final public class MonitorsAny extends OnePhasedConsumer {

    public MonitorsAny(final String name) {
        super((OnePhasedConsumer.Builder)(new OnePhasedConsumer.Builder())
                .setName(name)
                .setDescription("Монитор разн.")
                .setPower(30d));

    }
}
