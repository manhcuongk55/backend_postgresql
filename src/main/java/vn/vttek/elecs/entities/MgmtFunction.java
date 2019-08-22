package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(name = "mgmt_functionIdSeq", sequenceName = "mgmt_fucntion_id_seq", allocationSize = 1)
public class MgmtFunction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "mgmt_functionIdSeq")
    private Long id;
    private String name;
    private String remark;
    private Timestamp created_on;
    private String state;


}
