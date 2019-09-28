package pl.mdemski.dto;

public class MountingAngleDTO {

    private Long id;
    private String name;

    public MountingAngleDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MountingAngleDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
