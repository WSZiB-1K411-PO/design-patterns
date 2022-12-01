package visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        accept(List.of(new Engine(), new Wheels()), new SimpleVisitor());
    }

    public static void accept(List<CarElement> elements, Visitor visitor) {
        elements.forEach(carElement -> carElement.accept(visitor));
    }
}
