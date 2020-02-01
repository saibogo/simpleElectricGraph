package lines.onePhasedLines;

import baseConcepts.AbstractOnePhasedElements;
import baseConcepts.Limitations;
import baseConcepts.LinesMethods;

public class AbstractOnePhasedLine extends AbstractOnePhasedElements implements Limitations, LinesMethods {

    protected Double length;
    protected Double limitAmperage;
    protected Double resistancePerMeter;

    public AbstractOnePhasedLine(String name, String description, Double length, Double limitAmperage) {
        super(name, description);
        this.length = length;
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
        return this.getAmperage() > this.getLimitAmperage();
    }

    @Override
    public Double getLength() {
        return this.length;
    }

    @Override
    public Double getResistance() {
        return this.getLength() * this.resistancePerMeter;
    }

    @Override
    public Double getDeltaPower() {
        return this.getAmperage() * (this.getResistance() * this.getResistance());
    }

}
