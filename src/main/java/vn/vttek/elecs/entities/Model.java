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
}
