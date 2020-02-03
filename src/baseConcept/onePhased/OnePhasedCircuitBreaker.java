package baseConcept.onePhased;

import baseConcept.AbstractElement;

public class OnePhasedCircuitBreaker extends AbstractOnePhasedElement {

    protected Double criticalAmperage;

    protected OnePhasedCircuitBreaker(Builder builder) {
        super(builder);
        this.criticalAmperage = builder.criticalAmperage;
    }

    public boolean isCriticalAmperage() {
        return this.criticalAmperage < this.getMaximalAmperage();
    }

    public static class Builder extends AbstractOnePhasedElement.Builder {

        protected Double criticalAmperage;

        @Override
        public OnePhasedCircuitBreaker build() {
            return new OnePhasedCircuitBreaker(this);
        }

        @Override
        public AbstractElement.Builder setCriticalAmperage(Double amperage) {
            this.criticalAmperage = amperage;
            return this;
        }
    }

}
