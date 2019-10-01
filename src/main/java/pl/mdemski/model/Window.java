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

    public Window(MountingAngle mountingAngle, Material material, OpeningType openingType, int height, int width, GlazingType glazingType, MaterialColor materialColor, Handle handle, Flashing flashing, Ventilator ventilator) {
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
}
