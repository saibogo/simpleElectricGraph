package models.onePhased;

import models.AbstractElement;

import java.util.ArrayList;
import java.util.List;

public class AbstractOnePhasedElement extends AbstractElement {

    protected List<AbstractOnePhasedElement> children;

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
        if (element instanceof AbstractOnePhasedElement) {
            this.children.add((AbstractOnePhasedElement) element);
            return true;
        } else {
            return false;
        }
    }


    public static class Builder extends AbstractElement.Builder{

        @Override
        public AbstractOnePhasedElement build() {
            return new AbstractOnePhasedElement(this);
        }

    }

}
