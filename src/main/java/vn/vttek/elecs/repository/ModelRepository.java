package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.Model;

import javax.transaction.Transactional;

@Repository
public interface ModelRepository extends CrudRepository<Model,Long> {
    
}
