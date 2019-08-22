package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@SequenceGenerator(name = "documentIdSeq", sequenceName = "documents_id_seq", allocationSize=1)
public class Document implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "documentIdSeq")
    private Long id;
    private String item_number;
    private Timestamp modified_on;
    private String name;
    private String description;
    private Date created_on;
    private int created_by_id;
    private int modified_by_id;
    private String current_state;
    private int locked_by_id;
    private boolean is_current;
    private String minor_rev;
    private boolean not_lockable;
    private boolean is_release;
    private int generation;
    private boolean new_version;
    private int config_id;
    private String permission_id;
    private Timestamp effected_date;
    private Timestamp related_date;
    private String authoring_tool;
    private String authoring_tool_version;
    private boolean has_files;
}
