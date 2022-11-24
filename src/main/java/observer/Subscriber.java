package observer;

public interface Subscriber<T> {
    void process(T object);
}
