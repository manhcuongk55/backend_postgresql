package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.PartBom;

import javax.transaction.Transactional;

@Repository
public interface PartBomRepository extends CrudRepository<PartBom,Long> {
    
}
