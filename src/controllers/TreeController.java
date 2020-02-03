package controllers;

import baseConcept.AbstractElement;
import baseConcept.onePhased.OnePhasedScheme;

import java.util.ArrayList;
import java.util.List;

public class TreeController {
    public static int getMaximalLengthTree(AbstractElement element) {
        if (!element.isHaveChildren() || element instanceof OnePhasedScheme) {
            return 1;
        }

        int result = 0;
        for (AbstractElement child: element.getChildren()) {
                result = Math.max(result, getMaximalLengthTree(child));
        }
        return result + 1;
    }

    public static List<AbstractElement> getAllElementLevelN(AbstractElement element, int level) {
        List<AbstractElement> result = new ArrayList<>();
        if (level == 1 || element instanceof OnePhasedScheme) {
            result.add(element);
        } else if (level > 1) {
            for (AbstractElement child: element.getChildren()) {
                result.addAll(getAllElementLevelN(child, level - 1));
            }
        }
        return result;
    }

    public static int countOfElements(AbstractElement element) {
        int result = 1;
        if (element instanceof OnePhasedScheme || !element.isHaveChildren()) {
        } else {
            for (AbstractElement child: element.getChildren()) result += countOfElements(child);
        }
        return result;
    }

}
