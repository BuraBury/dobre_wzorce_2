package zadanie27;

public class Main {
    public static void main(String[] args) {

        Joiner<String> a = new Joiner<>();
        a.join(10, "Ala");

        System.out.println();

        Joiner<Double> b = new Joiner<>();
        b.join(5, 2.3);

        System.out.println();

        Joiner<Character> c = new Joiner<>();
        c.join(3, '@');

    }
}
