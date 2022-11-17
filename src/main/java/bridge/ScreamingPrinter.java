package bridge;

public class ScreamingPrinter implements Printer {
    @Override
    public void print(String string) {
        System.out.println(string.toUpperCase() + "!");
    }
}
