package facade;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Cashier cashier = new Cashier();
        AutomaticDoor automaticDoor = new AutomaticDoor();

        BunsTripFacade bunsTripFacade = new BunsTripFacade(human, cashier, automaticDoor);

        bunsTripFacade.buyBuns();
    }
}
