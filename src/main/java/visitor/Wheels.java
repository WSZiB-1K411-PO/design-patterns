package visitor;

public class Wheels implements CarElement {
    public void roll() {
        System.out.println("Wheels are rolling");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.acceptWheels(this);
    }
}
