package visitor;

public class Engine implements CarElement {

    public void run() {
        System.out.println("Engine is running");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.acceptEngine(this);
    }
}
