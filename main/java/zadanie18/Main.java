package zadanie18;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("IntelCore i5", "16GB", "AMD PowerColor", "Apple", "MacBook");
        Computer computer1 = new Laptop("IntelCore i7", "24GB", "AMD PowerColor", "Asus", "ZenBook", 10);
        Computer computer2 = new Laptop("IntelCore i7", "24GB", "AMD PowerColor", "Asus", "ZenBook", 11);

        Computer laptop = new Laptop("IntelCore i6", "16GB", "NVIDA", "Lenovo", "Legion5", 13);

        System.out.println(computer.toString());
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        System.out.println(laptop.toString());

        System.out.println();

        System.out.println(computer.equals(computer1));
        System.out.println(computer1.equals(computer2));



    }
}
