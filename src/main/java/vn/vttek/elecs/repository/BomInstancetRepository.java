package vn.vttek.elecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.BomInstance;

import javax.transaction.Transactional;

@Repository
public interface BomInstancetRepository extends JpaRepository<BomInstance, Long> {

}
