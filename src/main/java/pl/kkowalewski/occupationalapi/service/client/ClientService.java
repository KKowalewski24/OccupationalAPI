package pl.kkowalewski.occupationalapi.service.client;

import pl.kkowalewski.occupationalapi.model.entity.client.Client;
import pl.kkowalewski.occupationalapi.service.BaseService;

public interface ClientService extends BaseService<Client> {

    Client findByFirstName(String firstName);

    Client findByLastName(String lastName);

    Client findByFullName(String firstName, String lastName);

    Client findByClientIdAndDeveloperId(Long clientId, Long developerId);

    Client findByClientLastNameAndDeveloperLastName(String clientLastName,
                                                    String developerLastName);
}
