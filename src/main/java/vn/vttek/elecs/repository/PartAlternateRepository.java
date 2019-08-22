package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.PartAlternate;

import javax.transaction.Transactional;

@Repository
public interface PartAlternateRepository extends CrudRepository<PartAlternate,Long> {
    
}
