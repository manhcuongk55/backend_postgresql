package vn.vttek.elecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

}
