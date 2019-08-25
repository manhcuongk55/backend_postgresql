package vn.vttek.elecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.PartBom;

@Repository
public interface PartBomRepository extends JpaRepository<PartBom,Long> {
    
}
