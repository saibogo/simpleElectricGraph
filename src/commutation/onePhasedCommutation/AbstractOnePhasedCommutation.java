package commutation.onePhasedCommutation;

import baseConcepts.AbstractOnePhasedElements;
import baseConcepts.Limitations;

public class AbstractOnePhasedCommutation extends AbstractOnePhasedElements implements Limitations {

    protected Double limitAmperage;

    public AbstractOnePhasedCommutation(String name, String description, Double limitAmperage) {
        super(name, description);
        this.limitAmperage = limitAmperage;
    }

    @Override
    public Double getAmperage() {
        Double result = 0d;
        for (AbstractOnePhasedElements element: this.getChildren()) result += element.getAmperage();
        return result;
    }

    @Override
    public Double getLimitAmperage() {
        return this.limitAmperage;
    }

    @Override
    public boolean isCriticalAmperage() {
        return this.limitAmperage < this.getAmperage();
    }


}
