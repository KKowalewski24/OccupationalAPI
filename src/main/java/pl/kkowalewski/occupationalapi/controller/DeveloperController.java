package pl.kkowalewski.occupationalapi.controller;

import org.springframework.web.bind.annotation.RestController;
import pl.kkowalewski.occupationalapi.service.developer.DeveloperService;

@RestController
public class DeveloperController {

    /*------------------------ FIELDS REGION ------------------------*/
    private DeveloperService developerService;

    /*------------------------ METHODS REGION ------------------------*/
    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }
}
    