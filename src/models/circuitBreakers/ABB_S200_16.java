package models.circuitBreakers;

import baseConcept.onePhased.OnePhasedCircuitBreaker;

final public class ABB_S200_16 extends OnePhasedCircuitBreaker {

    public ABB_S200_16(final String name) {
        super((OnePhasedCircuitBreaker.Builder)(new OnePhasedCircuitBreaker
                .Builder()).setName(name)
                .setDescription("ABB S200 16A")
                .setCriticalAmperage(16d));
    }
}
