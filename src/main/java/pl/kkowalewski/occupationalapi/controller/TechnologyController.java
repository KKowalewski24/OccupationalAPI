package pl.kkowalewski.occupationalapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.service.technology.TechnologyService;

import java.util.Set;

import static pl.kkowalewski.occupationalapi.constant.Constants.PATH_TECHNOLOGIES;

@RestController
public class TechnologyController implements BaseController<Technology> {

    /*------------------------ FIELDS REGION ------------------------*/
    private TechnologyService technologyService;

    /*------------------------ METHODS REGION ------------------------*/
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(PATH_TECHNOLOGIES)
    @Override
    public Set<Technology> getAll() {
        return technologyService.findAll();
    }
}
