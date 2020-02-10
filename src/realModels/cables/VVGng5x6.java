package realModels.cables;

import models.threePhased.ThreePhasedLine;

final public class VVGng5x6 extends ThreePhasedLine {

    public VVGng5x6(final String name, final Double length){
        super((ThreePhasedLine.Builder)(new ThreePhasedLine.Builder())
                .setCriticalAmperage(45d)
                .setLength(length)
                .setName(name)
                .setDescription("ВВГнг 5*6")
                .setResistance(3.08d / 1000d));
    }
}
