package singleton;

import lombok.Setter;

public enum Singleton {
    INSTANCE;

    private String text;

    private Singleton() {
        this.text = "Hello!";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void sayText() {
        System.out.println(text);
    }
}
