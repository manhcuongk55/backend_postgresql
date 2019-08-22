package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.File;

import javax.transaction.Transactional;

@Repository
public interface FileRepository extends CrudRepository<File,Long> {
    
}