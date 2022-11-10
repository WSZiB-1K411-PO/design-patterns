package proxy;

public class Main {
    public static void main(String[] args) {
        BasicNumberGenerator generator = new BasicNumberGenerator();

        generateAndDisplay(new PrintingNumberGeneratorProxy(generator));
    }

    public static void generateAndDisplay(NumberGenerator generator) {
        System.out.println(generator.getRandomNumber());
    }
}
