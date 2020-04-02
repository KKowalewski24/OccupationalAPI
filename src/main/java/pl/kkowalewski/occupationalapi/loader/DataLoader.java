package pl.kkowalewski.occupationalapi.loader;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.kkowalewski.occupationalapi.model.Type;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.model.entity.client.Client;
import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;
import pl.kkowalewski.occupationalapi.model.entity.technology.AspNetCore;
import pl.kkowalewski.occupationalapi.model.entity.technology.React;
import pl.kkowalewski.occupationalapi.model.entity.technology.SpringBoot;
import pl.kkowalewski.occupationalapi.service.BaseService;
import pl.kkowalewski.occupationalapi.service.client.ClientService;
import pl.kkowalewski.occupationalapi.service.developer.DeveloperService;
import pl.kkowalewski.occupationalapi.service.technology.TechnologyService;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    /*------------------------ FIELDS REGION ------------------------*/
    private final ClientService clientService;
    private final DeveloperService developerService;
    private final TechnologyService technologyService;

    /*------------------------ METHODS REGION ------------------------*/
    public DataLoader(ClientService clientService,
                      DeveloperService developerService,
                      TechnologyService technologyService) {
        this.clientService = clientService;
        this.developerService = developerService;
        this.technologyService = technologyService;
    }

    private Client prepareClient(Client client) {
        clientService.save(client);

        return client;
    }

    private Developer prepareDeveloper(Developer developer) {
        developerService.save(developer);

        return developer;
    }

    private Technology prepareTechnology(Technology technology) {
        technologyService.save(technology);

        return technology;
    }

    private <T extends BaseService> void printCollection(T object) {
        object.findAll().forEach((it) -> System.out.println(it.toString()));
        System.out.println(object.findAll().size());
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

        this.<TechnologyService>printCollection(technologyService);
        this.<ClientService>printCollection(clientService);
        this.<DeveloperService>printCollection(developerService);
    }
}
