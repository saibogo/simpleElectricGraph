package view;

import baseConcept.AbstractElement;
import baseConcept.onePhased.AbstractOnePhasedElement;
import baseConcept.onePhased.OnePhasedCircuitBreaker;
import baseConcept.onePhased.OnePhasedLine;
import baseConcept.onePhased.OnePhasedScheme;
import baseConcept.threePhased.AbstractThreePhasedElement;
import controllers.Phases;
import controllers.TreeController;
import pairs.Triple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementView {

    final static int STEP = 2;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANGLE_CONNECTION = "\u2517";
    public static final String THREE_PHASED = "\u2261";
    public static final String ONE_PHASED = "\u2501";
    public static final String SECTION = "\u2503";
    public static final String SECTIONS_SEPARATOR = "\u22EF";


    public static void printInfo(AbstractElement element) {
        System.out.println(element.toString());
        System.out.println("Name: " + element.getName());
        System.out.println("Description: " + element.getDescription());
        System.out.println("Have children?: " + element.isHaveChildren());

        if (element instanceof AbstractOnePhasedElement) {
            System.out.println("Children list: " + element.getChildren());
        }

        if (element instanceof AbstractThreePhasedElement) {
            System.out.println("Three Phase children: " + ((AbstractThreePhasedElement) element).getChildrenABC());
            System.out.println("Phase A children: " + ((AbstractThreePhasedElement) element).getChildrenA());
            System.out.println("Phase B children: " + ((AbstractThreePhasedElement) element).getChildrenB());
            System.out.println("Phase C children: " + ((AbstractThreePhasedElement) element).getChildrenC());
        }

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

    public static void show(AbstractElement element) {

        String color = (element instanceof  AbstractOnePhasedElement) ? ANSI_CYAN : ANSI_PURPLE;
        String connection = (element instanceof AbstractOnePhasedElement) ? ONE_PHASED : THREE_PHASED;

        System.out.println(color + connection.repeat(STEP) + element + ANSI_RESET);

        List<Triple<Integer, AbstractElement, Phases>> childTree = TreeController.childTreeLevelList(element);


        for(Triple<Integer, AbstractElement, Phases> child: childTree) {

            if (child.getLast().equals(Phases.ANY)) color = ANSI_CYAN;
            else if (child.getLast().equals(Phases.A)) color = ANSI_YELLOW;
            else if (child.getLast().equals(Phases.B)) color = ANSI_GREEN;
            else if (child.getLast().equals(Phases.C)) color = ANSI_RED;
            else color = ANSI_PURPLE;

            connection = (child.getSecond() instanceof AbstractOnePhasedElement) ? ONE_PHASED : THREE_PHASED;

            System.out.println(color + " ".repeat(STEP * child.getFirst())  + ANGLE_CONNECTION + connection + child.getSecond() + ANSI_RESET);
        }

    }

}
