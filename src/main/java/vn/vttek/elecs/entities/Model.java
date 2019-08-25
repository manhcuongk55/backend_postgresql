package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "modelIdSeq", sequenceName = "model_id_seq", allocationSize=1)
public class Model implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "modelIdSeq")
    private Long id;
    private int id_part_number;
    private String item_number;
    private String name;
    private String description;
    private String version_number;
    private String release_number;
    private int created_by_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_part_number() {
        return id_part_number;
    }

    public void setId_part_number(int id_part_number) {
        this.id_part_number = id_part_number;
    }

    public String getItem_number() {
        return item_number;
    }

    public void setItem_number(String item_number) {
        this.item_number = item_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion_number() {
        return version_number;
    }

    public void setVersion_number(String version_number) {
        this.version_number = version_number;
    }

    public String getRelease_number() {
        return release_number;
    }

    public void setRelease_number(String release_number) {
        this.release_number = release_number;
    }

    public int getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(int created_by_id) {
        this.created_by_id = created_by_id;
    }
}
