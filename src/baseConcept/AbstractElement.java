package baseConcept;

import baseConcept.onePhased.OnePhasedConsumer;

import java.util.List;

public class AbstractElement {

    protected String name;
    protected String description;

    protected AbstractElement(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isHaveChildren() {
        return false;
    }

    public List<AbstractElement> getChildren() {
        return null;
    }

    public Double getMaximalAmperage() {
        return 0d;
    }

    public boolean addChildren(AbstractElement element) {
        return true;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.description + ")";
    }

    public static class Builder {
        protected String name;
        protected String description;

        public Builder(){

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public AbstractElement build() {
            return new AbstractElement(this);
        }

        public Builder setPower(final Double power) {
            return this;
        }

        public Builder setCriticalAmperage(final Double amperage) { return this; }

        public Builder setResistance(final Double resistance) { return this; }

        public Builder setLength(final Double length) {return this;}
    }
}
