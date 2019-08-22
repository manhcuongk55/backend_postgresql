package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.Product;

import javax.transaction.Transactional;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

    
}
