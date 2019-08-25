package vn.vttek.elecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.Part;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {

}
