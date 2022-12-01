package visitor;

public class SimpleVisitor implements Visitor {
    @Override
    public void acceptEngine(Engine engine) {
        engine.run();
    }

    @Override
    public void acceptWheels(Wheels wheels) {
        wheels.roll();
    }
}
