package pl.kkowalewski.occupationalapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;
import pl.kkowalewski.occupationalapi.service.client.ClientService;

import java.util.Set;

import static pl.kkowalewski.occupationalapi.constant.Constants.PATH_CLIENTS;
import static pl.kkowalewski.occupationalapi.constant.Constants.PATH_CLIENTS_PARAM_ID;

@RestController
public class ClientController implements BaseController<Client> {

    /*------------------------ FIELDS REGION ------------------------*/
    private ClientService clientService;

    /*------------------------ METHODS REGION ------------------------*/
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(PATH_CLIENTS)
    @Override
    public Set<Client> getAll() {
        return clientService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(PATH_CLIENTS_PARAM_ID)
    @Override
    public Client getById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @PostMapping(PATH_CLIENTS)
    @Override
    public Client post(Client object) {
        return null;
    }

    @PutMapping(PATH_CLIENTS_PARAM_ID)
    @Override
    public Client put(Long id, Client object) {
        return null;
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(PATH_CLIENTS_PARAM_ID)
    @Override
    public void deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
    }
}
