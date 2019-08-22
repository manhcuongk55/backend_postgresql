package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(name = "product_modelIdSeq", sequenceName = "product_model_id_seq", allocationSize=1)
public class ProductModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "product_modelIdSeq")
    private Long id;
    private int id_product;
    private int id_model;
    private int created_by_id;
    private Timestamp created_on;
    private int modified_by_id;
    private Timestamp modified_on;


}
