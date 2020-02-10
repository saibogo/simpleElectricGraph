package models.threePhased;

public class ThreePhasedLine extends AbstractThreePhasedElement {

    protected Double criticalAmperage;
    protected Double resistance;
    protected Double length;

    protected ThreePhasedLine(Builder builder) {
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
        return  3 * this.getMaximalAmperage() * this.getMaximalAmperage() * this.getFullResistance();
    }

    @Override
    public String toString() {
        return this.description + " L = " + this.length + " м.(" + this.name + ")";
    }

    public static class Builder extends AbstractThreePhasedElement.Builder {

        protected Double criticalAmperage;
        protected Double resistance;
        protected Double length;

        @Override
        public ThreePhasedLine build() {
            return new ThreePhasedLine(this);
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
