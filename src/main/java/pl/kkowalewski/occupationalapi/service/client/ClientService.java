package pl.kkowalewski.occupationalapi.service.client;

import pl.kkowalewski.occupationalapi.model.entity.client.Client;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;
import pl.kkowalewski.occupationalapi.service.BaseService;

public interface ClientService extends BaseService<Client> {

    Developer findByFirstName(String firstName);

    Developer findByLastName(String lastName);

    Developer findByFullName(String firstName, String lastName);
}
