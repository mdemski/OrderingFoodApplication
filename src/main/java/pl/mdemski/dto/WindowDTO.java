package pl.mdemski.dto;

import pl.mdemski.model.Flashing;

public class WindowDTO {
    private Long id;
    private MountingAngleDTO mountingAngle;
    private MaterialDTO material;
    private OpeningTypeDTO openingType;
    private double height;
    private double width;
    private GlazingTypeDTO glazingType;
    private MaterialColorDTO materialColor;
    private HandleDTO handle;
    private FlashingDTO flashingName;
    private VentilatorDTO ventilator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MountingAngleDTO getMountingAngle() {
        return mountingAngle;
    }

    public void setMountingAngle(MountingAngleDTO mountingAngle) {
        this.mountingAngle = mountingAngle;
    }

    public MaterialDTO getMaterial() {
        return material;
    }

    public void setMaterial(MaterialDTO material) {
        this.material = material;
    }

    public OpeningTypeDTO getOpeningType() {
        return openingType;
    }

    public void setOpeningType(OpeningTypeDTO openingType) {
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

    public GlazingTypeDTO getGlazingType() {
        return glazingType;
    }

    public void setGlazingType(GlazingTypeDTO glazingType) {
        this.glazingType = glazingType;
    }

    public MaterialColorDTO getMaterialColor() {
        return materialColor;
    }

    public void setMaterialColor(MaterialColorDTO materialColor) {
        this.materialColor = materialColor;
    }

    public HandleDTO getHandle() {
        return handle;
    }

    public void setHandle(HandleDTO handle) {
        this.handle = handle;
    }

    public FlashingDTO getFlashingName() {
        return flashingName;
    }

    public void setFlashingName(FlashingDTO flashingName) {
        this.flashingName = flashingName;
    }

    public VentilatorDTO getVentilator() {
        return ventilator;
    }

    public void setVentilator(VentilatorDTO ventilator) {
        this.ventilator = ventilator;
    }
}
