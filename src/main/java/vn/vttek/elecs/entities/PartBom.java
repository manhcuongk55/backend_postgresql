package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(name = "part_bomIdSeq", sequenceName = "part_bom_id_seq", allocationSize = 1)
public class PartBom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "part_bomIdSeq")
    private Long id;
    private String classification;
    private String state;
    private String current_state;
    private Timestamp created_on;
    private int created_by_id;
    private Timestamp modified_on;
    private int locked_by_id;
    private boolean not_lockable;
    private Timestamp superseded_date;
    private int config_id;
    private int generation;
    private boolean is_released;
    private boolean is_current;
    private String major_rev;
    private String permission_id;
    private String external_type;
    private int source_id;
    private int related_id;
    private int quantity;
    private int sort_ordered;
    private String reference_designator;

}
