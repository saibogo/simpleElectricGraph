package realModels.circuitBreakers;

import models.onePhased.OnePhasedCircuitBreaker;

final public class ABB_S201_C25 extends OnePhasedCircuitBreaker {

    public ABB_S201_C25(final String name) {
        super((OnePhasedCircuitBreaker.Builder)(new OnePhasedCircuitBreaker
                .Builder()).setName(name)
                .setDescription("ABB S201 25A")
                .setCriticalAmperage(25d));
    }
}
