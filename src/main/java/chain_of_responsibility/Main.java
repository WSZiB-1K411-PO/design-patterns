package chain_of_responsibility;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Chain chain = new AddingChain(new DividingChain(new DividingChain()));

        System.out.println(chain.process(new LinkedList<>(List.of(1.0, 2.0, 3.0, 0.0))).toString());
    }
}
