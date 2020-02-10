package realModels.airConditioning;

import models.onePhased.OnePhasedConsumer;

public class MS_GF60VA_external_unit extends OnePhasedConsumer {

    public MS_GF60VA_external_unit(final String name) {
        super((Builder)(new Builder())
                .setName(name)
                .setDescription("Mitsubishi MS-GF60VA внешний блок")
                .setPower(3000d));

    }
}
