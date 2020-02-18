package pl.kkowalewski.occupationalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
    