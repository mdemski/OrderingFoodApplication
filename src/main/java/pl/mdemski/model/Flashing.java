package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "flashings")
public class Flashing extends AbstractEntity {

    private String type;
    @ManyToOne
    private MaterialColor colors;
    private double height;
    private double width;

    public Flashing(String type, MaterialColor colors, double height, double width) {
        this.type = type;
        this.colors = colors;
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

    public MaterialColor getColors() {
        return colors;
    }

    public void setColors(MaterialColor colors) {
        this.colors = colors;
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
