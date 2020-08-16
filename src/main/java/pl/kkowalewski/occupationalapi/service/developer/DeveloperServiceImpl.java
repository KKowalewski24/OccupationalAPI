package pl.kkowalewski.occupationalapi.service.developer;

import org.springframework.stereotype.Service;
import pl.kkowalewski.occupationalapi.exception.service.DeveloperNotFoundException;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;
import pl.kkowalewski.occupationalapi.repository.ClientRepository;
import pl.kkowalewski.occupationalapi.repository.DeveloperRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    /*------------------------ FIELDS REGION ------------------------*/
    private final ClientRepository clientRepository;
    private final DeveloperRepository developerRepository;

    /*------------------------ METHODS REGION ------------------------*/
    public DeveloperServiceImpl(ClientRepository clientRepository,
                                DeveloperRepository developerRepository) {
        this.clientRepository = clientRepository;
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
        return StreamSupport
                .stream(developerRepository.findAll().spliterator(), false)
                .collect(Collectors.toCollection(HashSet::new));
    }

    @Override
    public Developer save(Developer object) {
        return developerRepository.save(object);
    }

    @Override
    public Developer update(Developer object) {
        return developerRepository.save(object);
    }

    @Override
    public void deleteById(Long id) {
        developerRepository.deleteById(id);
    }

    @Override
    public void delete(Developer object) {
        developerRepository.delete(object);
    }

    @Override
    public void deleteAll() {
        developerRepository.deleteAll();
    }
}
