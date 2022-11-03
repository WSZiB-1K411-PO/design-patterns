package builder;

public class Main {
    public static void main(String[] args) {
        String first = "first";
        String second = "second";
        String third = "third";

        new FancyClass(third, first, second, null, third, second, null, third, first, third);

        FancyClass.builder()
                .a(third)
                .b(first)
                .c(second)
                .d(null)
                .e(third)
                .f(second)
                .g(null)
                .h(third)
                .i(first)
                .j(third)
                .build();

        FancyClass.fancyBuilder()
                .a(third)
                .e(third)
                .h(third)
                .d(first)
                .build();
    }
}
