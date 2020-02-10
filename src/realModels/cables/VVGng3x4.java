package realModels.cables;

import models.onePhased.OnePhasedLine;

public class VVGng3x4 extends OnePhasedLine {

    public VVGng3x4(final String name, final Double length) {
        super((OnePhasedLine.Builder)(new OnePhasedLine.Builder())
                .setName(name)
                .setDescription("ВВГнг 3*4")
                .setCriticalAmperage(32d)
                .setLength(length)
                .setResistance(4.61d / 1000d));
    }
}
