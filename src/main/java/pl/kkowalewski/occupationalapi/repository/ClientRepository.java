package pl.kkowalewski.occupationalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    Optional<Client> findByFirstName(String firstName);

    Optional<Client> findByLastName(String lastName);

    Optional<Client> findByFirstNameAndLastName(String firstName, String lastName);
}
    