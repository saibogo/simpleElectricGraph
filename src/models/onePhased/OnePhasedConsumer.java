package models.onePhased;

import models.AbstractElement;
import controllers.Voltage;

public class OnePhasedConsumer extends AbstractOnePhasedElement{

    protected Double power;

    protected OnePhasedConsumer(Builder builder) {
        super(builder);
        this.power = builder.power;
    }

    @Override
    public boolean addChildren(AbstractElement element) {
        return false;
    }

    @Override
    public Double getMaximalAmperage() {
        return this.power / Voltage.PHASED_VOLTAGE;
    }



    public static class Builder extends AbstractOnePhasedElement.Builder {
        protected Double power;

        @Override
        public Builder setPower(final Double power) {
            this.power = power;
            return this;
        }

        @Override
        public OnePhasedConsumer build() {
            return new OnePhasedConsumer(this);
        }
    }
}
