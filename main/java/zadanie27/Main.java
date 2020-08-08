package zadanie27;

public class Main {
    public static void main(String[] args) {

        String a = new Joiner<>(", ").join("a", "b", "c");
        System.out.println(a);

    }
}
