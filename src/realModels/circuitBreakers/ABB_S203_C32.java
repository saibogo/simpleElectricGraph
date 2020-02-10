package realModels.circuitBreakers;

import models.threePhased.ThreePhasedCircuitBreaker;

public class ABB_S203_C32 extends ThreePhasedCircuitBreaker {

    public ABB_S203_C32(final String name) {
        super((ThreePhasedCircuitBreaker.Builder)(new ThreePhasedCircuitBreaker.Builder())
                .setName(name)
                .setDescription("ABB S203 32A")
                .setCriticalAmperage(6d));
    }
}
