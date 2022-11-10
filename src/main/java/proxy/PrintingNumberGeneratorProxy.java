package proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintingNumberGeneratorProxy implements NumberGenerator {
    private final NumberGenerator generator;
    @Override
    public int getRandomNumber() {
        int randomNumber = generator.getRandomNumber();
        System.out.println("Random number: " + randomNumber);
        return randomNumber;
    }
}
