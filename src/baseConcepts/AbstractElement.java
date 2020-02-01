package baseConcepts;


public abstract class AbstractElement {
    //Properties and methods for all elements

    protected String name;
    protected String description;

    public AbstractElement(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract boolean haveChildren();
}
