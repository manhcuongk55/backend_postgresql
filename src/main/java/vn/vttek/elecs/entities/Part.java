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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getItem_number() {
        return item_number;
    }

    public void setItem_number(int item_number) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumber_manufacturer_res() {
        return number_manufacturer_res;
    }

    public void setNumber_manufacturer_res(int number_manufacturer_res) {
        this.number_manufacturer_res = number_manufacturer_res;
    }

    public Timestamp getLead_time() {
        return lead_time;
    }

    public void setLead_time(Timestamp lead_time) {
        this.lead_time = lead_time;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getMake_by() {
        return make_by;
    }

    public void setMake_by(String make_by) {
        this.make_by = make_by;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(int created_by_id) {
        this.created_by_id = created_by_id;
    }

    public Timestamp getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Timestamp created_on) {
        this.created_on = created_on;
    }

    public int getModified_by_id() {
        return modified_by_id;
    }

    public void setModified_by_id(int modified_by_id) {
        this.modified_by_id = modified_by_id;
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

    public Timestamp getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Timestamp release_date) {
        this.release_date = release_date;
    }

    public Timestamp getEffective_date() {
        return effective_date;
    }

    public void setEffective_date(Timestamp effective_date) {
        this.effective_date = effective_date;
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

    public boolean getHas_change_pending() {
        return has_change_pending;
    }

    public void setHas_change_pending(boolean has_change_pending) {
        this.has_change_pending = has_change_pending;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }

    public String getReference_designator() {
        return reference_designator;
    }

    public void setReference_designator(String reference_designator) {
        this.reference_designator = reference_designator;
    }
}
