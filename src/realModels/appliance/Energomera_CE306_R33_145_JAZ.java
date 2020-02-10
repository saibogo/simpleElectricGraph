package realModels.appliance;

import models.threePhased.ThreePhasedAppliance;

final public class Energomera_CE306_R33_145_JAZ extends ThreePhasedAppliance {


    public Energomera_CE306_R33_145_JAZ(final String name) {
        super((ThreePhasedAppliance.Builder)(new ThreePhasedAppliance.Builder()
                .setName(name)
                .setDescription("Энергомера CE306 R33 145 JAZZ 5-60A")
                .setCriticalAmperage(60d)));
    }
}
