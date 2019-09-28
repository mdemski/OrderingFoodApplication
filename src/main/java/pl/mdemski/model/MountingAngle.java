package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name = "mounting_angles")
public class MountingAngle extends AbstractEntity {
    private String name;

    public MountingAngle(String name) {
        this.name = name;
    }

    public MountingAngle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
