package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "windows")
public class Window extends AbstractEntity {
    @ManyToOne
    private MountingAngle mountingAngle;
    @ManyToOne
    private Material material;
    @ManyToOne
    private OpeningType openingType;
    private int height;
    private int width;
    @ManyToOne
    private GlazingType glazingType;
    @ManyToOne
    private MaterialColor materialColor;
    @ManyToOne
    private Handle handle;
    @ManyToOne
    private Flashing flashing;
    @ManyToOne
    private Ventilator ventilator;
    @ManyToOne
    private User user;
    private LocalDateTime created;
    private String description;
    private byte[] picture;
    private double price;
    private boolean priceList;
    private String name;

    public Window(MountingAngle mountingAngle, Material material, OpeningType openingType, int height, int width, GlazingType glazingType, MaterialColor materialColor, Handle handle, Flashing flashing, Ventilator ventilator, User user, LocalDateTime created, String description, byte[] picture, double price, boolean priceList, String name) {
        this.mountingAngle = mountingAngle;
        this.material = material;
        this.openingType = openingType;
        this.height = height;
        this.width = width;
        this.glazingType = glazingType;
        this.materialColor = materialColor;
        this.handle = handle;
        this.flashing = flashing;
        this.ventilator = ventilator;
        this.user = user;
        this.created = created;
        this.description = description;
        this.picture = picture;
        this.price = price;
        this.priceList = priceList;
        this.name = name;
    }

    public Window() {
    }

    public MountingAngle getMountingAngle() {
        return mountingAngle;
    }

    public void setMountingAngle(MountingAngle mountingAngle) {
        this.mountingAngle = mountingAngle;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public OpeningType getOpeningType() {
        return openingType;
    }

    public void setOpeningType(OpeningType openingType) {
        this.openingType = openingType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public GlazingType getGlazingType() {
        return glazingType;
    }

    public void setGlazingType(GlazingType glazingType) {
        this.glazingType = glazingType;
    }

    public MaterialColor getMaterialColor() {
        return materialColor;
    }

    public void setMaterialColor(MaterialColor materialColor) {
        this.materialColor = materialColor;
    }

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public Flashing getFlashing() {
        return flashing;
    }

    public void setFlashing(Flashing flashing) {
        this.flashing = flashing;
    }

    public Ventilator getVentilator() {
        return ventilator;
    }

    public void setVentilator(Ventilator ventilator) {
        this.ventilator = ventilator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPriceList() {
        return priceList;
    }

    public void setPriceList(boolean priceList) {
        this.priceList = priceList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Window window = (Window) o;
        return height == window.height &&
                width == window.width &&
                Double.compare(window.price, price) == 0 &&
                priceList == window.priceList &&
                Objects.equals(mountingAngle, window.mountingAngle) &&
                Objects.equals(material, window.material) &&
                Objects.equals(openingType, window.openingType) &&
                Objects.equals(glazingType, window.glazingType) &&
                Objects.equals(materialColor, window.materialColor) &&
                Objects.equals(handle, window.handle) &&
                Objects.equals(flashing, window.flashing) &&
                Objects.equals(ventilator, window.ventilator) &&
                Objects.equals(user, window.user) &&
                Objects.equals(created, window.created) &&
                Objects.equals(description, window.description) &&
                Arrays.equals(picture, window.picture) &&
                Objects.equals(name, window.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), mountingAngle, material, openingType, height, width, glazingType, materialColor, handle, flashing, ventilator, user, created, description, price, priceList, name);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
