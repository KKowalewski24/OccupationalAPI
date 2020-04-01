package pl.kkowalewski.occupationalapi.service.developer;

import org.springframework.stereotype.Service;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;
import pl.kkowalewski.occupationalapi.repository.DeveloperRepository;

import java.util.Set;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    /*------------------------ FIELDS REGION ------------------------*/
    private final DeveloperRepository developerRepository;

    /*------------------------ METHODS REGION ------------------------*/
    public DeveloperServiceImpl(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    @Override
    public Developer findByFirstName(String firstName) {
        return null;
    }

    @Override
    public Developer findByLastName(String lastName) {
        return null;
    }

    @Override
    public Developer findByFullName(String firstName, String lastName) {
        return null;
    }

    @Override
    public Developer findById(Long id) {
        return null;
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
    