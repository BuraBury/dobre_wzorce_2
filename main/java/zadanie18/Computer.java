package zadanie18;

import java.util.Objects;

public class Computer {
    String processor;
    String ram;
    String graphicCard;
    String firm;
    String model;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) &&
                Objects.equals(ram, computer.ram) &&
                Objects.equals(graphicCard, computer.graphicCard) &&
                Objects.equals(firm, computer.firm) &&
                Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicCard, firm, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", firma='" + firm + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Computer(String processor, String ram, String graphicCard, String firm, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.firm = firm;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraficCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
