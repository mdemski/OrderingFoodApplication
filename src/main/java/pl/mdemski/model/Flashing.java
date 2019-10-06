package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "flashings")
public class Flashing extends AbstractEntity {

    private String type;
    @ManyToOne
    private MaterialColor colors;
    private double height;
    private double width;
    private String description;
    private byte[] picture;
    private boolean priceList;

    public Flashing(String type, MaterialColor colors, double height, double width, String description, byte[] picture, boolean priceList) {
        this.type = type;
        this.colors = colors;
        this.height = height;
        this.width = width;
        this.description = description;
        this.picture = picture;
        this.priceList = priceList;
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

    public boolean isPriceList() {
        return priceList;
    }

    public void setPriceList(boolean priceList) {
        this.priceList = priceList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flashing flashing = (Flashing) o;
        return Double.compare(flashing.height, height) == 0 &&
                Double.compare(flashing.width, width) == 0 &&
                priceList == flashing.priceList &&
                Objects.equals(type, flashing.type) &&
                Objects.equals(colors, flashing.colors) &&
                Objects.equals(description, flashing.description) &&
                Arrays.equals(picture, flashing.picture);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), type, colors, height, width, description, priceList);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
