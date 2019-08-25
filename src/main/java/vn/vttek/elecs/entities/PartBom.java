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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCurrent_state() {
        return current_state;
    }

    public void setCurrent_state(String current_state) {
        this.current_state = current_state;
    }

    public Timestamp getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Timestamp created_on) {
        this.created_on = created_on;
    }

    public int getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(int created_by_id) {
        this.created_by_id = created_by_id;
    }

    public Timestamp getModified_on() {
        return modified_on;
    }

    public void setModified_on(Timestamp modified_on) {
        this.modified_on = modified_on;
    }

    public int getLocked_by_id() {
        return locked_by_id;
    }

    public void setLocked_by_id(int locked_by_id) {
        this.locked_by_id = locked_by_id;
    }

    public boolean getNot_lockable() {
        return not_lockable;
    }

    public void setNot_lockable(boolean not_lockable) {
        this.not_lockable = not_lockable;
    }

    public Timestamp getSuperseded_date() {
        return superseded_date;
    }

    public void setSuperseded_date(Timestamp superseded_date) {
        this.superseded_date = superseded_date;
    }

    public int getConfig_id() {
        return config_id;
    }

    public void setConfig_id(int config_id) {
        this.config_id = config_id;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public boolean getIs_released() {
        return is_released;
    }

    public void setIs_released(boolean is_released) {
        this.is_released = is_released;
    }

    public boolean getIs_current() {
        return is_current;
    }

    public void setIs_current(boolean is_current) {
        this.is_current = is_current;
    }

    public String getMajor_rev() {
        return major_rev;
    }

    public void setMajor_rev(String major_rev) {
        this.major_rev = major_rev;
    }

    public String getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(String permission_id) {
        this.permission_id = permission_id;
    }

    public String getExternal_type() {
        return external_type;
    }

    public void setExternal_type(String external_type) {
        this.external_type = external_type;
    }

    public int getSource_id() {
        return source_id;
    }

    public void setSource_id(int source_id) {
        this.source_id = source_id;
    }

    public int getRelated_id() {
        return related_id;
    }

    public void setRelated_id(int related_id) {
        this.related_id = related_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSort_ordered() {
        return sort_ordered;
    }

    public void setSort_ordered(int sort_ordered) {
        this.sort_ordered = sort_ordered;
    }

    public String getReference_designator() {
        return reference_designator;
    }

    public void setReference_designator(String reference_designator) {
        this.reference_designator = reference_designator;
    }
}
