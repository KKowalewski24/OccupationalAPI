package pl.kkowalewski.occupationalapi.service.client;

import org.springframework.stereotype.Service;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;
import pl.kkowalewski.occupationalapi.repository.ClientRepository;

import java.util.Set;

@Service
public class ClientServiceImpl implements ClientService {

    /*------------------------ FIELDS REGION ------------------------*/
    private final ClientRepository clientRepository;

    /*------------------------ METHODS REGION ------------------------*/
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public Set<Client> findAll() {
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

    }
}
    