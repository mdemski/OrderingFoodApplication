package pl.mdemski.model;

public class Handle extends AbstractEntity {

    private String color;
    private String type;

    public Handle(String color, String type) {
    }

    public Handle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
