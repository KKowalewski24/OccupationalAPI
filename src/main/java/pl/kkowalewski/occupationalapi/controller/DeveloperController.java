package pl.kkowalewski.occupationalapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;
import pl.kkowalewski.occupationalapi.service.developer.DeveloperService;

import java.util.Set;

import static pl.kkowalewski.occupationalapi.constant.Constants.PATH_DEVELOPERS;

@RestController
public class DeveloperController implements BaseController<Developer> {

    /*------------------------ FIELDS REGION ------------------------*/
    private DeveloperService developerService;

    /*------------------------ METHODS REGION ------------------------*/
    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(PATH_DEVELOPERS)
    @Override
    public Set<Developer> getAll() {
        return developerService.findAll();
    }
}
