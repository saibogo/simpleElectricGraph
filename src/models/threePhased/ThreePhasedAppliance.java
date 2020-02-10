package models.threePhased;

import models.AbstractElement;

public class ThreePhasedAppliance extends AbstractThreePhasedElement {

    protected Double criticalAmperage;

    protected ThreePhasedAppliance(Builder builder) {
        super(builder);
        this.criticalAmperage = builder.criticalAmperage;

    }

    public boolean isCriticalAmperage() {
        return this.criticalAmperage < this.getMaximalAmperage();
    }


    public static class Builder extends AbstractThreePhasedElement.Builder {

        protected Double criticalAmperage;

        @Override
        public ThreePhasedAppliance build() {
            return new ThreePhasedAppliance(this);
        }

        @Override
        public AbstractElement.Builder setCriticalAmperage(Double amperage) {
            this.criticalAmperage = amperage;
            return this;
        }

    }
}
