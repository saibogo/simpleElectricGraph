package view;

import baseConcept.AbstractElement;
import baseConcept.onePhased.OnePhasedCircuitBreaker;
import baseConcept.onePhased.OnePhasedLine;
import baseConcept.onePhased.OnePhasedScheme;
import controllers.TreeController;

public class ElementView {

    final static int STEP = 2;

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
        if (element instanceof OnePhasedCircuitBreaker) {
            System.out.println("Ток выше максимального?:" + ((OnePhasedCircuitBreaker) element).isCriticalAmperage());
        }
        System.out.println();
    }


    public static String listOfTreeToString(AbstractElement element, int delta) {
        if (!element.isHaveChildren() || element instanceof OnePhasedScheme) {
            return element.toString();
        }
        String result = element.toString();
        String pattern = "|" + " ".repeat(STEP);
        for (AbstractElement child: element.getChildren()) {

            result += ("\n" + pattern.repeat(delta) + "|" + "_".repeat(STEP) + listOfTreeToString(child, delta + 1));
        }
        return result;
    }
}
