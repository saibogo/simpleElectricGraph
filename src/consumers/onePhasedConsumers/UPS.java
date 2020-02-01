package consumers.onePhasedConsumers;

import consumers.onePhasedConsumers.AbstractOnePhasesConsumer;

public class UPS extends AbstractOnePhasesConsumer {
    public UPS(String name, String description, Double maximalPower) {
        super(name, description, maximalPower);
    }
}
