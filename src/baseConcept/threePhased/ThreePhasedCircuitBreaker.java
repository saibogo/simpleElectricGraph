package baseConcept.threePhased;

import baseConcept.AbstractElement;

public class ThreePhasedCircuitBreaker extends AbstractThreePhasedElement {

    protected Double criticalAmperage;

    protected ThreePhasedCircuitBreaker(Builder builder) {
        super(builder);
    }

    public boolean isCriticalAmperage() {
        return this.criticalAmperage < this.getMaximalAmperage();
    }

    public static class Builder extends AbstractThreePhasedElement.Builder {

        protected Double criticalAmperage;

        @Override
        public ThreePhasedCircuitBreaker build() {
            return new ThreePhasedCircuitBreaker(this);
        }

        @Override
        public AbstractElement.Builder setCriticalAmperage(Double amperage) {
            this.criticalAmperage = amperage;
            return this;
        }
    }
}
