package pl.kkowalewski.occupationalapi.loader;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import pl.kkowalewski.occupationalapi.model.Type;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;
import pl.kkowalewski.occupationalapi.model.entity.technology.AspNetCore;
import pl.kkowalewski.occupationalapi.model.entity.technology.React;
import pl.kkowalewski.occupationalapi.model.entity.technology.SpringBoot;
import pl.kkowalewski.occupationalapi.repository.ClientRepository;
import pl.kkowalewski.occupationalapi.repository.DeveloperRepository;
import pl.kkowalewski.occupationalapi.repository.TechnologyRepository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    /*------------------------ FIELDS REGION ------------------------*/
    private final ClientRepository clientRepository;
    private final DeveloperRepository developerRepository;
    private final TechnologyRepository technologyRepository;

    /*------------------------ METHODS REGION ------------------------*/
    public DataLoader(ClientRepository clientRepository,
                      DeveloperRepository developerRepository,
                      TechnologyRepository technologyRepository) {
        this.clientRepository = clientRepository;
        this.developerRepository = developerRepository;
        this.technologyRepository = technologyRepository;
    }

    private Client prepareClient(Client client) {
        clientRepository.save(client);

        return client;
    }

    private Developer prepareDeveloper(Developer developer) {
        developerRepository.save(developer);

        return developer;
    }

    private Technology prepareTechnology(Technology technology) {
        technologyRepository.save(technology);

        return technology;
    }

    private <T extends CrudRepository> void printCollection(T repository) {
        repository.findAll().forEach((it) -> System.out.println(it.toString()));
        System.out.println(StreamSupport.stream(repository
                .findAll().spliterator(), false).count());
        System.out.println("--------------------------------------------");
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        prepareTechnology(new React("abc", LocalDate.now(), Type.FRONT_END));
        prepareTechnology(new SpringBoot("cde", LocalDate.now(), Type.BACK_END));
        prepareTechnology(new AspNetCore("cde", LocalDate.now(), Type.BACK_END));

        Developer developer1 = prepareDeveloper(new Developer("Kamil", "Kowalewski",
                LocalDate.of(1990, 12, 24)));

        Client client1 = prepareClient(new Client("aaa", "bbb",
                LocalDate.of(1996, 5, 10), developer1));
        Client client2 = prepareClient(new Client("ccc", "ddd",
                LocalDate.of(1986, 1, 1), developer1));
        Client client3 = prepareClient(new Client("eee", "fff",
                LocalDate.of(1978, 4, 10), developer1));
        Client client4 = prepareClient(new Client("ggg", "hhh",
                LocalDate.of(1969, 9, 21), developer1));

        developer1.setClients(Stream.of(client1, client2, client3, client4)
                .collect(Collectors.toCollection(HashSet::new)));

        this.<CrudRepository>printCollection(technologyRepository);
        this.<CrudRepository>printCollection(clientRepository);
        this.<CrudRepository>printCollection(developerRepository);

    }
}
