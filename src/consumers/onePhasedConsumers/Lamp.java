package consumers.onePhasedConsumers;

public class Lamp extends AbstractOnePhasesConsumer {
    public Lamp(final String name, final String description, final Double maximalPower) {
        super(name, description, maximalPower);
    }
}
