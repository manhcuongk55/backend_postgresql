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
}
