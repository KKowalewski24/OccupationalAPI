package pl.kkowalewski.occupationalapi.service.developer;

import pl.kkowalewski.occupationalapi.model.entity.developer.Developer;
import pl.kkowalewski.occupationalapi.service.BaseService;

public interface DeveloperService extends BaseService<Developer> {

    Developer findByFirstName(String firstName);

    Developer findByLastName(String lastName);

    Developer findByFullName(String firstName, String lastName);
}
