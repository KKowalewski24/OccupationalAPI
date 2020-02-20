package pl.kkowalewski.occupationalapi.controller;

import org.springframework.web.bind.annotation.RestController;
import pl.kkowalewski.occupationalapi.service.technology.TechnologyService;

@RestController
public class TechnologyController {

    /*------------------------ FIELDS REGION ------------------------*/
    private TechnologyService technologyService;

    /*------------------------ METHODS REGION ------------------------*/
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }
}
    