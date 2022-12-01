package state;

public class PrinterState {
    private Printer state = new NormalPrinter();

    public void print(String message) {
        state = state.print(message);
    }
}
