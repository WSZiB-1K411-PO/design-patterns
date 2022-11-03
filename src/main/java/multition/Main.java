package multition;

public class Main {
    public static void main(String[] args) {
        String a = "Test";
        String b = "Test";
        String c = new String("Test");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}
