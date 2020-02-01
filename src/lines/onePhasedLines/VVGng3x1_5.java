package lines.onePhasedLines;

public class VVGng3x1_5 extends AbstractOnePhasedLine{
    public VVGng3x1_5(String name, String description, Double length, Double limitAmperage) {
        super(name, description, length, limitAmperage);
        this.resistancePerMeter = 12.1d / 1000;
    }
}
