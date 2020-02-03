package baseConcept.onePhased;

import baseConcept.AbstractElement;

public class OnePhasedScheme extends AbstractOnePhasedElement {

    protected OnePhasedScheme(Builder builder) {
        super(builder);
    }

    @Override
    public boolean addChildren(AbstractElement element) {
        if (this.children.size() == 1) return false;

        this.children.add(element);
        return true;
    }

    public static class Builder extends AbstractOnePhasedElement.Builder {

        @Override
        public OnePhasedScheme build() {
            return new OnePhasedScheme(this);
        }
    }
}
