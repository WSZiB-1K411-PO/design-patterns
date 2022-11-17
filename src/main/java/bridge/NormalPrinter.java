package bridge;

public class NormalPrinter implements Printer {
    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
