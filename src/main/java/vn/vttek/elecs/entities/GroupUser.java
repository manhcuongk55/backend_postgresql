package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@SequenceGenerator(name = "group_userIdSeq", sequenceName = "group_user_id_seq", allocationSize=1)
public class GroupUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "group_userIdSeq")
    private Long id;
    private String permission;
    private String group_name;
    private Date created_on;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
}
