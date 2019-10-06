package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "glazing_types")
public class GlazingType extends AbstractEntity {

    private String name;
    private String type;
    private double height;
    private double width;
    private double ugValue;
    private String description;
    private byte[] picture;

    public GlazingType(String name, String type, double height, double width, double ugValue, String description, byte[] picture) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.width = width;
        this.ugValue = ugValue;
        this.description = description;
        this.picture = picture;
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
        GlazingType that = (GlazingType) o;
        return Double.compare(that.height, height) == 0 &&
                Double.compare(that.width, width) == 0 &&
                Double.compare(that.ugValue, ugValue) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type) &&
                Objects.equals(description, that.description) &&
                Arrays.equals(picture, that.picture);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), name, type, height, width, ugValue, description);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
