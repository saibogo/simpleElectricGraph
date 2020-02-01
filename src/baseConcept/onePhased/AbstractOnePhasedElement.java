package baseConcept.onePhased;

import baseConcept.AbstractElement;

import java.util.ArrayList;
import java.util.List;

public class AbstractOnePhasedElement extends AbstractElement {

    protected List<AbstractElement> children;

    protected AbstractOnePhasedElement(Builder builder) {
        super(builder);
        this.children = new ArrayList<>();
    }


    @Override
    public boolean isHaveChildren() {
        return !this.children.isEmpty();
    }

    @Override
    public List<AbstractElement> getChildren() {
        return new ArrayList<>(this.children);
    }

    @Override
    public Double getMaximalAmperage() {
        Double result = 0d;
        for (AbstractElement element: this.children) result += element.getMaximalAmperage();
        return result;
    }

    @Override
    public boolean addChildren(AbstractElement element) {
        this.children.add(element);
        return true;
    }


    public static class Builder extends AbstractElement.Builder{

        @Override
        public AbstractOnePhasedElement build() {
            return new AbstractOnePhasedElement(this);
        }

    }

}
