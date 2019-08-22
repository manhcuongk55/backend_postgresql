package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(name = "partIdSeq", sequenceName = "part_id_seq", allocationSize = 1)
public class Part implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "partIdSeq")
    private Long id;
    private int item_number;
    private String name;
    private String description;
    private String category;
    private String manufacturer;
    private int number_manufacturer_res;
    private Timestamp lead_time;
    private String classification;
    private String state;
    private String current_state;
    private String version;
    private int cost;
    private String make_by;
    private String unit;
    private String weight;
    private String thumbnail;
    private int created_by_id;
    private Timestamp created_on;
    private int modified_by_id;
    private Timestamp modified_on;
    private int locked_by_id;
    private boolean not_lockable;
    private int config_id;
    private int generation;
    private Timestamp release_date;
    private Timestamp effective_date;
    private boolean is_released;
    private boolean is_current;
    private String major_rev;
    private boolean has_change_pending;
    private String permission_id;
    private String external_type;
    private int quantity;
    private int sort_order;
    private String reference_designator;
}
