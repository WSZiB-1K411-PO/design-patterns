package strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GreatestCommonDivider greatestCommonDivider = new GreatestCommonDivider(new BasicIntegerSorter(BasicIntegerSorter.Order.DESC));

        System.out.println(greatestCommonDivider.compute(List.of(10, 3, 9)));
    }
}
