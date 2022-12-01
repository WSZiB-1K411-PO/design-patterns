package memento;

public class Main {
    public static void main(String[] args) {
        RollbackNumber number = new RollbackNumber();

        System.out.println(number);
        number.add(5);
        System.out.println(number);
        number.sub(1);
        System.out.println(number);
        number.rollback();
        System.out.println(number);
        number.rollback();
        System.out.println(number);
    }
}
