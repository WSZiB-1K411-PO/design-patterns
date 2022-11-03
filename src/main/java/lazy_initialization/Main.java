package lazy_initialization;

public class Main {
    public static void main(String[] args) {
        NumberService heavyService = new LazyService();

        //System.out.println(heavyService.getA());
        System.out.println(heavyService.getB());
    }
}
