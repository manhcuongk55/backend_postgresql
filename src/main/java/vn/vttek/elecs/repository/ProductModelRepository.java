package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.ProductModel;

import javax.transaction.Transactional;

@Repository
public interface ProductModelRepository extends CrudRepository<ProductModel,Long> {
    
}
