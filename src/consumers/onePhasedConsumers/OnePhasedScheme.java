package consumers.onePhasedConsumers;

import baseConcepts.AbstractElement;
import baseConcepts.AbstractOnePhasedElements;

public class OnePhasedScheme extends AbstractOnePhasesConsumer {

    public OnePhasedScheme(String name, String description) {
        super(name, description, 0d);
    }

    @Override
    public boolean addChild(AbstractOnePhasedElements element) {
        this.children.add(element);
        return true;
    }

    @Override
    public Double getLimitAmperage() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public Double getAmperage() {
        Double result = 0d;
        for(AbstractOnePhasedElements element: this.getChildren()) result += element.getAmperage();
        return result;
    }


}
