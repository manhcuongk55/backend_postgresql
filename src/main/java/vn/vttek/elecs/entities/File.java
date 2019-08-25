package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@SequenceGenerator(name = "fileIdSeq", sequenceName = "file_id_seq", allocationSize=1)
public class File implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "fileIdSeq")
    private Long id;
    private int par_id;
    private String code;
    private String name;
    private String description;
    private Date created_on;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPar_id() {
        return par_id;
    }

    public void setPar_id(int par_id) {
        this.par_id = par_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
}
