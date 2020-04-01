package pl.kkowalewski.occupationalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kkowalewski.occupationalapi.model.Type;
import pl.kkowalewski.occupationalapi.model.base.Technology;

import java.util.Set;

@Repository
public interface TechnologyRepository extends CrudRepository<Technology, Long> {

    Set<Technology> findByName(String name);

    Set<Technology> findByType(Type type);
}
