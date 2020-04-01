package pl.kkowalewski.occupationalapi.service.client;

import org.springframework.stereotype.Service;
import pl.kkowalewski.occupationalapi.exception.service.ClientNotFoundException;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;
import pl.kkowalewski.occupationalapi.repository.ClientRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ClientServiceImpl implements ClientService {

    /*------------------------ FIELDS REGION ------------------------*/
    private final ClientRepository clientRepository;

    //TODO ADD IMPL
    /*------------------------ METHODS REGION ------------------------*/
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findByFirstName(String firstName) {
        Optional<Client> client = clientRepository.findByFirstName(firstName);

        if (client.isEmpty()) {
            throw new ClientNotFoundException();
        }

        return client.get();
    }

    @Override
    public Client findByLastName(String lastName) {
        Optional<Client> client = clientRepository.findByLastName(lastName);

        if (client.isEmpty()) {
            throw new ClientNotFoundException();
        }

        return client.get();

    }

    @Override
    public Client findByFullName(String firstName, String lastName) {
        Optional<Client> client = clientRepository.findByFirstNameAndLastName(firstName, lastName);

        if (client.isEmpty()) {
            throw new ClientNotFoundException();
        }

        return client.get();

    }

    @Override
    public Client findById(Long id) {
        Optional<Client> client = clientRepository.findById(id);

        if (client.isEmpty()) {
            throw new ClientNotFoundException();
        }

        return client.get();
    }

    @Override
    public Set<Client> findAll() {
        Set<Client> clients = new HashSet<>();

        return null;
    }

    @Override
    public Client save(Client object) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Client object) {

    }

    @Override
    public void deleteAll() {
        clientRepository.deleteAll();
    }
}
    