package state;

public class LowerCasePrinter implements Printer {
    @Override
    public Printer print(String message) {
        System.out.println(message.toLowerCase());
        return new NormalPrinter();
    }
}
