package observer;

public class LowerCasePrinter implements Subscriber<String> {
    @Override
    public void process(String object) {
        System.out.println(object.toLowerCase());
    }
}
