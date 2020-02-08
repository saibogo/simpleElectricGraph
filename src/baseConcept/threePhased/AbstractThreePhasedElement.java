package baseConcept.threePhased;

import baseConcept.AbstractElement;
import baseConcept.onePhased.AbstractOnePhasedElement;

import java.util.ArrayList;
import java.util.List;

public class AbstractThreePhasedElement extends AbstractElement {

    protected List<AbstractThreePhasedElement> childrenABC;
    protected List<AbstractOnePhasedElement> childrenA;
    protected List<AbstractOnePhasedElement> childrenB;
    protected List<AbstractOnePhasedElement> childrenC;

    protected AbstractThreePhasedElement(Builder builder) {
        super(builder);
        this.childrenABC = new ArrayList<>();
        this.childrenA = new ArrayList<>();
        this.childrenB = new ArrayList<>();
        this.childrenC = new ArrayList<>();
    }

    @Override
    public boolean isHaveChildren() {
        return !this.childrenABC.isEmpty() ||
                !this.childrenA.isEmpty() ||
                !this.childrenB.isEmpty() ||
                !this.childrenC.isEmpty();
    }

    @Override
    public List<AbstractElement> getChildren() {
        return new ArrayList<AbstractElement>();
    }

    public List<AbstractThreePhasedElement> getChildrenABC() {
        return new ArrayList<>(this.childrenABC);
    }

    public List<AbstractOnePhasedElement> getChildrenA() {
        return new ArrayList<>(this.childrenA);
    }

    public List<AbstractOnePhasedElement> getChildrenB() {
        return new ArrayList<>(this.childrenB);
    }

    public List<AbstractOnePhasedElement> getChildrenC() {
        return new ArrayList<>(this.childrenC);
    }

    @Override
    public Double getMaximalAmperage() {
        Double result = 0d;
        for (AbstractThreePhasedElement element: this.childrenABC) result += element.getMaximalAmperage();

        Double resultA = 0d;
        for(AbstractOnePhasedElement element: this.childrenA) resultA += element.getMaximalAmperage();

        Double resultB = 0d;
        for(AbstractOnePhasedElement element: this.childrenB) resultB += element.getMaximalAmperage();

        Double resultC = 0d;
        for(AbstractOnePhasedElement element: this.childrenC) resultC += element.getMaximalAmperage();

        result = result + Math.max(resultA, Math.max(resultB, resultC));

        return result;
    }

    @Override
    public boolean addChildren(AbstractElement element) {
        return false;
    }

    public boolean addChildrenABC(AbstractThreePhasedElement element) {
        this.childrenABC.add(element);
        return true;
    }

    public boolean addChildrenA(AbstractOnePhasedElement element) {
        this.childrenA.add(element);
        return true;
    }

    public boolean addChildrenB(AbstractOnePhasedElement element) {
        this.childrenB.add(element);
        return true;
    }

    public boolean addChildrenC(AbstractOnePhasedElement element) {
        this.childrenC.add(element);
        return true;
    }

    public static class Builder extends AbstractElement.Builder {

        @Override
        public AbstractThreePhasedElement build() {
            return new AbstractThreePhasedElement(this);
        }
    }
}
