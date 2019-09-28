package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "material_color")
public class MaterialColor extends AbstractEntity {

    private String RAL;

    public MaterialColor(String RAL) {
        this.RAL = RAL;
    }

    public MaterialColor() {
    }

    public String getRAL() {
        return RAL;
    }

    public void setRAL(String RAL) {
        this.RAL = RAL;
    }
}
