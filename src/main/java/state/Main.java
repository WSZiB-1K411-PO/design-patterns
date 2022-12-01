package state;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        PrinterState printerState = new PrinterState();

        Stream.generate(() -> 0)
                .limit(20)
                .forEach(unused -> printerState.print("Ala ma kota"));
    }
}
