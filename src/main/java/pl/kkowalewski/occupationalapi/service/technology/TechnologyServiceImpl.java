package pl.kkowalewski.occupationalapi.service.technology;

import org.springframework.stereotype.Service;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.repository.TechnologyRepository;

import java.util.Set;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    /*------------------------ FIELDS REGION ------------------------*/
    private final TechnologyRepository technologyRepository;

    //TODO ADD IMPL
    /*------------------------ METHODS REGION ------------------------*/
    public TechnologyServiceImpl(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    @Override
    public Technology findById(Long id) {
        return null;
    }

    @Override
    public Set<Technology> findAll() {
        return null;
    }

    @Override
    public Technology save(Technology object) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Technology object) {

    }

    @Override
    public void deleteAll() {

    }
}
    