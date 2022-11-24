package observer;

public class Main {
    public static void main(String[] args) {
        UpperCasePrinter upperCasePrinter = new UpperCasePrinter();

        Publisher<String> publisher = Publisher.of(new Printer(), new LowerCasePrinter(), upperCasePrinter);

        publisher.publish("Ala ma kota");

        System.out.println();

        publisher.unsubscribe(upperCasePrinter);

        publisher.publish("Kot ma Ale");

        publisher.subscribe(upperCasePrinter);

        System.out.println();

        publisher.publish("Test test test");
    }
}
