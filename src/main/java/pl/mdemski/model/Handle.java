package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "handles")
public class Handle extends AbstractEntity {

    private String color;
    private String type;
    private String description;
    private byte[] picture;

    public Handle(String color, String type, String description, byte[] picture) {
        this.color = color;
        this.type = type;
        this.description = description;
        this.picture = picture;
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
        Handle handle = (Handle) o;
        return Objects.equals(color, handle.color) &&
                Objects.equals(type, handle.type) &&
                Objects.equals(description, handle.description) &&
                Arrays.equals(picture, handle.picture);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), color, type, description);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
