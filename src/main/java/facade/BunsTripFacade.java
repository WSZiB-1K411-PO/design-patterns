package facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BunsTripFacade {
    private final Human human;
    private final Cashier cashier;
    private final AutomaticDoor automaticDoor;

    public void buyBuns() {
        human.goToShop();
        automaticDoor.open();
        automaticDoor.close();
        human.takeBuns();
        cashier.scanBuns();
        human.pay();
        cashier.takeMoney();
        cashier.giveRecipient();
        automaticDoor.open();
        automaticDoor.close();
        human.goHome();
    }
}
