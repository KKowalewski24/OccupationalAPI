package pl.kkowalewski.occupationalapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.service.technology.TechnologyService;

import java.util.Set;

import static pl.kkowalewski.occupationalapi.constant.Constants.PATH_TECHNOLOGIES;
import static pl.kkowalewski.occupationalapi.constant.Constants.PATH_TECHNOLOGIES_PARAM_ID;

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

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(PATH_TECHNOLOGIES_PARAM_ID)
    @Override
    public Technology getById(@PathVariable Long id) {
        return technologyService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(PATH_TECHNOLOGIES)
    @Override
    public Technology post(@RequestBody Technology object) {
        return technologyService.save(object);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(PATH_TECHNOLOGIES_PARAM_ID)
    @Override
    public Technology put(@PathVariable Long id, @RequestBody Technology object) {
        return technologyService.update(object);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping(PATH_TECHNOLOGIES_PARAM_ID)
    public Technology patchByName(@PathVariable Long id, @RequestBody String technologyName) {
        return technologyService.updateName(id, technologyName);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(PATH_TECHNOLOGIES_PARAM_ID)
    @Override
    public void deleteById(@PathVariable Long id) {
        technologyService.deleteById(id);
    }
}
