package pl.kkowalewski.occupationalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;

import java.util.Optional;

@Repository
public interface DeveloperRepository extends CrudRepository<Developer, Long> {

    Optional<Developer> findByFirstName(String firstName);

    Optional<Developer> findByLastName(String lastName);

    Optional<Developer> findByFirstNameAndLastName(String firstName, String lastName);
}
