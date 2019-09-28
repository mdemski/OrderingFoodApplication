package pl.mdemski.dto;

import pl.mdemski.model.Flashing;

public class WindowDTO {
    private Long id;
    private String mountingAngle;
    private String material;
    private String openingType;
    private String dimensions;
    private String glazingType;
    private String materialColor;
    private String handle;
    private String flashingName;
    private String ventilator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMountingAngle() {
        return mountingAngle;
    }

    public void setMountingAngle(String mountingAngle) {
        this.mountingAngle = mountingAngle;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOpeningType() {
        return openingType;
    }

    public void setOpeningType(String openingType) {
        this.openingType = openingType;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getGlazingType() {
        return glazingType;
    }

    public void setGlazingType(String glazingType) {
        this.glazingType = glazingType;
    }

    public String getMaterialColor() {
        return materialColor;
    }

    public void setMaterialColor(String materialColor) {
        this.materialColor = materialColor;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getFlashingName() {
        return flashingName;
    }

    public void setFlashingName(String flashingName) {
        this.flashingName = flashingName;
    }

    public String getVentilator() {
        return ventilator;
    }

    public void setVentilator(String ventilator) {
        this.ventilator = ventilator;
    }
}
