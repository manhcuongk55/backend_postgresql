package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.Department;

import javax.transaction.Transactional;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {
    
}
