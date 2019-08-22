package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.MgmtFunction;

import javax.transaction.Transactional;

@Repository
public interface MgmtFunctionRepository extends CrudRepository<MgmtFunction,Long> {
    
}
