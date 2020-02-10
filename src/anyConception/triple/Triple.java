package anyConception.triple;

public class Triple<T, E, P> {

    private T first;
    private E second;
    private P last;

    public Triple(final T first, final E second, final P last) {
        this.first = first;
        this.second = second;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public P getLast() {
        return last;
    }
}
