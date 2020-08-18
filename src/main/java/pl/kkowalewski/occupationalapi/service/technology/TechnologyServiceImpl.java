package pl.kkowalewski.occupationalapi.service.technology;

import org.springframework.stereotype.Service;
import pl.kkowalewski.occupationalapi.exception.service.TechnologyNotFoundException;
import pl.kkowalewski.occupationalapi.model.Type;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.repository.TechnologyRepository;
import pl.kkowalewski.occupationalapi.service.developer.DeveloperService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    /*------------------------ FIELDS REGION ------------------------*/
    private final TechnologyRepository technologyRepository;
    private final DeveloperService developerService;

    /*------------------------ METHODS REGION ------------------------*/
    public TechnologyServiceImpl(TechnologyRepository technologyRepository,
                                 DeveloperService developerService) {
        this.technologyRepository = technologyRepository;
        this.developerService = developerService;
    }

    @Override
    public Technology findByName(String name) {
        Optional<Technology> technology = technologyRepository.findByName(name);

        if (technology.isEmpty()) {
            throw new TechnologyNotFoundException();
        }

        return technology.get();
    }

    @Override
    public Technology findByType(Type type) {
        Optional<Technology> technology = technologyRepository.findByType(type);

        if (technology.isEmpty()) {
            throw new TechnologyNotFoundException();
        }

        return technology.get();
    }

    @Override
    public Technology findById(Long id) {
        Optional<Technology> technology = technologyRepository.findById(id);

        if (technology.isEmpty()) {
            throw new TechnologyNotFoundException();
        }

        return technology.get();
    }

    @Override
    public Set<Technology> findAll() {
        return StreamSupport
                .stream(technologyRepository.findAll().spliterator(), false)
                .collect(Collectors.toCollection(HashSet::new));
    }

    @Override
    public Technology save(Technology object) {
        return technologyRepository.save(object);
    }

    @Override
    public Technology update(Technology object) {
        return technologyRepository.save(object);
    }

    @Override
    public Technology updateName(Long id, String name) {
        Technology technology = findById(id);
        technology.setName(name);

        return update(technology);
    }

    @Override
    public void deleteById(Long id) {
        Technology technology = findById(id);
        deleteTechnologyDeveloper(technology);
        technologyRepository.deleteById(id);
    }

    @Override
    public void delete(Technology object) {
        Technology technology = findById(object.getId());
        deleteTechnologyDeveloper(technology);
        technologyRepository.delete(object);
    }

    @Override
    public void deleteAll() {
        developerService.deleteAll();
        technologyRepository.deleteAll();
    }

    private void deleteTechnologyDeveloper(Technology technology) {
        developerService.deleteById(technology.getDeveloper().getId());
    }
}
