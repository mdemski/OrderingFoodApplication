package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "windows")
public class Window extends AbstractEntity {
    @ManyToOne
    private MountingAngle mountingAngle;
    @ManyToOne
    private Material material;
    @ManyToOne
    private OpeningType openingType;
    private double height;
    private double width;
    @ManyToOne
    private GlazingType glazingType;
    @ManyToOne
    private MaterialColor materialColor;
    @ManyToOne
    private String handle;
    @ManyToOne
    private Flashing flashing;
    @ManyToOne
    private Ventilator ventilator;

    public Window(MountingAngle mountingAngle, Material material, OpeningType openingType, double height, double width, GlazingType glazingType, MaterialColor materialColor, String handle, Flashing flashing, Ventilator ventilator) {
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

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
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
}
