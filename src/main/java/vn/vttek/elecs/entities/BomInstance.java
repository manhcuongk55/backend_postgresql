package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@SequenceGenerator(name = "bom_instanceIdSeq", sequenceName = "bom_instance_id_seq", allocationSize = 1)
public class BomInstance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "bom_instanceIdSeq")
    private Long id;
    private int classification;
    private String keyed_name;
    private String owner_by_id;
    private Date create_on;
    private String manufacturer;
    private String created_by_id;
    private Date modified_on;
    private String modified_by_id;
    private String state;
    private String locked_by_id;
    private String current_state;
    private String major_rev;
    private String is_current;
    private String is_released;
    private String not_lockable;
    private int generation;
    private int permission_id;
    private int config_id;
    private int source_id;
    private int related_id;
    private int sort_order;
    private float y;
    private float z;
    private float x;
    private String reference_designator;
    private String side;
    private float angle;
    private String behavior;
    private String team_id;
    private String new_version;
    private String css;
    private String minor_rev;
    private String manager_by_id;
}
