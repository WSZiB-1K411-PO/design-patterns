package bridge;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NormalPrinter normalPrinter = new NormalPrinter();
        ScreamingPrinter screamingPrinter = new ScreamingPrinter();

        use(normalPrinter);
        use(screamingPrinter);
    }

    public static void use(Printer printer) {
        new ListStringGenerator(printer, List.of("Ala", "ma", "kota")).printNext();
        new RandomStringGenerator(printer).printNext();
    }
}
