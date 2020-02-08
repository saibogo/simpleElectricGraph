package models.airConditioning;

import baseConcept.onePhased.OnePhasedConsumer;

public class MS_GF60VA extends OnePhasedConsumer {

    public MS_GF60VA(final String name) {
        super((OnePhasedConsumer.Builder)(new OnePhasedConsumer.Builder())
                .setName(name)
                .setDescription("Mitsubishi MS-GF60VA внутренний блок")
                .setPower(100d));

    }
}
