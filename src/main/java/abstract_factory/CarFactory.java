package abstract_factory;

public interface CarFactory {
    Car produce(String type, EngineType engineType);
}
