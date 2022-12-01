package visitor;

public interface Visitor {
    void acceptEngine(Engine engine);
    void acceptWheels(Wheels wheels);
}
