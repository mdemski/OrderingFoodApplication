package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "ventilators")
public class Ventilator extends AbstractEntity {

    private String name;
    private String description;
    private byte[] picture;

    public Ventilator(String name, String description, byte[] picture) {
        this.name = name;
        this.description = description;
        this.picture = picture;
    }

    public Ventilator() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Ventilator that = (Ventilator) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Arrays.equals(picture, that.picture);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), name, description);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
