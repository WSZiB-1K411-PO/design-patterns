package singleton;

import lombok.Setter;

@Setter
public final class SimpleSingleton {
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    public static SimpleSingleton get() {
        return INSTANCE;
    }

    private String text;

    private SimpleSingleton() {
        this.text = "Hello!";
    }

    public void sayText() {
        System.out.println(text);
    }
}
