package pl.kkowalewski.occupationalapi.controller;

import org.springframework.web.bind.annotation.RestController;
import pl.kkowalewski.occupationalapi.service.client.ClientService;

@RestController
public class ClientController {

    /*------------------------ FIELDS REGION ------------------------*/
    private ClientService clientService;

    /*------------------------ METHODS REGION ------------------------*/
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
}
    