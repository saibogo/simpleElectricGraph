package view;

import baseConcept.AbstractElement;
import baseConcept.onePhased.OnePhasedLine;

public class ElementView {
    public static void printInfo(AbstractElement element) {
        System.out.println(element.toString());
        System.out.println("Name: " + element.getName());
        System.out.println("Description: " + element.getDescription());
        System.out.println("Have children?: " + element.isHaveChildren());
        System.out.println("Children list: " + element.getChildren());
        System.out.println("Maximal Amperage = " + element.getMaximalAmperage() + " A.");
        if (element instanceof OnePhasedLine) {
            System.out.println("Ток выше максимального?:" + ((OnePhasedLine) element).isCriticalAmperage());
            System.out.println("Тепловые потери: " + ((OnePhasedLine) element).getHeatLoss() + " W.");
        }
        System.out.println();
    }
}
