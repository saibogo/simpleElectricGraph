package controllers;


import baseConcept.AbstractElement;
import baseConcept.onePhased.AbstractOnePhasedElement;
import baseConcept.threePhased.AbstractThreePhasedElement;
import pairs.Triple;

import java.util.ArrayList;
import java.util.List;

public class TreeController {

    public static List<Triple<Integer, AbstractElement, Phases>> childTreeLevelList(AbstractElement element) {
        List<Triple<Integer, AbstractElement, Phases>> result = new ArrayList<>();
        if (element.isHaveChildren()) {
            if (element instanceof AbstractOnePhasedElement) {
                for (AbstractElement child: element.getChildren()) {
                    result.add(new Triple<>(1, child, Phases.ANY));

                    List<Triple<Integer, AbstractElement, Phases>> childList = childTreeLevelList(child);
                    for (Triple<Integer, AbstractElement, Phases> triple : childList) {
                        result.add(new Triple<>(triple.getFirst() + 1, triple.getSecond(), triple.getLast()));
                    }
                }
            } else {
                for (AbstractElement child: ((AbstractThreePhasedElement)element).getChildrenABC()) {
                    result.add(new Triple<>(1, child, Phases.ABC));

                    List<Triple<Integer, AbstractElement, Phases>> childList = childTreeLevelList(child);
                    for (Triple<Integer, AbstractElement, Phases> triple : childList) {
                        result.add(new Triple<>(triple.getFirst() + 1, triple.getSecond(), triple.getLast()));
                    }
                }

                for (AbstractElement child: ((AbstractThreePhasedElement)element).getChildrenA()) {
                    result.add(new Triple<>(1, child, Phases.A));

                    List<Triple<Integer, AbstractElement, Phases>> childList = childTreeLevelList(child);
                    for (Triple<Integer, AbstractElement, Phases> triple : childList) {
                        result.add(new Triple<>(triple.getFirst() + 1, triple.getSecond(), Phases.A));
                    }
                }

                for (AbstractElement child: ((AbstractThreePhasedElement)element).getChildrenB()) {
                    result.add(new Triple<>(1, child, Phases.B));

                    List<Triple<Integer, AbstractElement, Phases>> childList = childTreeLevelList(child);
                    for (Triple<Integer, AbstractElement, Phases> triple : childList) {
                        result.add(new Triple<>(triple.getFirst() + 1, triple.getSecond(), Phases.B));
                    }
                }

                for (AbstractElement child: ((AbstractThreePhasedElement)element).getChildrenC()) {
                    result.add(new Triple<>(1, child, Phases.C));

                    List<Triple<Integer, AbstractElement, Phases>> childList = childTreeLevelList(child);
                    for (Triple<Integer, AbstractElement, Phases> triple : childList) {
                        result.add(new Triple<>(triple.getFirst() + 1, triple.getSecond(), Phases.C));
                    }
                }
            }
        }
        return result;
    }
}
