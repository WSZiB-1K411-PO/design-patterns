package observer;

import java.util.LinkedList;
import java.util.List;

public class Publisher<T> {
    public static <V> Publisher<V> of(Subscriber<V>... subscribers) {
        Publisher<V> publisher = new Publisher<>();
        List.of(subscribers).forEach(publisher::subscribe);

        return publisher;
    }

    private final List<Subscriber<T>> subscribers = new LinkedList<>();

    public void subscribe(Subscriber<T> subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber<T> subscriber) {
        subscribers.remove(subscriber);
    }

    public void publish(T object) {
        subscribers.forEach(subscriber -> subscriber.process(object));
    }
}
