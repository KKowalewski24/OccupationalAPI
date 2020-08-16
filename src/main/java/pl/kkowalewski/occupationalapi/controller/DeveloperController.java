package pl.kkowalewski.occupationalapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;
import pl.kkowalewski.occupationalapi.service.developer.DeveloperService;

import java.util.Set;

import static pl.kkowalewski.occupationalapi.constant.Constants.PATH_DEVELOPERS;
import static pl.kkowalewski.occupationalapi.constant.Constants.PATH_DEVELOPERS_PARAM_ID;

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

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(PATH_DEVELOPERS_PARAM_ID)
    @Override
    public Developer getById(@PathVariable Long id) {
        return developerService.findById(id);
    }

    @PostMapping(PATH_DEVELOPERS)
    @Override
    public Developer post(Developer object) {
        return null;
    }

    @PutMapping(PATH_DEVELOPERS_PARAM_ID)
    @Override
    public Developer put(Long id, Developer object) {
        return null;
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(PATH_DEVELOPERS_PARAM_ID)
    @Override
    public void deleteById(@PathVariable Long id) {
        developerService.deleteById(id);
    }
}
