package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.BomInstance;

import javax.transaction.Transactional;

@Repository
public interface BomInstancetRepository extends CrudRepository<BomInstance, Long> {

}
