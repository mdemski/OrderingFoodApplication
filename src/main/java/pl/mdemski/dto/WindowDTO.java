package pl.mdemski.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;

public class WindowDTO {
    private Long id;
    private Long mountingAngleId;
    private Long materialId;
    private Long openingTypeId;
    @Min(value = 98, message = "Nie zrobimy tak niskiego okna")
    @Max(value = 160, message = "Nie zrobimy tak wysokiego okna")
    private int height;
    @Min(value = 47, message = "Nie zrobimy tak wąskiego okna")
    @Max(value = 134, message = "Nie zrobimy tak szerokiego okna")
    private int width;
    private Long glazingTypeId;
    private Long materialColorId;
    private Long handleId;
    private Long flashingNameId;
    private Long ventilatorId;
    private Long creatorId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMountingAngleId() {
        return mountingAngleId;
    }

    public void setMountingAngleId(Long mountingAngleId) {
        this.mountingAngleId = mountingAngleId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Long getOpeningTypeId() {
        return openingTypeId;
    }

    public void setOpeningTypeId(Long openingTypeId) {
        this.openingTypeId = openingTypeId;
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

    public Long getGlazingTypeId() {
        return glazingTypeId;
    }

    public void setGlazingTypeId(Long glazingTypeId) {
        this.glazingTypeId = glazingTypeId;
    }

    public Long getMaterialColorId() {
        return materialColorId;
    }

    public void setMaterialColorId(Long materialColorId) {
        this.materialColorId = materialColorId;
    }

    public Long getHandleId() {
        return handleId;
    }

    public void setHandleId(Long handleId) {
        this.handleId = handleId;
    }

    public Long getFlashingNameId() {
        return flashingNameId;
    }

    public void setFlashingNameId(Long flashingNameId) {
        this.flashingNameId = flashingNameId;
    }

    public Long getVentilatorId() {
        return ventilatorId;
    }

    public void setVentilatorId(Long ventilatorId) {
        this.ventilatorId = ventilatorId;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}
