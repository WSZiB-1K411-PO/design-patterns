package observer;

public class Printer implements Subscriber<String> {
    @Override
    public void process(String object) {
        System.out.println(object);
    }
}
