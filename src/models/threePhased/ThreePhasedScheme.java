package models.threePhased;

import models.onePhased.AbstractOnePhasedElement;

public class ThreePhasedScheme extends AbstractThreePhasedElement {

    protected ThreePhasedScheme(Builder builder) {
        super(builder);
    }

    @Override
    public boolean addChildrenABC(AbstractThreePhasedElement element) {
        if (this.isHaveChildren()) return false;
        this.childrenABC.add(element);
        return true;
    }

    @Override
    public boolean addChildrenA(AbstractOnePhasedElement element) {
        if (this.isHaveChildren()) return false;
        this.childrenA.add(element);
        return true;
    }

    @Override
    public boolean addChildrenB(AbstractOnePhasedElement element) {
        if (this.isHaveChildren()) return false;
        this.childrenB.add(element);
        return true;
    }

    @Override
    public boolean addChildrenC(AbstractOnePhasedElement element) {
        if (this.isHaveChildren()) return false;
        this.childrenC.add(element);
        return true;
    }

    @Override
    public String toString() {
        return "Схема: " + super.toString();
    }

    public static class Builder extends AbstractThreePhasedElement.Builder {

        @Override
        public ThreePhasedScheme build() {
            return new ThreePhasedScheme(this);
        }
    }
}
