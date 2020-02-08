package models.circuitBreakers;

import baseConcept.onePhased.OnePhasedCircuitBreaker;

final public class ABB_S201_C16 extends OnePhasedCircuitBreaker {

    public ABB_S201_C16(final String name) {
        super((OnePhasedCircuitBreaker.Builder)(new OnePhasedCircuitBreaker
                .Builder()).setName(name)
                .setDescription("ABB S201 16A")
                .setCriticalAmperage(16d));
    }
}
