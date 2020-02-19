package pl.kkowalewski.occupationalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kkowalewski.occupationalapi.model.base.Technology;

@Repository
public interface TechnologyRepository extends CrudRepository<Technology, Long> {

}
