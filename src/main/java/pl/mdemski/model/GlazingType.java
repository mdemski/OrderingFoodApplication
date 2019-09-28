package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "glazing_types")
public class GlazingType extends AbstractEntity {

    private String name;
    private String type;
    private double height;
    private double width;
    private double ugValue;

    public GlazingType(String name, String type, double height, double width, double ugValue) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.width = width;
        this.ugValue = ugValue;
    }

    public GlazingType() {
    }

    public double getUgValue() {
        return ugValue;
    }

    public void setUgValue(double ugValue) {
        this.ugValue = ugValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
