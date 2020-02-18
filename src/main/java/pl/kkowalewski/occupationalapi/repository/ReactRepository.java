package pl.kkowalewski.occupationalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kkowalewski.occupationalapi.model.entity.technology.React;

@Repository
public interface ReactRepository extends CrudRepository<React, Long> {

}
