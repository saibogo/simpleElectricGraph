package baseConcepts;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOnePhasedElements extends AbstractElement {

    protected List<AbstractOnePhasedElements> children;

    public AbstractOnePhasedElements(final String name,final String description) {
        super(name, description);
        this.children = new ArrayList<>();
    }

    public List<AbstractOnePhasedElements> getChildren() {
        return new ArrayList<>(this.children);
    }

    @Override
    public boolean haveChildren() {
        return !this.children.isEmpty();
    }

    public boolean addChild(AbstractOnePhasedElements element) {
        this.children.add(element);
        return true;
    }

    public abstract Double getAmperage();
}
