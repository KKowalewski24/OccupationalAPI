package pl.kkowalewski.occupationalapi.loader;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.kkowalewski.occupationalapi.model.base.Type;
import pl.kkowalewski.occupationalapi.model.entity.technology.AspNetCore;
import pl.kkowalewski.occupationalapi.model.entity.technology.React;
import pl.kkowalewski.occupationalapi.model.entity.technology.SpringBoot;
import pl.kkowalewski.occupationalapi.repository.TechnologyRepository;

import java.time.LocalDate;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    /*------------------------ FIELDS REGION ------------------------*/
    private final TechnologyRepository technologyRepository;

    /*------------------------ METHODS REGION ------------------------*/
    public DataLoader(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        technologyRepository.save(new React("abc", LocalDate.now(), Type.FRONT_END));
        technologyRepository.save(new SpringBoot("cde", LocalDate.now(), Type.BACK_END));
        technologyRepository.save(new AspNetCore("cde", LocalDate.now(), Type.BACK_END));

        technologyRepository.findAll().forEach((it) -> log.info(it.toString()));
    }
}
    