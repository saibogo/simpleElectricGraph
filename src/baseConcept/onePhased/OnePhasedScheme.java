package baseConcept.onePhased;

import baseConcept.AbstractElement;

public class OnePhasedScheme extends AbstractOnePhasedElement {

    protected OnePhasedScheme(Builder builder) {
        super(builder);
    }

    @Override
    public boolean addChildren(AbstractElement element) {
        if (this.children.size() == 1) return false;
        if (element instanceof AbstractOnePhasedElement) {
            this.children.add((AbstractOnePhasedElement) element);
            return true;
        } else {
            return false;
        }
    }

    public static class Builder extends AbstractOnePhasedElement.Builder {

        @Override
        public OnePhasedScheme build() {
            return new OnePhasedScheme(this);
        }
    }
}
