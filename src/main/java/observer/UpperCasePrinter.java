package observer;

public class UpperCasePrinter implements Subscriber<String> {
    @Override
    public void process(String object) {
        System.out.println(object.toUpperCase());
    }
}
