package zadanie18;

import java.util.Objects;

public class Laptop extends Computer {
    int battery;

    public Laptop(String processor, String ram, String graphicCard, String firm, String model, int battery) {
        super(processor, ram, graphicCard, firm, model);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery=" + battery + "h" +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
