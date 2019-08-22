package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@SequenceGenerator(name = "part_alternateIdSeq", sequenceName = "part_alternate_id_seq", allocationSize=1)
public class PartAlternate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "part_alternateIdSeq")
    private Long id;
    private int classification;
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
}
