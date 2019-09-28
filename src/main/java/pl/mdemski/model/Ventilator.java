package pl.mdemski.model;

public class Ventilator extends AbstractEntity {

    private String name;

    public Ventilator(String name) {
        this.name = name;
    }

    public Ventilator() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
