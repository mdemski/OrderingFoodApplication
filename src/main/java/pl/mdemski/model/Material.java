package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "materials")
public class Material extends AbstractEntity {

    private String name;
    private String description;
    private byte[] picture;

    public Material(String name, String description, byte[] picture) {
        this.name = name;
        this.description = description;
        this.picture = picture;
    }

    public Material() {
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
        Material material = (Material) o;
        return Objects.equals(name, material.name) &&
                Objects.equals(description, material.description) &&
                Arrays.equals(picture, material.picture);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), name, description);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
