package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.Part;

import javax.transaction.Transactional;

@Repository
public interface PartRepository extends CrudRepository<Part,Long> {
    
}
