package composite;

public class Main {
    public static void main(String[] args) {
        Button home = new Button("Home");

        Menu menu = new Menu(
                "Main Menu",
                new Button("Home"),
                new Menu(
                        "Offer",
                        new Button("Items 1"),
                        new Button("Items 2")
                ),
                new Button("Contact")
        );

        print(home);
        System.out.println();
        print(menu);
    }

    public static void print(MenuElement element) {
        element.draw(0);
    }
}
