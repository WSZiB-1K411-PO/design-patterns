package composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Button implements MenuElement {
    private final String name;

    @Override
    public void draw(int indentation) {
        for (int i = 0; i < indentation; i++) {
            System.out.print("\t");
        }
        System.out.println(name);
    }
}
