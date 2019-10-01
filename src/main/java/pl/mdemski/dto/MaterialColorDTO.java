package pl.mdemski.dto;

public class MaterialColorDTO {
    private Long id;
    private String ralName;

    public String getRalName() {
        return ralName;
    }

    public void setRalName(String ralName) {
        this.ralName = ralName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
