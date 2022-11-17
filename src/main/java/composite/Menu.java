package composite;

import java.util.List;

public class Menu implements MenuElement{
    private final String name;
    private final List<MenuElement> elements;


    public Menu(String name, MenuElement... elements) {
        this.name = name;
        this.elements = List.of(elements);
    }

    @Override
    public void draw(int indentation) {
        for (int i = 0; i < indentation; i++) {
            System.out.print("\t");
        }
        System.out.println(name);

        elements.forEach(menuElement -> menuElement.draw(indentation + 1));
    }
}
