package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(name = "productIdSeq", sequenceName = "product_id_seq", allocationSize = 1)
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "productIdSeq")
    private Long id;
    private String item_number;
    private String name;
    private String description;
    private String created_by_id;
    private Timestamp created_on;
    private int modified_by_id;
    private Timestamp modified_on;
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(String created_by_id) {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
