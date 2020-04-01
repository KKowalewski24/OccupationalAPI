package pl.kkowalewski.occupationalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kkowalewski.occupationalapi.model.Type;
import pl.kkowalewski.occupationalapi.model.base.Technology;

import java.util.Optional;

@Repository
public interface TechnologyRepository extends CrudRepository<Technology, Long> {

    Optional<Technology> findByName(String name);

    Optional<Technology> findByType(Type type);
}
