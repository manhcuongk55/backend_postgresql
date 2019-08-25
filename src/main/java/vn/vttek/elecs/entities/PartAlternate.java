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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public Date getCreate_on() {
        return create_on;
    }

    public void setCreate_on(Date create_on) {
        this.create_on = create_on;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(String created_by_id) {
        this.created_by_id = created_by_id;
    }

    public Date getModified_on() {
        return modified_on;
    }

    public void setModified_on(Date modified_on) {
        this.modified_on = modified_on;
    }

    public String getModified_by_id() {
        return modified_by_id;
    }

    public void setModified_by_id(String modified_by_id) {
        this.modified_by_id = modified_by_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocked_by_id() {
        return locked_by_id;
    }

    public void setLocked_by_id(String locked_by_id) {
        this.locked_by_id = locked_by_id;
    }

    public String getCurrent_state() {
        return current_state;
    }

    public void setCurrent_state(String current_state) {
        this.current_state = current_state;
    }

    public String getMajor_rev() {
        return major_rev;
    }

    public void setMajor_rev(String major_rev) {
        this.major_rev = major_rev;
    }

    public String getIs_current() {
        return is_current;
    }

    public void setIs_current(String is_current) {
        this.is_current = is_current;
    }

    public String getIs_released() {
        return is_released;
    }

    public void setIs_released(String is_released) {
        this.is_released = is_released;
    }

    public String getNot_lockable() {
        return not_lockable;
    }

    public void setNot_lockable(String not_lockable) {
        this.not_lockable = not_lockable;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(int permission_id) {
        this.permission_id = permission_id;
    }

    public int getConfig_id() {
        return config_id;
    }

    public void setConfig_id(int config_id) {
        this.config_id = config_id;
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

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }
}
