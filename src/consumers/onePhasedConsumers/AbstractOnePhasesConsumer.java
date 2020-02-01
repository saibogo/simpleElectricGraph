package consumers.onePhasedConsumers;

import baseConcepts.AbstractOnePhasedElements;
import baseConcepts.Limitations;
import baseConcepts.Voltage;

public class AbstractOnePhasesConsumer extends AbstractOnePhasedElements implements Limitations {

    protected Double maximalPower;

    public AbstractOnePhasesConsumer(String name, String description,  Double maximalPower) {
        super(name, description);
        this.maximalPower = maximalPower;
    }

    @Override
    public Double getAmperage() {
        return this.maximalPower / Voltage.PHASED_VOLTAGE;
    }

    @Override
    public Double getLimitAmperage() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public boolean isCriticalAmperage() {
        return this.getAmperage() > this.getLimitAmperage();
    }

    @Override
    public boolean addChild(AbstractOnePhasedElements element) {
        return false;
        //Consumer don't have child
    }
}
