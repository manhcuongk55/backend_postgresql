package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.GroupUser;

import javax.transaction.Transactional;

@Repository
public interface GroupUserRepository extends CrudRepository<GroupUser,Long> {
    
}
