package state;

public class UpperCasePrinter implements Printer {
    @Override
    public Printer print(String message) {
        System.out.println(message.toUpperCase());
        return new NormalPrinter();
    }
}
