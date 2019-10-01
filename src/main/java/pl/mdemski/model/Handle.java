package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "handles")
public class Handle extends AbstractEntity {

    private String color;
    private String type;

    public Handle(String color, String type) {
        this.color = color;
        this.type = type;
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
