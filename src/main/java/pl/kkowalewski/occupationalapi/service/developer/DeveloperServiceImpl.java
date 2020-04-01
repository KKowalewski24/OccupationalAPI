package pl.kkowalewski.occupationalapi.service.developer;

import org.springframework.stereotype.Service;
import pl.kkowalewski.occupationalapi.exception.service.DeveloperNotFoundException;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;
import pl.kkowalewski.occupationalapi.repository.DeveloperRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    /*------------------------ FIELDS REGION ------------------------*/
    private final DeveloperRepository developerRepository;

    //TODO ADD IMPL
    /*------------------------ METHODS REGION ------------------------*/
    public DeveloperServiceImpl(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    @Override
    public Developer findByFirstName(String firstName) {
        Optional<Developer> developer = developerRepository.findByFirstName(firstName);

        if (developer.isEmpty()) {
            throw new DeveloperNotFoundException();
        }

        return developer.get();
    }

    @Override
    public Developer findByLastName(String lastName) {
        Optional<Developer> developer = developerRepository.findByLastName(lastName);

        if (developer.isEmpty()) {
            throw new DeveloperNotFoundException();
        }

        return developer.get();

    }

    @Override
    public Developer findByFullName(String firstName, String lastName) {
        Optional<Developer> developer = developerRepository
                .findByFirstNameAndLastName(firstName, lastName);

        if (developer.isEmpty()) {
            throw new DeveloperNotFoundException();
        }

        return developer.get();

    }

    @Override
    public Developer findById(Long id) {
        Optional<Developer> developer = developerRepository.findById(id);

        if (developer.isEmpty()) {
            throw new DeveloperNotFoundException();
        }

        return developer.get();

    }

    @Override
    public Set<Developer> findAll() {
        return null;
    }

    @Override
    public Developer save(Developer object) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Developer object) {

    }

    @Override
    public void deleteAll() {

    }
}
    