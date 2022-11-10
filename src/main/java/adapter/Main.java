package adapter;

public class Main {
    public static void main(String[] args) {
        AmericanLamp lamp = new AmericanLamp();
        EuropeanTv tv = new EuropeanTv();

        AmericanPowerOutlet americanPowerOutlet = new AmericanPowerOutlet();
        EuropeanPowerOutlet europeanPowerOutlet = new EuropeanPowerOutlet();

        americanPowerOutlet.givePower(lamp);
        System.out.println();
        americanPowerOutlet.givePower(new EuropeanToAmericanPowerAdapter(tv));
        System.out.println();
        europeanPowerOutlet.givePower(new AmericanToEuropeanPowerAdapter(lamp));
        System.out.println();
        europeanPowerOutlet.givePower(tv);
    }
}
