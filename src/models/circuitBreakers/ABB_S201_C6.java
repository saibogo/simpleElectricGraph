package models.circuitBreakers;

import baseConcept.onePhased.OnePhasedCircuitBreaker;

final public class ABB_S201_C6 extends OnePhasedCircuitBreaker {

    public ABB_S201_C6(final String name) {
        super((OnePhasedCircuitBreaker.Builder)(new OnePhasedCircuitBreaker
                .Builder()).setName(name)
                .setDescription("ABB S201 6A")
                .setCriticalAmperage(6d));
    }
}
