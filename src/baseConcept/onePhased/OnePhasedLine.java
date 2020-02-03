package baseConcept.onePhased;

public class OnePhasedLine extends AbstractOnePhasedElement {

    protected Double criticalAmperage;
    protected Double resistance;
    protected Double length;

    protected OnePhasedLine(Builder builder) {
        super(builder);
        this.criticalAmperage = builder.criticalAmperage;
        this.resistance = builder.resistance;
        this.length = builder.length;
    }

    public boolean isCriticalAmperage() {
        return this.criticalAmperage < this.getMaximalAmperage();
    }

    private Double getFullResistance() {
        return this.resistance * this.length;
    }

    public Double getHeatLoss() {
        return this.getMaximalAmperage() * this.getMaximalAmperage() * this.getFullResistance();
    }


    public static class Builder extends AbstractOnePhasedElement.Builder {

        protected Double criticalAmperage;
        protected Double resistance;
        protected Double length;

        @Override
        public OnePhasedLine build() {
            return new OnePhasedLine(this);
        }

        @Override
        public Builder setCriticalAmperage(Double amperage) {
            this.criticalAmperage = amperage;
            return this;
        }

        @Override
        public Builder setResistance(Double resistance) {
            this.resistance = resistance;
            return this;
        }

        @Override
        public Builder setLength(Double length) {
            this.length = length;
            return this;
        }
    }
}
