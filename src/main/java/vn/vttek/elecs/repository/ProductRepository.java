package vn.vttek.elecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
