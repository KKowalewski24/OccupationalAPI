package pl.kkowalewski.occupationalapi.service.technology;

import pl.kkowalewski.occupationalapi.model.Type;
import pl.kkowalewski.occupationalapi.model.base.Technology;
import pl.kkowalewski.occupationalapi.service.BaseService;

public interface TechnologyService extends BaseService<Technology> {

    Technology findByName(String name);

    Technology findByType(Type type);

    Technology updateName(Long id, String name);
}
