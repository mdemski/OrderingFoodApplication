package pl.mdemski.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
    private String dimensions; //rozbić to na wysokość i szerokość
    private String glazingType; //stworzyć osobną encję
    private String materialColor; //stworzyć osobną encję
    private String handle; //stworzyć osobną encję
    @ManyToOne
    private Flashing flashing;
    private String ventilator; //stowrzyć osobną encję


}
