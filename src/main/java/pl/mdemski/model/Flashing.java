package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "flashings")
public class Flashing extends AbstractEntity {

    private String type;
    private String color; //TODO ta informacja powinna być ustawiana z MaterialColor
    private double height;
    private double width;

    public Flashing(String type, String color, double height, double width) {
        this.type = type;
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public Flashing() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
