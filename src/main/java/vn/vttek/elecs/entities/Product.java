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


}
