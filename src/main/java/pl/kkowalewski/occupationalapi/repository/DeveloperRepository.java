package pl.kkowalewski.occupationalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;

@Repository
public interface DeveloperRepository extends CrudRepository<Developer, Long> {

}
