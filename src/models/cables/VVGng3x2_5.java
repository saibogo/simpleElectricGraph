package models.cables;

import baseConcept.onePhased.OnePhasedLine;

final public class VVGng3x2_5 extends OnePhasedLine {

    public VVGng3x2_5(final String name, final Double length) {
        super((OnePhasedLine.Builder)(new OnePhasedLine.Builder())
                .setName(name)
                .setDescription("ВВГнг 3*2.5")
                .setCriticalAmperage(25d)
                .setLength(length)
                .setResistance(7.41d / 1000d));
    }
}
