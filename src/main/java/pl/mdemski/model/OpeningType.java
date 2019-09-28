package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "opening_types")
public class OpeningType extends AbstractEntity {

    private String name;

    public OpeningType(String name) {
        this.name = name;
    }

    public OpeningType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
