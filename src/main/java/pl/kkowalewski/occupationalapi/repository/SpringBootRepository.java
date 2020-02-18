package pl.kkowalewski.occupationalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kkowalewski.occupationalapi.model.entity.technology.SpringBoot;

@Repository
public interface SpringBootRepository extends CrudRepository<SpringBoot, Long> {

}
