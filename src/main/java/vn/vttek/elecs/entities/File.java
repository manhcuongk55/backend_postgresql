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
}
