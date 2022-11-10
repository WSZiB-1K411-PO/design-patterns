package decorator;

public class Main {
    public static void main(String[] args) {
        ImmutableNumber immutableNumber = new ImmutableNumber(6);
        ColoredNumber coloredNumber = new ColoredNumber(3, "Yellow");

        showNumber(immutableNumber);
        showNumber(coloredNumber);

        //showColoredNumber(immutableNumber);
        showColoredNumber(coloredNumber);
    }

    public static void showNumber(Number number) {
        System.out.println(number.get());
    }

    public static void showColoredNumber(ColoredNumber number) {
        System.out.println(number.getColor() + " - " + number.get());
    }
}
