package models.cables;

import baseConcept.onePhased.OnePhasedLine;

final public class VVGng3x1_5 extends OnePhasedLine {

    public VVGng3x1_5(final String name, final Double length) {
        super((OnePhasedLine.Builder)(new OnePhasedLine.Builder())
                .setName(name)
                .setDescription("ВВГнг 3*1.5")
                .setCriticalAmperage(15d)
                .setLength(length)
                .setResistance(12.1d / 1000d));
    }
}
