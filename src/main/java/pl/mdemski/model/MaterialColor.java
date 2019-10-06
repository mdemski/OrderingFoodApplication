package pl.mdemski.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "material_color")
public class MaterialColor extends AbstractEntity {

    private String RAL;
    private String description;
    private byte[] picture;

    public MaterialColor(String RAL, String description, byte[] picture) {
        this.RAL = RAL;
        this.description = description;
        this.picture = picture;
    }

    public MaterialColor() {
    }

    public String getRAL() {
        return RAL;
    }

    public void setRAL(String RAL) {
        this.RAL = RAL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MaterialColor that = (MaterialColor) o;
        return Objects.equals(RAL, that.RAL) &&
                Objects.equals(description, that.description) &&
                Arrays.equals(picture, that.picture);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), RAL, description);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
