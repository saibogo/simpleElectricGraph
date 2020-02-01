package lines.onePhasedLines;

public class VVGng3x4 extends AbstractOnePhasedLine {
    public VVGng3x4(String name, String description, Double length, Double limitAmperage) {
        super(name, description, length, limitAmperage);
        this.resistancePerMeter = 4.61d / 1000;
    }
}
